package Dato;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class persona {
    private String nombre;
    private int cedula;
    

    public persona(String nombre, int cedula) {
        this.nombre = nombre;
        this.cedula = cedula;

    }

    public void agregar() {
        //Variables to work with files
        String texto;
        String bfRead;
        String listaUsuario = "";
        try {
            try {
                //The file is searched
                try (BufferedReader bf = new BufferedReader(new FileReader("Usuarios.txt"))) {

                    while ((bfRead = bf.readLine()) != null) {
                        texto = bfRead;
                        listaUsuario = texto;
                        String[] listaU = listaUsuario.split(","); 
                        
                }   
            }
            
        } catch (IOException e) {
            System.out.println("No se encontro el archivo" + e);
        }
           
          
          //Object about buffer
          BufferedWriter bw = new BufferedWriter(new FileWriter("Usuarios.txt"));
          bw.write(" ");
          FileWriter write1 = new FileWriter("Usuarios.txt", true);
          
          //In the variable information the user and cedula attributes are saved
          String information = listaUsuario;
          information += this.nombre + " , " ;
          information += String.valueOf(this.cedula +"\r\n");
          String inforUsuario= information;
          write1.write(inforUsuario);
          write1.close();
          
      } //If there is a problem when writing, drop here
      catch (Exception e) {
          System.out.println("Error al escribir");
      }
}
}
