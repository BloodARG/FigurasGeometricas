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
     * @throws DimensionIncorrectaException
     * @throws FigurasCode.Figuras2D.FueraDelPlanoException
     */
    public Posicion2D(double x ,double y) throws DimensionIncorrectaException , FueraDelPlanoException
    {
        setX(x);
        setY(y); 
    }
    public double getX(){return x;}
    public double getY(){return y;}
    public void setX(double x) throws DimensionIncorrectaException , FueraDelPlanoException
    {
        if(x>=0){
        this.x=x;
        }
        else{throw new DimensionIncorrectaException ("fallo al actualizar la componente x de la posicion");}
    }
    public void setY(double y)throws DimensionIncorrectaException  , FueraDelPlanoException
    {
        if(y>=0)
        {
        this.y=y;
        }
        else{throw new DimensionIncorrectaException("fallo al actualizar la componente y de la posicion");}
    
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
