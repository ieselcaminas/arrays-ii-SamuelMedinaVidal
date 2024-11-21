import java.util.Arrays;
import java.util.Scanner;

public class Inverso {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];

        rellenarArray(numeros, scanner);

        int[] ordenInverso = inverso(numeros);

        System.out.println("Array original: " + Arrays.toString(numeros));
        System.out.println("Array en orden inverso: " + Arrays.toString(ordenInverso));

        scanner.close();
    }

    public static void rellenarArray(int[] numeros, Scanner scanner) {
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Dime un número para el array: ");
            numeros[i] = scanner.nextInt();
        }
    }

    public static int[] inverso(int[] numeros) {
        int[] ordenInverso = new int[numeros.length];
        for (int i = 0; i < numeros.length; i++) {
            ordenInverso[i] = numeros[(numeros.length - 1) - i];
        }
        return ordenInverso;
    }
}
