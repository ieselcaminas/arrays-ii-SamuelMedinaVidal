import java.util.Scanner;

public class Duplicados {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        rellenarArray(numeros);

        int[] duplicados = encontrarDuplicados(numeros);

        System.out.println("Los números duplicados son:");
        for (int i = 0; i < duplicados.length; i++) {
            if (duplicados[i] != 0) {
                System.out.println(duplicados[i]);
            }
        }

    }

    public static void rellenarArray(int[] numeros) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Dime un número para el array: ");
            numeros[i] = scanner.nextInt();
        }
        scanner.close();
    }

    public static int[] encontrarDuplicados(int[] numeros) {
        int[] duplicados = new int[numeros.length];
        int contadorDuplicados = 0;

        for (int j = 0; j < numeros.length; j++) {
            for (int k = j + 1; k < numeros.length; k++) {
                if (numeros[j] == numeros[k]) {
                    boolean yaDuplicado = false;


                    for (int l = 0; l < contadorDuplicados; l++) {
                        if (duplicados[l] == numeros[j]) {
                            yaDuplicado = true;
                            break;
                        }
                    }


                    if (!yaDuplicado) {
                        duplicados[contadorDuplicados] = numeros[j];
                        contadorDuplicados++;
                        break;
                    }
                }
            }
        }
        return duplicados;
    }
}
