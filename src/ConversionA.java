import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ConversionA {

    public void convertir(Scanner sc, String carpetaSeleccionada, String datos) {
        if (datos.isEmpty()) {
            System.out.println("Esta vacio");
            return;
        }

        System.out.println("Selecciona el formato de salida:");
        System.out.println("1. CSV");
        System.out.println("2. JSON");
        System.out.println("3. XML");
        System.out.print("Pon el número del formato de salida: ");
        int formato = sc.nextInt();
        sc.nextLine();

        System.out.print("Escribe el nombre del archivo de salida (sin extensión): ");
        String nombreSalida = sc.nextLine();

        try {
            switch (formato) {

                case 1:
                    nombreSalida += ".csv";
                    escribirCSV(new File(carpetaSeleccionada, nombreSalida), datos);
                    break;
                case 2:
                    nombreSalida += ".json";
                    escribirJSON(new File(carpetaSeleccionada, nombreSalida), datos);
                    break;
                case 3:
                    nombreSalida += ".xml";
                    escribirXML(new File(carpetaSeleccionada, nombreSalida), datos);
                    break;
                default:
                    System.out.println("Formato no válido");
                    return;
            }
            System.out.println("La conversion ha sido realizada con exito. Archivo de salida: " + nombreSalida);
        } catch (IOException e) {
            System.out.println("Error al escribir el archivo: " + e.getMessage());
        }
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
    
    private void escribirXML(File archivo, String datos) throws IOException {

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(archivo))) {
            String[] lineas = datos.split("\n");
            bw.write("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
            bw.newLine();
            bw.write("<datos>");
            bw.newLine();
            
            for (String linea : lineas) {
                bw.write("  <elemento>");
                bw.newLine();
                bw.write("    <linea>" + linea + "</linea>");
                bw.newLine();
                bw.write("  </elemento>");
                bw.newLine();
            }
            bw.write("</datos>");
        }
    }
}


    



