import java.io.File;
import java.util.Scanner;

public class LecturaDeFichero {
    
    public String leer(String carpetaSeleccionada, Scanner sc) {
        System.out.print("Dime el nombre del archivo: ");
        String archivoSeleccionado = sc.nextLine();
        File archivo = new File(carpetaSeleccionada, archivoSeleccionado);
        if (archivo.exists()) {
            return archivoSeleccionado;
        } else {
            System.out.println("Lo siento, este archivo no existe ( o no es valido ).");
            return null;
        }
    }
}
