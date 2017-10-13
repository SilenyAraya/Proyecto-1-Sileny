
package Dato;

import java.io.File;
import java.io.IOException;

public class Archivo {

    public Archivo() {

    }

    public static void crearArchivo() {
        try {
            File archivo;
            archivo = new File("Login.txt");
            if (archivo.createNewFile()) {
                System.out.println("Se ha creado el archivo");
            }
        } catch (IOException e) {
            System.out.println("No se creo el archivo" + e);
        }
    }
    public static void main(String[] args) {
        crearArchivo();
        
    }
}
