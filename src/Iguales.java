import java.util.Arrays;
import java.util.Scanner;

public class Iguales {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros1 = new int[10];
        int[] numeros2 = new int[10];

        rellenarArray(numeros1, scanner);
        numeros2 = numeros1.clone();

        System.out.println(iguales(numeros1, numeros2));
        scanner.close();
    }
    public static void rellenarArray(int[] numeros, Scanner scanner) {
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Dime un número para el array: ");
            numeros[i] = scanner.nextInt();
        }
    }
    public static String iguales(int[] numeros1, int[] numeros2) {
       if (Arrays.equals(numeros1, numeros2)) {
           return "Los dos Arrays son iguales.";
       }else {
           return "Los dos Arrays no son iguales.";
       }
    }
}
