/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FigurasCode.Figuras2D;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Alumno
 */
public class Circulo extends Figuras2D
{
    private  double radio;
    
    public Circulo(double radio,double x,double y)throws DimensionIncorrectaException, FueraDelPlanoException
    {
        super(x,y);
       if(radio>0){
           
           this.radio=radio;
       }
       else{
           throw new  DimensionIncorrectaException("El Radio no puede ser negativo");
       }
        this.radio=radio;
                
    }
    public double getRadio()
    {
        return radio;
    }

    /**
     *
     * @param radio
     * @throws DimensionIncorrectaException
     */
    public void setRadio(double radio) throws DimensionIncorrectaException
    {
        this.radio=radio;
    }
    public double getX(){
     
    return this.pos.getX();
    }
    public double getY(){
     
    return this.pos.getY();
    }
    public void setY(double y) throws FueraDelPlanoException
    { 
    this.pos.setY(y);
    }
    public void setX(double X) throws FueraDelPlanoException
    {
    this.pos.setX(X);
    }

  
    
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
      
      return "Circulo"+" "+this.id;
  }

    @Override
    protected void CalcularExtremos() {
        try {
            //superior
            new Posicion2D(this.pos.getX()+this.radio,this.pos.getY());
            new Posicion2D(this.pos.getX()-this.radio,this.pos.getY());
            new Posicion2D(this.pos.getY()-this.radio,this.pos.getX());
             new Posicion2D(this.pos.getY()+this.radio,this.pos.getX());
        } catch (FueraDelPlanoException ex) {
            Logger.getLogger(Circulo.class.getName()).log(Level.SEVERE, null, ex);
        }
            
    
   
    }
  
}
