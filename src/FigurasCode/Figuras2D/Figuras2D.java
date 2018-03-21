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
public abstract class Figuras2D extends FigurasGeometricas {
    Posicion2D pos;
  public Figuras2D(double x ,double y)throws DimensionIncorrectaException
  {
     this.pos=new Posicion2D(x,y);
  }
  public abstract double perimetro();
  @Override
  public abstract double superficie();
  
}
