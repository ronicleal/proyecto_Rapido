import java.io.File;
import java.io.IOException;
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

    public String leerDatos(String carpetaSeleccionada, String archivoSeleccionado) {
        File archivo = new File(carpetaSeleccionada, archivoSeleccionado);
        StringBuilder datos = new StringBuilder();
        try (Scanner fs = new Scanner(archivo)) {
            while (fs.hasNextLine()) {
                datos.append(fs.nextLine()).append("\n");
            }
        } catch (IOException e) {
            System.out.println("Ha habido un error al leer el archivo: " + e.getMessage());
        }

        return datos.toString().trim();
    }
}
