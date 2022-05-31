/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_19_buffers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;
//import java.io.OutputStream;

/**
 *
 * @author invitado
 */
public class EVA3_19_BUFFERS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Definir la ruta}
        Path ruta = Paths.get("C:/Archivos/Texto.txt");
        //Abrimos el archivo
        InputStream abrirArch;
        //OutputStream abrirGuardar;
        //Leemos el archivo
        InputStreamReader leerArch;
        //Convertimos bytes a caracteres
        BufferedReader leerTxt;
        
        try {
            abrirArch = Files.newInputStream(ruta);
            leerArch = new InputStreamReader(abrirArch);
            leerTxt = new BufferedReader(leerArch);
            String linea = leerTxt.readLine();
            while(linea != null){
                System.out.println(linea);
                linea = leerTxt.readLine();
            }
        } catch (IOException ex) {
            Logger.getLogger(EVA3_19_BUFFERS.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}