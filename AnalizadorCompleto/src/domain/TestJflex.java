/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author jesus
 */
public class TestJflex {
    
    public static void main(String[] args) throws Exception {
       System.out.println("Generando Archivos Lexers");
        try{
           generar();
        }catch(Exception e){
           throw new Exception("Error al generar Archivo Lexer");
       }
     }
    

    public static void generar() throws IOException, Exception{
        //C:\Users\jesus\Documents\NetBeansProjects\AnalizadorCompleto\src\domain\lex.flex
        String rutaProy = "/Users/jesus/Documents/NetBeansProjects/AnalizadorCompleto";
        String[] ruta1 = {rutaProy+"/src/domain/Lex.flex"};
        String[] ruta2 = {rutaProy+"/src/domain/LexerCup.flex"};
        String[] rutaS = {"-parser", "Sintax", rutaProy+"/src/domain/Sintax.cup"};

        jflex.Main.generate(ruta1);       
        jflex.Main.generate(ruta2);
        java_cup.Main.main(rutaS);
        
        Path rutaSym = Paths.get(rutaProy+"/src/domain/sym.java");
        if (Files.exists(rutaSym)) {
            Files.delete(rutaSym);
        }
        Files.move(
                Paths.get(rutaProy+"/sym.java"), 
                Paths.get(rutaProy+"/src/domain/sym.java")
        );
        Path rutaSin = Paths.get(rutaProy+"/src/domain/Sintax.java");
        if (Files.exists(rutaSin)) {
            Files.delete(rutaSin);
        }
        Files.move(
                Paths.get(rutaProy+"/Sintax.java"), 
                Paths.get(rutaProy+"/src/domain/Sintax.java")
        );
    }
    
    
}
