/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FigurasCode.Figuras2D;

import FigurasCode.Graficador.Canvas;
import FigurasCode.*;
import FigurasCode.Graficador.CirculoG;
import java.util.ArrayList;
import java.awt.*;

/**
 *
 * @author Alumno
 */
public class Plano 
{
    private static final ArrayList<FigurasGeometricas> figuras = new ArrayList();
    private ArrayList<Circulo> circulos = new ArrayList();
    private ArrayList<Rectangulo> rectan =new ArrayList();
    
    public Plano()
    {
        figuras.clear();
    }
    public static void main(String[] args) {
        try{
        Canvas nani = new Canvas("Windows 10",640,480,new Color(255,255,255));
        CirculoG cirulin = new CirculoG();
        nani.setCanvas(nani);
        cirulin.setCanvas(nani);
        cirulin.hacerVisible();
        nani.setVisible(true);
       //plan.dibujAR();      
      
        }
        catch(Exception e)
        {
            System.out.print(" errores "+e.toString());
        }

    }
    
    private  void dibujAR()
    {
        int b=1;
        int _estecirculo=0;
        for(int i =0 ; i<=2000;i++)
        {            
            if(i==150*b)
            {
                System.out.println();
                b++;
            }
            if(!circulos.isEmpty())
            {
                
               /* if((circulos.get(c-x).pos.getX()*circulos.get(c-x).getRadio()==i)|circulos.get(c-x).pos.getY()*circulos.get(c-x).getRadio()==b)
                {
                    System.out.print('+');
                   
                    continue;
                }
               */
               
                
                
            }
            //x++;
            
            System.out.print('*');
        
        }
        
        
        
    }
    void addFigura(FigurasGeometricas figura)
    {
        figuras.add(figura);
    }
    void addCirculo(Circulo circulito)
    {
        figuras.add(circulito);
    }
    void addRectangulo(Rectangulo rectangulito)
    {
        figuras.add(rectangulito);
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
