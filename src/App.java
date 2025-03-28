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

            switch (opcion) {
                case 1:
                    manejarSeleccionDeCarpeta(sc);
                    break;
            
                default:
                    break;
            }









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

    private static void manejarSeleccionDeCarpeta (Scanner sc){
        String carpetaSelecionada = SeleccionarCarpeta.seleccionar(sc);
        if(!carpetaSelecionada.isEmpty()){
            System.out.println("Carpeta seleccionada :" + carpetaSelecionada);
        }else{
            System.out.println("No se selecciono ninguna carpeta. ");
        }

    }






























}

    
