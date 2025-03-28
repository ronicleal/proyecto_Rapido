import java.util.Scanner;

public class App {
    private static final SeleccionarCarpeta SeleccionarCarpeta = new SeleccionarCarpeta();
    private static final LecturaDeFichero LecturaDeFichero = new LecturaDeFichero();
    private static final ConversionA ConversionA = new ConversionA();

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int opcion;

        do{
            mostrarMenu();
            opcion = sc.nextInt();







            

        }while(opcion !=0);





    }



    private static void mostrarMenu() {
        System.out.println("\n---Mostrar menú---");
        System.out.println("1. Seleccionar Carpeta ");
        System.out.println("2. Leer Fichero ");
        System.out.println("3. Convertir Datos ");
        System.out.println("0. Salir ");
        System.out.println("Seleccione una opcion: ");

    }






























}

    
