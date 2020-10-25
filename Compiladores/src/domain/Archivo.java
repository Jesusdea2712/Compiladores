package domain;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Archivo {

    public static String leer(File archivo) {

        String almacenTexto = "";
        try {
            FileReader f = new FileReader(archivo);
            BufferedReader b = new BufferedReader(f);
            String cadena;
            while ((cadena = b.readLine()) != null) {
                almacenTexto += (cadena + "\n");
            }
        } catch (IOException ex) {
            System.out.println("No se ha podido leer el archivo");
        }
        
        return almacenTexto;
    }
    
    public static void guardar(File archivo, String cadena){
        FileWriter ficheroEscritura = null;
        BufferedWriter out;
        try {
            ficheroEscritura = new FileWriter(archivo);
            out = new BufferedWriter(ficheroEscritura);
            PrintWriter pw = new PrintWriter(out);
            pw.println(cadena);
            pw.flush();
        } catch (IOException ex){
            System.out.println("No se ha podido escribir en el archivo");
        }finally{
            try {
              if (null != ficheroEscritura){
                ficheroEscritura.close();
              }
            } catch (IOException ex) {
                Logger.getLogger(Archivo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    

}
