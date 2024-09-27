package persistenciadatos;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ManejoArchivos {
    
    public static void crearArchivo(String nombreArchivo){
        File archivo = new File(nombreArchivo);
        
        try {
            PrintWriter salida = new PrintWriter(archivo);
            salida.close();
            System.out.println("Se creo un archivo");
        } catch (FileNotFoundException e) {
           e.printStackTrace(System.out);
        }
    }
}
