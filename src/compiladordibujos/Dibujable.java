package compiladordibujos;

import java.awt.Graphics;
interface Dibujable{
    public void dibujar(Graphics g);
    public String codigo();
    public void setX(int x);
    public void setY(int y);
    public void setColor(String color);
    public void setAncho(int ancho);
    public void setAlto(int alto);
}