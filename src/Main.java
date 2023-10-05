import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String opcion;

        do {
            Arreglo array = new Arreglo();

            System.out.println("Menú de Opciones:");
            System.out.println("a).  Borrar arreglo.");
            System.out.println("b).  Mostrar arreglo.");
            System.out.println("c).  Buscar letra.");
            System.out.println("d).  Insertar letra.");
            System.out.println("e).  Eliminar letra.");
            System.out.println("f).  Modificar arreglo.");
            System.out.println("g).  Creditos.");
            System.out.println("z).  Salir.");

            opcion = sc.nextLine();

            switch (opcion){

                case "a":
                    System.out.println("a");
                    System.out.println("Presiona 'Enter' para continuar...");
                    sc.nextLine();
                    break;
                case "b":
                    System.out.println("b");
                    System.out.println("Presiona 'Enter' para continuar...");
                    sc.nextLine();
                    break;
                case "c":
                    array.BuscarArreglo();
                    System.out.println("Presiona 'Enter' para continuar...");
                    sc.nextLine();
                    break;
                case "d":
                    array.InsertarArreglo();
                    System.out.println("Presiona 'Enter' para continuar...");
                    sc.nextLine();
                    break;
                case "e":
                    System.out.println("e");
                    System.out.println("Presiona 'Enter' para continuar...");
                    sc.nextLine();
                    break;
                case "f":
                    System.out.println("f");
                    System.out.println("Presiona 'Enter' para continuar...");
                    sc.nextLine();
                    break;
                case "g":
                    Creditos.creditos();
                    break;

                case "z":
                    System.out.println("Hasta pronto");
                    break;


                default:
                    System.out.println("Opcion no valida valida");
                    break;
            }

        }while (!opcion.equals("z"));
        sc.close();
    }
}


