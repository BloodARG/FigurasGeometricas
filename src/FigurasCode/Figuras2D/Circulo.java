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
public class Circulo extends Figuras2D
{
    private  double radio;
    
    public Circulo(double radio,double x,double y)throws DimensionIncorrectaException ,FueraDelPlanoException
    {
        super(x,y);       
        this.radio=radio;
                
    }
    public double getRadio()
    {
        return radio;
    }
    public void setRadio(double radio)
    {
        this.radio=radio;
    }
    public double getX(){
     
    return this.pos.getX();
    }
    public double getY(){
     
    return this.pos.getY();
    }
    public void setY(double y)throws DimensionIncorrectaException,FueraDelPlanoException
    { 
    this.pos.setY(y);
    }
    public void setX(double X)throws DimensionIncorrectaException,FueraDelPlanoException
    {
    this.pos.setX(X);
    }

    /**
     *
     * @return
     */
  
    
    @Override
  public double perimetro()
    {
    return 2*Math.PI*radio;    
    }
    @Override
  public  double superficie()
  {
      return Math.PI* Math.pow(radio, 2);
  }
     @Override
  public String toString()
  {
      return "Circulo";
  }
  
}
