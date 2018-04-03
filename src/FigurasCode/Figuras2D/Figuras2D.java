/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FigurasCode.Figuras2D;

import FigurasCode.FigurasGeometricas;

/**
 *
 * @author Alumno
 */
public abstract class Figuras2D extends FigurasGeometricas implements Movil{
    Posicion2D pos;
    private static int nroOrden=0;
    public String id;
  public Figuras2D(double x ,double y)throws DimensionIncorrectaException , FueraDelPlanoException
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
    public double MoverArriba(double dist) throws FueraDelPlanoException 
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double MoverAbajo(double dist) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double MoverDerecha(double dist) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double MoverIzquierda(double dist) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double Mover(double distX, double distY) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double Mover(double Posicion2d) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
