import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ConversionA {

    public void convertir(Scanner sc, String carpetaSeleccionada) {
        

        System.out.println("Selecciona el formato de salida:");
        System.out.println("1. CSV");
        System.out.println("2. JSON");
        System.out.println("3. XML");
        System.out.print("Pon el número del formato de salida: ");
        int formato = sc.nextInt();
       

        System.out.print("Escribe el nombre del archivo de salida (sin extensión): ");
        String nombreSalida = sc.nextLine();

        

     
}

 private void escribirCSV(File archivo, String datos) throws IOException {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(archivo))) {
            String[] lineas = datos.split("\n");
            for (String linea : lineas) {
                bw.write(linea);
                bw.newLine();
            }
        }
    }

    private void escribirJSON(File archivo, String datos) throws IOException {
        
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(archivo))) {
            String[] lineas = datos.split("\n");
            bw.write("[");
            bw.newLine();
            for (int i = 0; i < lineas.length; i++) {
                bw.write("  {");
                bw.newLine();
                bw.write("    \"linea\": \"" + lineas[i] + "\"");
                bw.newLine();
                bw.write("  }");
                if (i < lineas.length - 1) bw.write(",");
                bw.newLine();
            }
            bw.write("]");
        }
    }


}
