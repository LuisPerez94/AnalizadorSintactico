
package compiladordibujos;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author Manuel Angel Muñoz S
 */
public class Linea implements Dibujable{
    private int x;
    private int y;
    private int x2;
    private int y2;
    private Color color;
    public Linea(){
        color= null;        
    }
    @Override
    public void dibujar(Graphics g) {
        if(color!=null){
            g.setColor(color);
        }else g.setColor(Color.BLACK);
        g.drawLine(x, y, x2, y2);
        
    }

    @Override
    public String codigo() {
        StringBuilder codigo= new StringBuilder();
        /*if(color!=null){
            g.setColor(color);
        }*/
        codigo.append("g.drawLine(");
        codigo.append(x).append(", ").append(y).append(", ");
        codigo.append(x2).append(", ").append(y2); 
        codigo.append(");");
        return codigo.toString();
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
        this.x2=ancho;
    }

    @Override
    public void setAlto(int alto) {
        this.y2=alto;
    }    
}
