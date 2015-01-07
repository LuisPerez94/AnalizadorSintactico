/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package compiladordibujos;

import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author Manuel Angel Muñoz S
 */
public class PanelDibujo extends JPanel{
    private Dibujo dibujo;
    public PanelDibujo(Dibujo dib){
        dibujo=dib;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); 
        getDibujo().dibujar(g);
    }        

    /**
     * @return the dibujo
     */
    public Dibujo getDibujo() {
        return dibujo;
    }

    /**
     * @param dibujo the dibujo to set
     */
    public void setDibujo(Dibujo dibujo) {
        this.dibujo = dibujo;
    }
}