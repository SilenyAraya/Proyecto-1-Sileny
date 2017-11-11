package Dato;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class pelicula {
    private String genero;
    private String autor;
    private String nombrePelicula;
    private int cantidadDiscos;
    
    public pelicula (String genero, String autor, String nombrePelicula, int cantidadDiscos){
        this.genero = genero;
        this.autor = autor;
        this.nombrePelicula = nombrePelicula;
        this.cantidadDiscos = cantidadDiscos;
        
    }
     public void agregarPelicula() {
        //Variables to work with files
        String texto;
        String bfRead;
        String listaPelicula = "";
        try {
            try {
                //The file is searched
                try (BufferedReader bf = new BufferedReader(new FileReader("Pelicula.txt"))) {

                    while ((bfRead = bf.readLine()) != null) {
                        texto = bfRead;
                        listaPelicula = texto;
                        String[] listaM = listaPelicula.split(","); 
                        
                }   
            }
            
        } catch (IOException e) {
            System.out.println("No se encontro el archivo" + e);
        }
           
          
          //Object about buffer
          BufferedWriter bw = new BufferedWriter(new FileWriter("Pelicula.txt"));
          bw.write(" ");
          FileWriter write1 = new FileWriter("Pelicula.txt", true);
          
          //In the variable information the user and cedula attributes are saved
          String information = listaPelicula;
          information += this.genero + " , ";
          information += this.autor + " , " ;
          information += this.nombrePelicula + " , " ;
          information += String.valueOf(this.cantidadDiscos +"\r\n");
          String inforPelicula= information;
          write1.write(inforPelicula);
          write1.close();
          
      } //If there is a problem when writing, drop here
      catch (Exception e) {
          System.out.println("Error al escribir");
      }
}

}
