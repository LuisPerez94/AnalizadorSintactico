/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfazgrafica;

import javax.swing.JFrame;

/**
 *
 * @author luis
 */
public class CompiladorFiguras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame ventanaPrincipal =new JFrame ("Bienvenido al Compilador De Figuras");
        mPanel panel=new mPanel();
        mMenu menu=new mMenu();
        oyenteMenu o =new oyenteMenu(panel);
        
        menu.addEventos(o);
        
        ventanaPrincipal.setSize(400,450);
        ventanaPrincipal.setLocationRelativeTo(null);
        ventanaPrincipal.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        ventanaPrincipal.setResizable(true);
        ventanaPrincipal.add(panel);
        ventanaPrincipal.setJMenuBar(menu);
        ventanaPrincipal.setVisible(true);
        
    }
}
