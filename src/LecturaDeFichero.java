import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;


public class LecturaDeFichero {

    public String leer(String carpetaSeleccionada, Scanner sc) {
        System.out.print("Dime el nombre del archivo: ");
        String archivoSeleccionado = sc.nextLine();
        File archivo = new File(carpetaSeleccionada, archivoSeleccionado);

        if (archivo.exists() && archivo.isFile()) {
            StringBuilder contenido = new StringBuilder();

            try(BufferedReader br = new BufferedReader(new FileReader(archivo))){
                String linea;
                while((linea = br.readLine()) != null){
                    contenido.append(linea).append("\n");
                }

            System.out.println("Contenido del archivo:\n" + contenido.toString());
            
            }catch (IOException e){
                System.out.println("Ha habido un error al leer el archivo: " + e.getMessage());
                return null;
            }
            return contenido.toString();
        }else{
            System.out.println("Lo siento, este archivo no existe ( o no es valido ).");
            return null;
        }
       
    }
}
