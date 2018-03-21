/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FigurasCode.Figuras2D;

/**
 *
 * @author Alumno
 */
public class Triangulo extends Figuras2D {
    private double lado1;
    private double lado2;
    private double lado3;
    
    public Triangulo(double lado1 ,double lado2 ,double lado3,double x, double y)throws DimensionIncorrectaException
    {
        
        super(x,y);
        this.lado1=lado1;
        this.lado2=lado2;
        this.lado3=lado3;
    }
     @Override
  public double perimetro()
    {
    return lado1+lado2+lado3;    
    }
    @Override
  public  double superficie()
  {
      double s =perimetro()/2;
      return  Math.sqrt(s*(s-lado1)*(s-lado2)*(s-lado3));
  }
    @Override
  public String toString()
  {
      return "Triangulo";
  }
}
