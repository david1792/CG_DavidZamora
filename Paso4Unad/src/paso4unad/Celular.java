/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paso4unad;

/**
 *
 * @author Soporte
 */
import com.sun.j3d.loaders.IncorrectFormatException;
import com.sun.j3d.loaders.ParsingErrorException;
import com.sun.j3d.loaders.Scene;
import com.sun.j3d.loaders.objectfile.ObjectFile;
import com.sun.j3d.utils.applet.MainFrame;
import com.sun.j3d.utils.image.TextureLoader;
import com.sun.j3d.utils.universe.SimpleUniverse;
import java.applet.Applet;
import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.GraphicsConfiguration;
import java.io.File;
import java.io.FileNotFoundException;
import java.net.MalformedURLException;
import javax.media.j3d.Alpha;
import javax.media.j3d.Background;
import javax.media.j3d.BoundingSphere;
import javax.media.j3d.BranchGroup;
import javax.media.j3d.Canvas3D;
import javax.media.j3d.DirectionalLight;
import javax.media.j3d.Light;
import javax.media.j3d.RotationInterpolator;
import javax.media.j3d.Transform3D;
import javax.media.j3d.TransformGroup;
import javax.vecmath.AxisAngle4f;
import javax.vecmath.Color3f;
import javax.vecmath.Point3d;
import javax.vecmath.Vector3d;
import javax.vecmath.Vector3f;

public class Celular extends Applet{
    private SimpleUniverse universo = null;
    private Canvas3D lienzo = null;
    
    public Celular(){
        setLayout(new BorderLayout());
        GraphicsConfiguration gc = SimpleUniverse.getPreferredConfiguration();
        lienzo = new Canvas3D(gc);
        add("Center",lienzo);
        universo = new SimpleUniverse(lienzo);
        BranchGroup escena = crearEscenarioGrafico(); 
        universo.addBranchGraph(escena);
    }
    
    private BranchGroup crearEscenarioGrafico(){
        BranchGroup objetoRaiz = new BranchGroup();
        BoundingSphere fronteras = new BoundingSphere(new Point3d(0,0,0),200);
        TextureLoader archivo = new TextureLoader("./src/Resources/Img/FondoCelular.png",this);
        Background fondo = new Background(archivo.getImage());
        fondo.setImageScaleMode(Background.SCALE_FIT_ALL);
        fondo.setApplicationBounds(fronteras);
        objetoRaiz.addChild(fondo);
        objetoRaiz.addChild(modelarObjeto());
        //objetoRaiz.addChild(iluminar());
        return objetoRaiz;
    }
    
    private BranchGroup modelarObjeto(){
        BranchGroup objetoRaiz = new BranchGroup();
        TransformGroup grupo = new TransformGroup();
        Transform3D transformacion3d = new Transform3D();
        transformacion3d.setTranslation(new Vector3d(0.0,-0.2,-1)); //define posicion del objeto
        transformacion3d.setScale(0.005); //define el tamaño del objeto
        grupo.setTransform(transformacion3d);
        TransformGroup producto = new TransformGroup();
        producto.setCapability(TransformGroup.ALLOW_TRANSFORM_WRITE);
        producto.addChild(cargarObjeto("./src/Resources/Img/galaxy_note.obj"));
        
        Alpha alpha = new Alpha(-1,20000);
        
        Transform3D eje = new Transform3D();
        eje.setRotation(new AxisAngle4f(0.0f,0.0f,0.0f,0.0f));
        RotationInterpolator girar = new RotationInterpolator(alpha,producto,eje,0.0f,(float) Math.PI*(6.0f));
        BoundingSphere fronteras = new BoundingSphere(new Point3d(0.0,0.0,0.0),1000.0);
        girar.setSchedulingBounds(fronteras);
        producto.addChild(girar);
        grupo.addChild(producto);
        objetoRaiz.addChild(grupo);
        objetoRaiz.addChild(iluminar());
        objetoRaiz.compile();
        
        return objetoRaiz;
    }
    
    private BranchGroup cargarObjeto(String filename){
        BranchGroup objetoRaiz = new BranchGroup();
        TransformGroup grupo = new TransformGroup();
        ObjectFile cargar = new ObjectFile();
        
        Scene s = null;
        File archivo = new java.io.File(filename);
        
        try {
           s = cargar.load(archivo.toURI().toURL());
        } catch(IncorrectFormatException | ParsingErrorException | FileNotFoundException | MalformedURLException e) {
            System.err.println(e);
            System.exit(1);
        }
        grupo.addChild(s.getSceneGroup());
        objetoRaiz.addChild(grupo);
        objetoRaiz.compile();
        
        return objetoRaiz;
    }
    
    private Light iluminar(){
        DirectionalLight luz = new DirectionalLight(true,new Color3f(1.0f,1.0f,0.9f),new Vector3f(4.0f,-7.0f,-12.0f));
        luz.setInfluencingBounds(new BoundingSphere(new Point3d(),1000.0));
        
        return luz;
    }
    
    public static void main (String[] args){
        Celular ejecutar = new Celular();
        Frame ventana = new MainFrame(ejecutar,854,480);
    }
}
