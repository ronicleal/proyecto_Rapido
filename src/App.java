import java.util.Scanner;

public class App {
    private static final SeleccionarCarpeta seleccionarCarpeta = new SeleccionarCarpeta();
    private static final LecturaDeFichero lecturaDeFichero = new LecturaDeFichero();
    private static final ConversionA conversionA = new ConversionA();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            mostrarMenu();
            opcion = sc.nextInt();
            sc.nextLine(); 

            switch (opcion) {
                case 1:
                    manejarSeleccionDeCarpeta(sc);
                    break;
                case 2:
                    manejarLecturaDeFichero(sc);
                    break;
                case 3:
                    manejarConversion(sc);
                    break;
                case 0:
                    System.out.println("Saliendo de la aplicación...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 0);

        sc.close();
    }

    private static void mostrarMenu() {
        System.out.println("\n--- Menú Principal ---");
        System.out.println("1. Seleccionar Carpeta");
        System.out.println("2. Leer Fichero");
        System.out.println("3. Convertir Datos");
        System.out.println("0. Salir");
        System.out.print("Seleccione una opción: ");
    }

    private static void manejarSeleccionDeCarpeta(Scanner sc) {
        String carpetaSeleccionada = seleccionarCarpeta.seleccionar(sc);
        if (!carpetaSeleccionada.isEmpty()) {
            System.out.println("Carpeta seleccionada: " + carpetaSeleccionada);
        } else {
            System.out.println("No se seleccionó ninguna carpeta.");
        }
    }

    private static void manejarLecturaDeFichero(Scanner sc) {
        System.out.print("Ingrese la ruta de la carpeta: ");
        String carpetaSeleccionada = sc.nextLine();
        String archivoSeleccionado = lecturaDeFichero.leer(carpetaSeleccionada, sc);
        if (archivoSeleccionado != null && !archivoSeleccionado.isEmpty()) {
            System.out.println("Datos leídos con éxito.");
        } else {
            System.out.println("No se pudo leer el fichero.");
        }
    }

    private static void manejarConversion(Scanner sc) {
        System.out.print("Ingrese la ruta de la carpeta para la conversión: ");
        String carpetaSeleccionada = sc.nextLine();
        String datos = "datos de ejemplo"; 
        conversionA.convertir(sc, datos, carpetaSeleccionada);
        System.out.println("Conversión realizada con éxito.");
    }
}