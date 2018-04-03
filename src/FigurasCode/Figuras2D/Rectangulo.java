/*+
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FigurasCode.Figuras2D;

/**
 *
 * @author Alumno
 */
public class Rectangulo extends Figuras2D {
    private double lado1;
    private double lado2;
    
    public Rectangulo(double lado1, double lado2,double x,double y)throws DimensionIncorrectaException, FueraDelPlanoException
    {
        
        super(x,y);
        this.lado1=lado1;
        this.lado2=lado2;
        
    }
    public double getLado1()
    {
        return lado1;
    }
    public double getLado2(){
        
        return lado2;
    }
     @Override
  public double perimetro()
    {
    return (lado1+lado2)*2;    
    }
    @Override
  public  double superficie()
  {
      return lado1*lado2;
  }
    
}
