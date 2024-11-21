import java.util.Scanner;

public class SumaIgual {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];

        System.out.println("Dime un número: ");
        int numUsuario = scanner.nextInt();

        rellenarArray(numeros, scanner);

        System.out.println(valoresSuma(numeros, numUsuario));
        scanner.close();
    }

    public static void rellenarArray(int[] numeros, Scanner scanner) {
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Dime un número para el array: ");
            numeros[i] = scanner.nextInt();
        }
    }

    public static String valoresSuma(int[] numeros, int numUsuario) {
        String pares = "";
        boolean haySuma = false;

        for (int i = 0; i < numeros.length; i++) {
            for (int j = i + 1; j < numeros.length; j++) {
                if (numeros[i] + numeros[j] == numUsuario) {
                    pares = "( " + numeros[i] + ", " + numeros[j] + " )";
                    haySuma = true;
                }
            }
        }

        if (haySuma) {
            return "Los pares que suman " + numUsuario + " son: " + pares.toString();
        } else {
            return "No hay una suma posible combinando dos valores del Array.";
        }
    }
}
