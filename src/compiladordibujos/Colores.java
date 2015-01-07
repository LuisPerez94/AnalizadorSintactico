package compiladordibujos;

import java.awt.Color;
import java.util.HashMap;

;

/**
 *
 * @author Manuel Angel Muñoz S
 */
public class Colores {

    public static Color getColor(String color){
        color=color.toLowerCase();
        if(color==null){
            return null;
        }
        if(color.equals("rojo")){
            return Color.RED;
        }
        if(color.equals("negro")){
            return Color.BLACK;
        }
        if(color.equals("verde")){
            return Color.GREEN;
        }
        if(color.equals("azul")){
            return Color.BLUE;
        }
        if(color.equals("cyan")){
            return Color.CYAN;
    }
        if(color.equals("gris fuerte")){
            return Color.DARK_GRAY;
    }    
        if(color.equals("gris")){
            return Color.GRAY;
    }        
        if(color.equals("gris claro")){
            return Color.LIGHT_GRAY;
    }        
        if(color.equals("magenta")){
            return Color.MAGENTA;
    }        
        if(color.equals("naranja")){
            return Color.ORANGE;
    }        
        if(color.equals("rosa")){
            return Color.PINK;
    }         
        if(color.equals("blanco")){
            return Color.WHITE;
    }         
        if(color.equals("amarillo")){
            return Color.YELLOW;
    }               
}
}