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
    public double MoverArriba(double dist)throws FueraDelPlanoException ;
    public double MoverAbajo(double dist)throws FueraDelPlanoException ;
    public double MoverDerecha(double dist)throws FueraDelPlanoException ;
    public double MoverIzquierda(double dist)throws FueraDelPlanoException ;
    public double Mover(double distX ,double distY )throws FueraDelPlanoException ;
    public double Mover(double Posicion2d)throws FueraDelPlanoException ;
}
