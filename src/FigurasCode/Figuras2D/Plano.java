/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FigurasCode.Figuras2D;

import FigurasCode.*;
import java.util.ArrayList;
import java.util.TreeMap;

/**
 *
 * @author Alumno
 */
public class Plano 
{
    //private static final ArrayList<FigurasGeometricas> figuras = new ArrayList();
    private ArrayList<Circulo> circulos = new ArrayList();
    private ArrayList<Rectangulo> rectan =new ArrayList();
    private ArrayList<Figuras2D>  fig =new ArrayList();
    public Plano()
    {
        circulos.clear();
        rectan.clear();
        fig.clear();
    }
    public static void main(String[] args) {
        try{
            /*
        Canvas nani = new Canvas("Windows 10",640,480,new Color(255,255,255));
        CirculoG cirulin = new CirculoG();
        nani.setCanvas(nani);
        cirulin.setCanvas(nani);
        cirulin.hacerVisible();
        nani.setVisible(true);
       //plan.dibujAR();      
      */
            Circulo circulo = new Circulo(10,10,100);
        }
        catch(Exception e)
        {
            System.out.print(" errores "+e.toString());
        }

    }
        
    /**
     *
     * @param 
     */
    public ArrayList<Figuras2D>OrdenarPorSuperficie()
    {
        TreeMap<Double,Figuras2D> nani = new TreeMap<>();
        if(!(fig==null)){
            fig.forEach(k -> { 
                nani.put(k.superficie(), k);              
            } );
        }
       
        
        return new ArrayList<Figuras2D>(nani.values());
    }
    public ArrayList<Figuras2D>OrdenarPorPerimetro()
    {
        TreeMap<Double,Figuras2D> nani = new TreeMap<>();
        if(!(fig==null)){
            fig.forEach(k -> { 
                nani.put(k.perimetro(), k);              
            } );
        }
        return new ArrayList<Figuras2D>(nani.values());
    }    
   
    void addCirculo(Circulo circulito)
    { 
        if(!(circulito!=null))
        {
          fig.add(circulito);
        circulos.add(circulito);
        }
        else
        {
             System.out.println("el elemento no existe o es nulo ");
        }
      
    }
    void addRectangulo(Rectangulo rectangulito)
    {
         if(!(rectangulito!=null))
        {
          fig.add(rectangulito);
        rectan.add(rectangulito);
        }
        else
        {
             System.out.println("el elemento no existe o es nulo ");
        }
    }
    boolean Solapamiento(Circulo f1,Circulo f2)
    {
       double nani = f1.pos.distancia(f2.pos);
       if(f1.getRadio()+f2.getRadio()>nani)
       {
       return false;
       }
       else
       {
        return true;   
       }
    }
    /**
     * 
     * @param f1 es un rectangulo
     * @param f2 es un rectangulo
     * @return si o no si f1 o f2 se inteceptan
     */
    boolean Solapamiento(Rectangulo f1,Rectangulo f2)
    {
        double _xdelado1=0;
        double _ydelado1=0;
       /*
        _xdelado1= f1.pos.getX()*2;
       _ydelado1=f1.pos.getY()*2;
        */
       _xdelado1=f1.getLado1();
       _ydelado1=f1.getLado2();
       
        
        return false ; 
    }
    //casos especiales
    
}
