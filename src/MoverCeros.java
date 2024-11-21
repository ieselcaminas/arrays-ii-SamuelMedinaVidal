import java.util.Arrays;
import java.util.Scanner;

public class MoverCeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];

        rellenarArray(numeros, scanner);
        moverCeros(numeros);

        System.out.println(Arrays.toString(numeros));
        scanner.close();
    }
    public static void rellenarArray(int[] numeros, Scanner scanner) {
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Dime un número para el array: ");
            numeros[i] = scanner.nextInt();
        }
    }
    public static void moverCeros(int[] numeros) {
        int indice = 0;
        //L1lenamos el array únicamente con números que no son 0, jugando con el índice
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] != 0) {
                numeros[indice] = numeros[i];
                indice++;
            }
        }
        //A partir del índice que nos ha quedado, sustituimos el resto de valores por 0
        for (int i = indice; i < numeros.length; i++) {
            numeros[i] = 0;
        }
    }
}
