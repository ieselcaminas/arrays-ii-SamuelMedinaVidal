import java.util.Scanner;

public class SegundoMayor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];

        rellenarArray(numeros, scanner);

        int segundoMayor = segundoMasGrande(numeros);

        System.out.println("El segundo mayor es: " + segundoMayor);
        scanner.close();
    }

    public static void rellenarArray(int[] numeros, Scanner scanner) {
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Dime un número para el array: ");
            numeros[i] = scanner.nextInt();
        }
    }

    public static int segundoMasGrande(int[] numeros) {
        int masGrande = Integer.MIN_VALUE;
        int segundoMasGrande = Integer.MIN_VALUE;
        //bucle en el cual el segundoMasGrande obtiene el antiguo valor del más grande y actualizamos el más grande
        for (int numero : numeros) {
            if (numero > masGrande) {
                segundoMasGrande = masGrande;
                masGrande = numero;
            } else if (numero > segundoMasGrande && numero < masGrande) {
                segundoMasGrande = numero;
            }
        }

        if (segundoMasGrande == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("No existe un segundo mayor, todos los números son iguales.");
        }

        return segundoMasGrande;
    }
}
