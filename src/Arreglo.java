import java.util.Scanner;

public class Arreglo {
    private static final int MAX = 20;
    private String[] array = new String[MAX];
    private int length = 0;

    private Scanner scanner = new Scanner(System.in);

    public  void InsertarArreglo(){
        if (length >= MAX) {
            System.out.println("El arreglo está lleno.");
            return;
        }

        System.out.print("Ingresa la letra a insertar: ");
        String letter = scanner.next();
        int index = 0;
        while (index < length && OrdenMayusMin(letter).compareTo(OrdenMayusMin(array[index])) > 0) {
            index++;
        }

        for (int i = length; i > index; i--) {
            array[i] = array[i - 1];
        }
        array[index] = letter;
        length++;
        System.out.println("Letra insertada en la posición: " + index);
    }

    private String OrdenMayusMin(String letra) {
        return letra.toUpperCase() + letra;
    }

    private String prioritizeOrder(String letter) {
        return letter.toUpperCase() + letter;
    }

    public void BuscarArreglo(){
        System.out.println("Letra que deseas buscar: ");
        String LetraBuscada = scanner.next();
        int ii = -1;
        for (int i = 0; i < length; i++){
            if(array[i].equals(LetraBuscada)){
                ii = i;
                break;
            }
        }
        if(ii != -1){
            System.out.println("Letra encontrada en la posicion: " + ii);
        }else{
            System.out.println("Letra no encontrada");
        }
    }
}
