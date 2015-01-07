package compiladordibujos;
import java.awt.Graphics;
import java.util.ArrayList;

class Dibujo{
    //String nombre;
    private ArrayList<Dibujable> dibujables;
        
    public Dibujo(){
        dibujables= new ArrayList<>();
    }
    public void agregarDibujable(Dibujable d){
        dibujables.add(d); 
    }
    public void dibujar(Graphics g){
        for (Dibujable dibujable : dibujables) {
            dibujable.dibujar(g);
        }
    }
}