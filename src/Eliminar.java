import java.util.Arrays;
import java.util.Scanner;

public class Eliminar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];

        rellenarArray(numeros, scanner);
        int indice = solicitarIndice(scanner, numeros);

        moverElemento(numeros, indice);

        System.out.println("El array termina así: " + Arrays.toString(numeros));

        scanner.close();
    }
    public static void rellenarArray(int[] numeros, Scanner scanner) {
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Dime un número para el array: ");
            numeros[i] = scanner.nextInt();
        }
    }
    public static int solicitarIndice(Scanner scanner, int[] numeros) {
        System.out.print("Dime el índice del array a eliminar: ");
        int indice = scanner.nextInt();
        while (indice < 0 || indice > numeros.length - 1) {
            System.out.print("Dime el índice del array a eliminar: ");
            indice = scanner.nextInt();
            if (indice < 0 || indice >= numeros.length) {
                System.out.println("El índice no es válido. Inténtalo de nuevo.");
            }
        }
        return indice;
    }
    public static void moverElemento (int[] numeros, int indice) {
        int eliminar = numeros[indice];
        for (int i = indice; i < numeros.length - 1; i++) {
            numeros[i] = numeros[i + 1];
        }
        numeros[numeros.length - 1] = eliminar;
    }
}
