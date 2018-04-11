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
public class Posicion2D {
    private double x;
    private double y;
    private static final double limMinX = -1000;
    private static final double limMinY = limMinX;
    private static final double limMaxX=1000;
    private static final double limMaxY=1000;
    /**
     *
     * @param x
     * @param y
     * @throws FigurasCode.Figuras2D.FueraDelPlanoException
     */
    public Posicion2D(double x ,double y)throws FueraDelPlanoException
    {
        setX(x);
        setY(y); 
    }
    public double getX(){return x;}
    public double getY(){return y;}
    public void setX(double x) throws FueraDelPlanoException
    {
       if(x>=limMinX && x<=limMaxX)
            {
              this.x=x;  
            }
    else
      {
            throw new FueraDelPlanoException(" fallo, esta fuera del plano la componente X");    
      }
    }
    public void setY(double y)throws FueraDelPlanoException
    {
      if(y>=limMinY && y<=limMaxY)
            {
              this.y=y;  
            }
    else
      {
                throw new FueraDelPlanoException(" fallo, esta fuera del plano la componente Y");    
      }
    }
    
    public double distancia(Posicion2D pos)
    {
        double a=0,b=0,c=0;
        a=this.x-pos.x;
        b=this.y-pos.y;
        c=Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
        return c;
    }
}
