import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Comunes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];
        int[] numeros2 = new int[10];

        rellenarArray(numeros, scanner);
        rellenarArray(numeros2, scanner);

        System.out.println("Los números comunes entre los dos arrays son: " + comunes(numeros, numeros2));
        scanner.close();
    }
    public static void rellenarArray(int[] numeros, Scanner scanner) {
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Dime un número para el array: ");
            numeros[i] = scanner.nextInt();
        }
    }
    public static String comunes(int[] numeros, int[] numeros2) {
        Set<Integer> comunes = new HashSet<>(); // Se crea un Set para almacenar los números comunes
        Set<Integer> elementosArray1 = new HashSet<>(); // Se crea un Set para los elementos del primer array

        // Se recorre el primer Array y se almacenan los valores en el Set(Si hay valores repetidos, solo se almacena uno)
        for (int num : numeros) {
            elementosArray1.add(num);
        }

        // Se recorre el segundo Array para encontrar coincidencias con los valores del primero, estas coincidencias se almacenan en un Set
        for (int num : numeros2) {
            if (elementosArray1.contains(num)) {
                comunes.add(num); // Lo añadimos al Set 'comunes'
            }
        }

        // Se devuelve comunes como una cadena de texto
        return comunes.toString();
    }

}
