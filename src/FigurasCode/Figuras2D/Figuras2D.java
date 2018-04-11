/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FigurasCode.Figuras2D;

import FigurasCode.FigurasGeometricas;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Alumno
 */
public abstract class Figuras2D extends FigurasGeometricas implements Movil{
    Posicion2D pos;
    private static int nroOrden=0;
    public String id;
  public Figuras2D(double x ,double y) throws FueraDelPlanoException
  {
     this.pos=new Posicion2D(x,y);
     nroOrden++;
     id=""+nroOrden;
  }
  public abstract double perimetro();
  protected abstract void CalcularExtremos();
  private void  VerficarSiEstaDentroDelPLano()
  {
     CalcularExtremos();
  }
  @Override
  public abstract double superficie();

    @Override
    public void MoverArriba(double dist) {
       Posicion2D emm=this.pos;
        try{
            this.pos.setY(dist+this.pos.getY());
            this.CalcularExtremos();
           
        } 
        
       catch (FueraDelPlanoException ex) {
           this.pos=emm;
            Logger.getLogger(Figuras2D.class.getName()).log(Level.SEVERE, null, ex);
            
        }
       
              
    }

    @Override
    public void MoverAbajo(double dist)
    {
         Posicion2D emm=this.pos;
        try{
            this.pos.setY(this.pos.getY()-dist);
            this.CalcularExtremos();
           
        } 
        
       catch (FueraDelPlanoException ex) {
           this.pos=emm;
            Logger.getLogger(Figuras2D.class.getName()).log(Level.SEVERE, null, ex);
            
        }
    }

    @Override
    public void MoverDerecha(double dist)  {
        Posicion2D nemm = this.pos;
        try
        {
            this.pos.setX(this.pos.getX()+dist);
            this.CalcularExtremos();
        }
        catch (FueraDelPlanoException ex) {
            this.pos=nemm;
            Logger.getLogger(Figuras2D.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void MoverIzquierda(double dist)  {
          Posicion2D nemm = this.pos;
        try
        {
            this.pos.setX(this.pos.getX()-dist);
            this.CalcularExtremos();
        }
        catch (FueraDelPlanoException ex) {
            this.pos=nemm;
            Logger.getLogger(Figuras2D.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void Mover(double distX, double distY)  {
         Posicion2D nemm = this.pos;
        try
        {
          this.pos.setX(distX);
          this.pos.setY(distY);
            this.CalcularExtremos();
        }
        catch (FueraDelPlanoException ex) {
            this.pos=nemm;
            Logger.getLogger(Figuras2D.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void Mover(Posicion2D pos)  {
       Posicion2D nemm = this.pos;
       this.pos=pos;
       this.CalcularExtremos();
       /*
       comprobar si esto entrega una execpcion
       */
    }
  
}
