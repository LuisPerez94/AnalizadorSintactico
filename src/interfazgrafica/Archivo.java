package interfazgrafica;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Archivo {

    static ArrayList<String> lista = new ArrayList();

    public static ArrayList<String> leerCadenas(String nombre) {

        try {
            BufferedReader archivo = new BufferedReader(new FileReader(nombre));
            String linea = null;
            do {
                linea = archivo.readLine();
                if (linea != null) {
                    lista.add(linea + "\n");
                }
            } while (linea != null);

            archivo.close();
        } catch (IOException e) {
            System.out.println("ERROR " + e);
            System.exit(-1);
        }
        return lista;

    }

    public static void escribirArch(String ruta,ArrayList <String> nombre) throws FileNotFoundException, IOException {

        try {
//Crear un objeto File se encarga de crear o abrir acceso a un archivo que se especifica en su constructor
            File archivo = new File(ruta);

//Crear objeto FileWriter que sera el que nos ayude a escribir sobre archivo
            FileWriter escribir = new FileWriter(archivo, true);

//Escribimos en el archivo con el metodo write
            for (int i = 0; i < nombre.size(); i++) {
                escribir.write(nombre.get(i));
            }

//Cerramos la conexion
            escribir.close();
        } //Si existe un problema al escribir cae aqui
        catch (Exception e) {
            System.out.println("Error al escribir");
        }

    }
}
