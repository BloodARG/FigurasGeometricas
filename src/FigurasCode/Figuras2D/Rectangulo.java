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
        if(lado1>0 && lado2>0)
        {
        this.lado1=lado1;
        this.lado2=lado2; 
        }
        else
        {
          throw  new DimensionIncorrectaException("no puede tener lados negativos")    ;
        }
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

    @Override
    protected void CalcularExtremos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
