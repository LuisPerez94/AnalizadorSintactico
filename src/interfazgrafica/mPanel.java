/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfazgrafica;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 *
 * @author luis
 */
class mPanel extends JPanel{
    private JTextArea write;
    private JTextArea consola;
    private JScrollPane scroll,scroll2;
    private final Font fuente;
    
   
    public mPanel() {
        fuente=new Font("Courier New",Font.BOLD, 18);
        
        addComponentes();
    }

    private void addComponentes() {
        this.setLayout(new BorderLayout());
        
       JPanel panelSur=new JPanel();
       JPanel panelCentro=new JPanel();
       
       panelCentro.setLayout(new BorderLayout());
       panelSur.setLayout(new BorderLayout());
       consola=new JTextArea(5,35);
       consola.setEditable(false);
       consola.setText("Consola");
       consola.setBackground(this.getBackground());
       write=new JTextArea(20,35);
       scroll=new JScrollPane(write); 
       scroll2=new JScrollPane(consola);
      write.setFont(fuente);
      write.setForeground(Color.blue);
       panelCentro.add(scroll,"Center");
       panelSur.add(scroll2,"Center");
       
       this.add(panelCentro,"Center");
       this.add(panelSur,"South");
      
    }

    public JTextArea getWrite() {
        return write;
    }

    public void setWrite(JTextArea write) {
        this.write = write;
    }

    public JTextArea getConsola() {
        return consola;
    }

    public void setConsola(JTextArea consola) {
        this.consola = consola;
    }
    
     
    
}
