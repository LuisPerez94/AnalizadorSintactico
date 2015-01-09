/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfazgrafica;

import compiladordibujos.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.filechooser.FileNameExtensionFilter;
/**
 *
 * @author luis
 */
class oyenteMenu implements ActionListener {
    private JFrame f;
    text analizador;
    private mPanel panel;
    private FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos de Texto", "txt");
    private JFileChooser jfc;
    private JTextArea consola;
    ArrayList<String> datos;
    String archivoAct;
    PanelDibujo panelDib;
    oyenteMenu(mPanel panel) {
        this.panel = panel;
        consola= panel.getConsola();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String accion = e.getActionCommand();

        switch (accion) {
            case "Guardar":
                System.out.println("Guardar");
                guardarArchivo();
                break;
            case "Salir":
                if (JOptionPane.showConfirmDialog(panel, "Seguro que quieres Salir?") == JOptionPane.OK_OPTION) {
                    System.exit(0);
                }
                break;
            case "Nuevo":
                System.out.println("Nuevo");
                if (JOptionPane.showConfirmDialog(panel, "Seguro que quieres un nuevo archivo, si no has guardado el actual"
                        + " este se perdera..") == JOptionPane.OK_OPTION) {
                    panel.getWrite().setText("");
                    archivoAct=null;
                }
                break;
            case "Abrir":
                System.out.println("Abrir");
                try {
                    jfc = new JFileChooser();
                    jfc.setFileFilter(filter);
                    int opcion = jfc.showOpenDialog(jfc);
                    if (opcion == JFileChooser.APPROVE_OPTION) {
                        String ruta = jfc.getSelectedFile().getPath();
                        datos = Archivo.leerCadenas(ruta);
                        archivoAct=ruta;
                        escrirbir(datos);
                    } else {
                        System.out.println("salio del jfc");
                    }

                } catch (Exception q) {
                    System.out.println("Error" + q);
                }

                break;
            case "Acerca De...":
                System.out.println("AcercaDe");
                JOptionPane.showMessageDialog(panel, "CompiladorDeFiguras \n"
                        + "Creado por : \n"
                        + "Manuel Angel Muñoz Solano \n"
                        + "Luis Angel Perez Muñoz ");
                break;
            case "Compilar":
                System.out.println("Compilar");
                if(archivoAct!=null){
                    guardarArchivo();
                    compilar();
                }else JOptionPane.showMessageDialog(null,
                    "Su archivo no se ha guardado, guardelo primero",
                    "Advertencia", JOptionPane.WARNING_MESSAGE);
                break;
        }
    }

    private void escrirbir(ArrayList<String> datos) {
        for (int i = 0; i < datos.size(); i++) {
            //panel.getWrite().setText(panel.getWrite().getText() + datos.get(i));
            panel.getWrite().append(datos.get(i));
        }
    }

    private void guardarArchivo() {
        try {
            String guarda=null;
            if(archivoAct==null){
                String nombre = "";
                JFileChooser file = new JFileChooser();
                file.showSaveDialog(panel);
                File ar=file.getSelectedFile();
                guarda = (ar!=null)? ar.toString():null;
            } else guarda=archivoAct;
                
                
            if (guarda != null) {
                /*guardamos el archivo y le damos el formato directamente,
                 * si queremos que se guarde en formato doc lo definimos como .doc*/
                String dir= guarda.toString();
                if(!dir.contains(".txt")){
                    dir+=".txt";
                }
                System.out.println("direccion: " + dir);
                archivoAct=dir;
                FileWriter save = new FileWriter(dir);
                save.write(panel.getWrite().getText());
                save.close();
                consola.append("El archivo se a guardado Exitosamente en la direccion " +dir+"\n");
                /*JOptionPane.showMessageDialog(null,
                        "El archivo se a guardado Exitosamente",
                        "Información", JOptionPane.INFORMATION_MESSAGE);*/
            }
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null,
                    "Su archivo no se ha guardado",
                    "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
    }

    private void compilar() {
        try {
            if(f==null)
                f = new JFrame("Dibujo");
            else f.setVisible(false);
            f.setLocation(20, 20);
            //f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            
            if(analizador==null)
                analizador= new text(new InputStreamReader(new FileInputStream(archivoAct)));
            else text.ReInit(new InputStreamReader(new FileInputStream(archivoAct)));
            
            Dibujo dib=analizador.Programa();
            f.setSize(dib.getAncho(), dib.getAlto());
            if(panelDib==null){
                panelDib= new PanelDibujo(dib);
                f.add(panelDib);
            }else panelDib.setDibujo(dib);
            
            f.setVisible(true);
            
            consola.setText("Dibujo compilado correctamente\n");
        } catch (FileNotFoundException ex) {
            //Logger.getLogger(oyenteMenu.class.getName()).log(Level.SEVERE, null, ex);
            consola.append("No se encontro el archivo: " + archivoAct +"\n");
            JOptionPane.showMessageDialog(null,
                    "No se encontro el archivo",
                    "Advertencia", JOptionPane.WARNING_MESSAGE);
        } catch (ParseException ex) {
            //Logger.getLogger(oyenteMenu.class.getName()).log(Level.SEVERE, null, ex);
            consola.append("Error de sintaxis en el token: "+ ex.currentToken +
                    " en linea: " + ex.currentToken.beginLine + " columna: " +ex.currentToken.beginColumn +"\n");
            ex.printStackTrace();
            
        } catch(TokenMgrError ex){
            consola.append("Error lexico: " +ex.toString() +"\n");
        }
    }
}


