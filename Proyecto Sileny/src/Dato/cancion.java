package Dato;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class cancion {
    private String genero;
    private String cantante;
    private String nombreCancion;
    private int cantidadDiscos;
    
    public cancion (String genero, String cantante, String nombreCancion,int cantidadDiscos) {
    this.genero= genero;
    this.cantante = cantante;
    this.nombreCancion = nombreCancion;
    this.cantidadDiscos = cantidadDiscos;
}
    public void agregarCancion() {
        //Variables to work with files
        String texto;
        String bfRead;
        String listaMusica = "";
        try {
            try {
                //The file is searched
                try (BufferedReader bf = new BufferedReader(new FileReader("Musica.txt"))) {

                    while ((bfRead = bf.readLine()) != null) {
                        texto = bfRead;
                        listaMusica = texto;
                        String[] listaM = listaMusica.split(","); 
                        
                }   
            }
            
        } catch (IOException e) {
            System.out.println("No se encontro el archivo" + e);
        }
           
          
          //Object about buffer
          BufferedWriter bw = new BufferedWriter(new FileWriter("Musica.txt"));
          bw.write(" ");
          FileWriter write1 = new FileWriter("Musica.txt", true);
          
          //In the variable information the user and cedula attributes are saved
          String information = listaMusica;
          information += this.genero + " , ";
          information += this.cantante + " , " ;
          information += this.nombreCancion + " , " ;
          information += String.valueOf(this.cantidadDiscos +"\r\n");
          String inforMusica= information;
          write1.write(inforMusica);
          write1.close();
          
      } //If there is a problem when writing, drop here
      catch (Exception e) {
          System.out.println("Error al escribir");
      }
}
        
}
