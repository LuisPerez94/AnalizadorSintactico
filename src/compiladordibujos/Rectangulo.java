package compiladordibujos;

    
import java.awt.Color;
import java.awt.Graphics;


class Rectangulo implements Dibujable{
	private boolean fondo;
	private int x;
        private int y;
        private int ancho;
        private int alto;
        private Color color;
        public Rectangulo(){
            color=null;
            fondo=false;
            ancho=10; alto=10;
        }
        public Rectangulo(int x, int y, int ancho, int alto){
            this.x=x;
            this.y=y;
            this.ancho=ancho;
            this.alto=alto;
            color=Colores.getColor("negro");
            fondo=false;
        }
        public Rectangulo(int x, int y, int ancho, int alto, boolean f){
            this(x,y,ancho,alto);
            fondo=f;
        }
        public Rectangulo(int x, int y, int ancho, int alto, String color){
            this(x,y,ancho,alto);
            this.color=Colores.getColor(color);
        }
	public void dibujar(Graphics g){
            if(getColor()!=null){
                g.setColor(getColor());
            }
            if(isFondo()){
                g.fillRect(getX(), getY(), getAncho(), getAlto());
            }else{
                g.drawRect(getX(), getY(), getAncho(), getAlto());
            }
	}
	public String codigo(){
            StringBuilder codigo= new StringBuilder();
            /*if(color!=null){
                g.setColor(color);
            }*/
            
            if(isFondo()){
                codigo.append("g.fillRect(");
            }else{
                codigo.append("g.drawRect(");
            }
            codigo.append("g.fillRect(");
            codigo.append(getX()).append(", ").append(getY()).append(", ");
            codigo.append(getAncho()).append(", ").append(getAlto()); 
            codigo.append(");");
            return codigo.toString();
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
     * @return the x
     */
    public int getX() {
        return x;
    }

    /**
     * @param x the x to set
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * @return the y
     */
    public int getY() {
        return y;
    }

    /**
     * @param y the y to set
     */
    public void setY(int y) {
        this.y = y;
    }

    /**
     * @return the ancho
     */
    public int getAncho() {
        return ancho;
    }

    /**
     * @param ancho the ancho to set
     */
    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    /**
     * @return the alto
     */
    public int getAlto() {
        return alto;
    }

    /**
     * @param alto the alto to set
     */
    public void setAlto(int alto) {
        this.alto = alto;
    }

    /**
     * @return the color
     */
    public Color getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = Colores.getColor(color);
    }

}