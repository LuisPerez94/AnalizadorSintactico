/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package compiladordibujos;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Manuel Angel Muñoz S
 */
public class CompiladorDibujos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
        JFrame f = new JFrame("Problema 1");
        f.setSize(1000, 600);
        f.setLocation(20, 20);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        PanelDibujo panel;
        
        try {
            /*
            FileWriter prub= new FileWriter("prueba2.txt");
            prub.append("hola");
            prub.close();
            */
            
            text analizador= new text(new InputStreamReader(new FileInputStream("code.txt")));
            Dibujo dib=analizador.Programa();
            panel= new PanelDibujo(dib);
            f.add(panel);    
        } catch (FileNotFoundException ex) {
            Logger.getLogger(CompiladorDibujos.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("error: " + ex);
        } catch (ParseException ex) {
            Logger.getLogger(CompiladorDibujos.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("error: " + ex);
        }
        f.setVisible(true);
    }
    
}

class PanelDibujo extends JPanel{
    Dibujo dibujo;
    public PanelDibujo(Dibujo dib){
        dibujo=dib;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); 
        dibujo.dibujar(g);
    }        
}