package FigurasCode.Graficador;

import FigurasCode.Figuras2D.Circulo;
import FigurasCode.Figuras2D.DimensionIncorrectaException;
import java.awt.*;
import java.awt.geom.*;

/**
 * Un c�rculo que puede ser manipulado y que se dibuja a si mismo en un canvas. 
 * 
 * @author  Michael Kolling and David J. Barnes
 * @version 2006.03.30
 * Traducci�n Carlos A. Bart�
 */

public class CirculoG
{
    private Circulo  cir;
    private String color;
    private boolean esVisible;
    
    /**
     * Crear un nuevo c�rculo en la posici�n y el color por defecto. 
     */
    public CirculoG()throws DimensionIncorrectaException
    {
        cir=new Circulo(30,20,60);
        color = "blue";
        esVisible = false;
    }

    /**
     * Hacer visible a este c�rculo. Si ya estaba visible no hace nada.
     */
    public void hacerVisible()
    {
        esVisible = true;
        dibujar();
    }
    
    /**
     * Hacer invisible a este c�rculo. Si ya estaba invisible no hace nada.
     */
    public void hacerInvisible()
    {
        borrar();
        esVisible = false;
    }
    
    /**
     * Mover el c�rculo unos pocos pixeles a la derecha.
     */
    public void moverDerecha()throws DimensionIncorrectaException
    {
        moverHorizontal(20);
    }

    /**
     * Mover el c�rculo unos pocos pixeles a la izquierda.
     */
    public void moverIzquierda()throws DimensionIncorrectaException
    {
        moverHorizontal(-20);
    }

    /**
     * Mover el c�rculo unos pocos pixeles hacia arriba.
     */
    public void moverArriba()throws DimensionIncorrectaException
    {
        moverVertical(-20);
    }

    /**
     * Mover el c�rculo unos pocos pixeles hacia abajo.
     */
    public void moverAbajo()throws DimensionIncorrectaException
    {
        moverVertical(20);
    }

    /**
     * Mover el c�rculo horizontalmente una 'distancia' en pixeles.
     */
    public void moverHorizontal(int distancia)throws DimensionIncorrectaException
    {
        borrar();
        cir.setX(cir.getX()+distancia);
        dibujar();
    }

    /**
     * Mover el c�rculo verticalmente una 'distancia' en pixeles.
     */
    public void moverVertical(int distancia)throws DimensionIncorrectaException
    {
        borrar();
        cir.setY(cir.getY()+distancia);
        dibujar();
    }
    public void setCanvas(Canvas canvas)
    {
     dibujar(canvas);    
    }

    /**
     * Mover lenta y horizontalmente el c�rculo una 'distancia' en pixeles.
     */
    public void moverLentoHorizontal(int distancia)throws DimensionIncorrectaException
    {
        int delta;

        if(distancia < 0) 
        {
            delta = -1;
            distancia = -distancia;
        }
        else 
        {
            delta = 1;
        }

        for(int i = 0; i < distancia; i++)
        {
            cir.setX(cir.getX()+ delta);
            dibujar();
        }
    }

    /**
     * Mover lenta y verticalmente el c�rculo una 'distancia' en pixeles..
     */
    public void moverLentoVertical(int distancia)throws DimensionIncorrectaException
    {
        int delta;

        if(distancia < 0) 
        {
            delta = -1;
            distancia = -distancia;
        }
        else 
        {
            delta = 1;
        }

        for(int i = 0; i < distancia; i++)
        {
            cir.setY(cir.getY()+ delta);
            dibujar();
        }
    }

    /**
     * Cambiar el tama�o a uno nuevo (en pixeles). El tama�o debe ser >= 0.
     */
    public void cambiarTamano(int nuevoDiametro)
    {
        borrar();
        cir.setRadio(nuevoDiametro/2);
        dibujar();
    }

    /**
     * Cambiar el color. Colores v�lidos son: "red", "yellow", "blue", "green",
     * "magenta" y "black".
     */
    public void cambiarColor(String nuevoColor)
    {
        color = nuevoColor;
        dibujar();
    }

    /**
     * Dibujar el c�rculo en la pantalla con las actuales especificacione
     */
    private void dibujar()
    {
        if(esVisible) {
            Canvas canvas = Canvas.getCanvas();
            canvas.dibujar(this, color, new Ellipse2D.Double(this.cir.getX(),this.cir.getY(), 
                                                          this.cir.getRadio()*2, this.cir.getRadio()*2));
            canvas.esperar(10);
        }
    }
     public void dibujar(Canvas canvas)
    {
        if(esVisible) {
            canvas.dibujar(this, color, new Ellipse2D.Double(this.cir.getX(),this.cir.getY(), 
                                                          this.cir.getRadio()*2, this.cir.getRadio()*2));
            canvas.esperar(10);
        }
    }

    /**
     * Borrar el c�rculo en la pantalla.
     */
    private void borrar()
    {
        if(esVisible) {
            Canvas canvas = Canvas.getCanvas();
            canvas.borrar(this);
        }
    }
}
