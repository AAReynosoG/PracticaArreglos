import java.util.Scanner;

public class Arreglo {
    private static final int MAX = 20;
    private String[] array = new String[MAX];
    private int length = 0;

    private Scanner scanner = new Scanner(System.in);

    public String[] BorrarArreglo(){
        length = 0;
        return new String[MAX];
    }


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

    public void VerArreglo(){
        for (int i = 0; i < length; i++ ){
            System.out.println(array[i] + "");
        }
        System.out.println();
    }

    public void eliminarLetra() {
        System.out.print("Ingresa la letra a eliminar: ");
        String letra = scanner.next();
        int index = -1;
        for (int i = 0; i < length; i++) {
            if (array[i].equals(letra)) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            System.out.println("Letra no encontrada.");
            return;
        }

        for (int i = index; i < length - 1; i++) {
            array[i] = array[i + 1];
        }
        length--;
        System.out.println("Letra eliminada de la posición: " + index);
    }

    public void ModificarArreglo() {
        System.out.print("Ingresa la letra a modificar: ");
        String letra = scanner.next();
        int index = -1;
        for (int i = 0; i < length; i++) {
            if (array[i].equals(letra)) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            System.out.println("Letra no encontrada.");
            return;
        }

        System.out.print("Ingresa la nueva letra: ");
        String nuevaLetra = scanner.next();
        array[index] = nuevaLetra;
        while (index > 0 && OrdenMayusMin(array[index]).compareTo(OrdenMayusMin(array[index - 1])) < 0) {
            String temp = array[index];
            array[index] = array[index - 1];
            array[index - 1] = temp;
            index--;
        }

        while (index < length - 1 && OrdenMayusMin(array[index]).compareTo(OrdenMayusMin(array[index + 1])) > 0) {
            String temp = array[index];
            array[index] = array[index + 1];
            array[index + 1] = temp;
            index++;
        }

        System.out.println("Letra modificada y ahora se encuentra en la posición: " + index);
    }
}
