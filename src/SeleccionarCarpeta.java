import java.io.File;
import java.util.Scanner;

public class SeleccionarCarpeta {
    
    public String seleccionar(Scanner sc) {
        System.out.print("Introduce la ruta de la carpeta: ");
        String carpetaSeleccionada = sc.nextLine();
        File carpeta = new File(carpetaSeleccionada);

        System.out.println("Ruta abosulta de la carpeta: " + carpeta.getAbsolutePath());
        
        if (carpeta.exists() && carpeta.isDirectory()) {
            System.out.println("Carpeta seleccionada: " + carpetaSeleccionada);
            System.out.println("Contenido de la carpeta:");
            for (String archivo : carpeta.list()) {
                System.out.println("- " + archivo);
            }
            return carpetaSeleccionada;
        } else {
            System.out.println("La carpeta no existe o no es válida.");
            return "";
        }
    }
}