import java.util.Scanner;

public class HundirLaFlota {

    // Método para crear barcos aleatoriamente
    public static void crearBarcos(int numBarcos, int[][] lugaresBarcos) {
        int r1, r2;
        int contador = 0;

        while (contador < numBarcos) {
            r1 = (int) (Math.random() * 8);
            r2 = (int) (Math.random() * 8);
            if (lugaresBarcos[r1][r2] != 1) {
                lugaresBarcos[r1][r2] = 1;
                contador++;
            }
        }
    }

    // Método para mostrar el tablero
    public static String tablero(int[][] tablero) {
        String resultado = "  ";
        String[] numeros = {"1", "2", "3", "4", "5", "6", "7", "8"};
        String[] letras = {"A", "B", "C", "D", "E", "F", "G", "H"};

        for (int k = 0; k < tablero.length; k++) {
            resultado += numeros[k] + " ";
        }
        resultado += "\n";
        for (int i = 0; i < tablero.length; i++) {
            resultado += letras[i] + " ";
            for (int j = 0; j < tablero[i].length; j++) {
                if (tablero[i][j] == 0) {
                    resultado += "  ";
                }
                if (tablero[i][j] == 2) {
                    resultado += "X ";
                }
                if (tablero[i][j] == 3) {
                    resultado += "O ";
                }
            }
            resultado += "\n";
        }
        return resultado;
    }

    // Método para leer la letra de la coordenada
    public static int leerLetra(String letra) {
        letra = letra.toUpperCase();
        switch (letra) {
            case "A": return 0;
            case "B": return 1;
            case "C": return 2;
            case "D": return 3;
            case "E": return 4;
            case "F": return 5;
            case "G": return 6;
            case "H": return 7;
            default: return -1;
        }
    }

    // Método para leer el número de la coordenada
    public static int leerNumero(Scanner scanner) {
        int num;
        while (true) {
            System.out.println("Dime el número (1-8): ");
            num = scanner.nextInt() - 1; // Restar 1 para convertir en índice basado en 0
            if (num >= 0 && num < 8) {
                return num;
            } else {
                System.out.println("Número inválido. Debe ser entre 1 y 8.");
            }
        }
    }

    // Método para procesar un disparo
    public static void procesarDisparo(int fila, int columna, int[][] tablero, int[][] lugaresBarcos,
                                       int[] disparos, int[] barcoshundidos) {
        if (lugaresBarcos[fila][columna] == 1) {
            tablero[fila][columna] = 2; // Barco hundido
            barcoshundidos[0] += 1;
            System.out.println("¡¡Hay un barco en la posición: (" + (char) ('A' + fila) + ", " + (columna + 1) + ").!!");
        } else {
            tablero[fila][columna] = 3; // Disparo fallido
            System.out.println("No hay ningún barco en la posición: (" + (char) ('A' + fila) + ", " + (columna + 1) + ").");
        }
        disparos[0] += 1;
    }

    // Método principal del juego
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] tablero = new int[8][8];
        int[] disparos = {0};
        int[] barcoshundidos = {0};
        int[][] lugaresBarcos = new int[8][8];

        crearBarcos(10, lugaresBarcos);

        while (barcoshundidos[0] != 10) {
            System.out.println(tablero(tablero));
            System.out.println("Disparos: " + disparos[0]);
            System.out.println("Barcos hundidos: " + barcoshundidos[0] + "/10");

            // Leer la letra de la coordenada
            System.out.println("Dime la letra (A-H): ");
            String letra = scanner.nextLine();
            int nletra = leerLetra(letra);
            if (nletra == -1) {
                System.out.println("Letra inválida. Debe ser entre A y H.");
                continue;
            }


            int num = leerNumero(scanner);


            procesarDisparo(nletra, num, tablero, lugaresBarcos, disparos, barcoshundidos);
        }

        System.out.println("¡Felicidades, has hundido todos los barcos!");
    }
}
