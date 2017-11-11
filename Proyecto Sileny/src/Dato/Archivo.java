
package Dato;

import java.io.File;
import java.io.IOException;

public class Archivo {

    public Archivo() {

    }

    public static void crearArchivo() {
        //Files are created if they do not exist
        try {
            File archivo;
            archivo = new File("Login.txt");
            if (archivo.createNewFile()) {
                System.out.println("Se ha creado el archivo");
            }
        } catch (IOException e) {
            System.out.println("No se creo el archivo" + e);
        }
        try {
            File archivo;
            archivo = new File("Usuarios.txt");
            if (archivo.createNewFile()) {
                System.out.println("Se ha creado el archivo");
            }
        } catch (IOException e) {
            System.out.println("No se creo el archivo" + e);
        }
        try {
            File archivo;
            archivo = new File("Musica.txt");
            if (archivo.createNewFile()) {
                System.out.println("Se ha creado el archivo");
            }
        } catch (IOException e) {
            System.out.println("No se creo el archivo" + e);
        }
        try {
            File archivo;
            archivo = new File("Peliculas.txt");
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
