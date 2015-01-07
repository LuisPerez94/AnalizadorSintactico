/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package compiladordibujos;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author Manuel Angel Muñoz S
 */
public class Circulo implements Dibujable {
    private boolean fondo;
    private int x;
    private int y;
    private int ancho;
    private int alto;
    private Color color;
    public Circulo(){
        color=null;
    }
    @Override
    public void dibujar(Graphics g) {
        if(getColor()!=null){
            g.setColor(getColor());
        }else g.setColor(Color.BLACK);
        if(isFondo()){
            g.fillArc(getX(), getY(), getAncho(), getAlto(), 0, 360);
        }else g.drawArc(getX(), getY(), getAncho(), getAlto(), 0, 360);
    }

    @Override
    public String codigo() {
        StringBuilder codigo= new StringBuilder();
            /*if(color!=null){
                g.setColor(color);
            }*/
            
            if(isFondo()){
                codigo.append("g.fillArc(");
            }else{
                codigo.append("g.drawArc(");
            }
            codigo.append(getX()).append(", ").append(getY()).append(", ");
            codigo.append(getAncho()).append(", ").append(getAlto()); 
            codigo.append("0,360);");
            return codigo.toString();
    }
    public void setRadio(int r){
        alto=r*2;
        ancho=r*2;
    }
    @Override
    public void setX(int x) {
        this.x=x;
    }

    @Override
    public void setY(int y) {
        this.y=y;
    }

    @Override
    public void setColor(String color) {
        this.color= Colores.getColor(color);
    }

    @Override
    public void setAncho(int ancho) {
        this.ancho=ancho;
    }

    @Override
    public void setAlto(int alto) {
        this.alto=alto;
    }

    /**
     * @return the fondo
     */
    public boolean isFondo() {
        return fondo;
    }

    /**
     * @param fondo the fondo to set
     */
    public void setFondo(boolean fondo) {
        this.fondo = fondo;
    }

    /**
     * @return the x position of de center
     */
    public int getX() {
        return x - ancho/2;
    }

    /**
     * @return the y position of the center
     */
    public int getY() {
        return y - alto/2;
    }

    /**
     * @return the ancho
     */
    public int getAncho() {
        return ancho;
    }

    /**
     * @return the alto
     */
    public int getAlto() {
        return alto;
    }

    /**
     * @return the color
     */
    public Color getColor() {
        return color;
    }
    
}
