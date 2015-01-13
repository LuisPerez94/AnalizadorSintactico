/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compiladordibujos;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

/**
 *
 * @author luis
 */
public class Texto implements Dibujable {
    private String texto;
    private int tam;
    private String fuente;
    private int x;
    private int y;
    private int tipo;
    private Color color;
    public Texto() {
        color=null;
        tipo=0;
    }

    @Override
        public void dibujar(Graphics g) {
        if (color!=null){
            g.setColor(getColor());
        }else g.setColor(Color.BLACK);
        g.setFont(new Font(fuente, Font.PLAIN, tam));
        g.drawString(getTexto(), x, y);
    }

    @Override
    public String codigo() {
      StringBuilder s=new StringBuilder();
      
      s.append("g.drawString(");
      s.append("texto").append(",").append("x").append(",").append("y");
      s.append(");");
      return s.toString();
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setAlto(int alto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getTam() {
        return tam;
    }

    public String getFuente() {
        return fuente;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Color getColor() {
        return color;
    }

    /**
     * @return the texto
     */
    public String getTexto() {
        return texto;
    }

    /**
     * @param texto the texto to set
     */
    public void setTexto(String texto) {
        this.texto = texto;
    }

    /**
     * @param tam the tam to set
     */
    public void setTam(int tam) {
        this.tam = tam;
    }

    /**
     * @param fuente the fuente to set
     */
    public void setFuente(String fuente) {
        this.fuente = fuente;
    }

    /**
     * @return the tipo
     */
    public int getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String t) {        
        if(t.equals("negrita")){
            tipo|=Font.BOLD;
        }
        else if(t.equals("cursiva")){
            tipo|=Font.ITALIC;
        }else tipo=0;
    }
}
