import java.io.File;
import java.util.Scanner;

public class SeleccionarCarpeta {
    public String seleccionar(Scanner sc) {
        System.out.println("Escribe la ruta de la carpeta: ");
        String carpetaSelecionada = sc.nextLine();
        File carpeta = new File(carpetaSelecionada);
        if (carpeta.exists() && carpeta.isDirectory()) {
            System.out.println("Carpeta seleccionada: " + carpetaSelecionada);
            System.out.println("Contenido de la carpeta:");
            for (String archivo : carpeta.list()) {
                System.out.println("- " + archivo);
            }
            return carpetaSelecionada;
        } else {
            System.out.println("La carpeta no existe o no es válida.");
            return "";
        }

    }

}
