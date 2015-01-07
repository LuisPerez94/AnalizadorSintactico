package compiladordibujos;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

class Dibujo{
    //String nombre;
    private int alto;
    private int ancho;
    private Color fondo;
    private ArrayList<Dibujable> dibujables;
        
    public Dibujo(){
        alto=1000;
        ancho=1000;
        dibujables= new ArrayList<>();
    }
    public void agregarDibujable(Dibujable d){
        dibujables.add(d); 
    }
    public void dibujar(Graphics g){
        if(getFondo()!=null){
            g.setColor(getFondo());
            g.fillRect(0, 0, getAncho(), getAlto());
            g.setColor(Color.BLACK);
        }
        for (Dibujable dibujable : dibujables) {
            dibujable.dibujar(g);
        }
    }

    /**
     * @return el alto del dibujo
     */
    public int getAlto() {
        return alto;
    }

    /**
     * @param alto el alto del dibujo a asignar
     */
    public void setAlto(int alto) {
        this.alto = alto;
    }

    /**
     * @return el ancho del dibujo
     */
    public int getAncho() {
        return ancho;
    }

    /**
     * @param ancho el ancho del dibujo a asignar
     */
    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    /**
     * @return el color de fondo del dibujo
     */
    public Color getFondo() {
        return fondo;
    }

    /**
     * @param fondo el color de fondo del dibujo
     */
    public void setFondo(String fondo) {
        this.fondo = Colores.getColor(fondo);
    }
}