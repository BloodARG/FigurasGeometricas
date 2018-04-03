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
public interface Movil
{    
    public double MoverArriba(double dist);
    public double MoverAbajo(double dist);
    public double MoverDerecha(double dist);
    public double MoverIzquierda(double dist);
    public double Mover(double distX ,double distY );
    public double Mover(double Posicion2d);
}
