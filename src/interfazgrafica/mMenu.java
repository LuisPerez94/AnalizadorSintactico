/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfazgrafica;

import javax.swing.ImageIcon;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 *
 * @author luis
 */
class mMenu extends JMenuBar{
    
    private JMenuItem guardar,salir,acercade,abrir,nuevo,compilar;

    public mMenu() {
        agregarMenus();
    }

    private void agregarMenus() {
        
        JMenu archivo=new JMenu("Archivo");
        abrir=new JMenuItem("Abrir",new ImageIcon("src/img/open.png"));
        nuevo=new JMenuItem("Nuevo",new ImageIcon("src/img/document_new.png"));
        guardar=new JMenuItem("Guardar",new ImageIcon("src/img/save.png"));
        salir=new JMenuItem("Salir",new ImageIcon("src/img/quit.png"));
        
        JMenu ayuda=new JMenu("Ayuda");
        acercade=new JMenuItem("Acerca De...",new ImageIcon("src/img/get_info.png"));
              
        JMenu proyecto =new JMenu("Proyecto");
        compilar=new JMenuItem("Compilar",new ImageIcon("src/img/run.png"));
        
        
        
        archivo.add(abrir);
        archivo.add(nuevo);
        archivo.add(guardar);
        archivo.add(salir);
         
        proyecto.add(compilar);
        
        ayuda.add(acercade);
        
        this.add(archivo);
        this.add(proyecto);
        this.add(ayuda);
        
        
        
    }
    
    
        public void addEventos(oyenteMenu m){
                abrir.addActionListener(m);
                guardar.addActionListener(m);
                nuevo.addActionListener(m);
                acercade.addActionListener(m);
                salir.addActionListener(m);
                compilar.addActionListener(m);
    
    }
    
    
}
