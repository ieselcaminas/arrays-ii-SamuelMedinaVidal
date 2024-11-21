public class Tablero {
    public static void main(String[] args) {
        int[][] tablero =
                {{0, 0, 1, 1, 0, 1, 0, 0},
                        {3, 0, 0, 0, 3, 0, 0, 1},
                        {0, 0, 1, 0, 0, 3, 0, 0},
                        {2, 0, 0, 0, 3, 0, 0, 0},
                        {1, 0, 0, 3, 3, 2, 0, 0},
                        {0, 0, 0, 1, 2, 0, 0, 0},
                        {0, 0, 0, 1, 0, 0, 0, 0},
                        {1, 0, 0, 0, 0, 0, 0, 0}};
        transformar(tablero);
    }

    public static void transformar(int[][] tablero) {
        String[][] tablero2 = new String[tablero.length + 1][tablero[0].length + 1];

        for (int j = 0; j < tablero[0].length; j++) {
            tablero2[0][j + 1] = String.valueOf(j + 1);
        }

        for (int i = 0; i < tablero.length; i++) {
            tablero2[i + 1][0] = String.valueOf((char) ('A' + i));

            for (int j = 0; j < tablero[i].length; j++) {
                if (tablero[i][j] == 0) {
                    tablero2[i + 1][j + 1] = ".";
                } else if (tablero[i][j] == 1) {
                    tablero2[i + 1][j + 1] = "+";
                } else if (tablero[i][j] == 2) {
                    tablero2[i + 1][j + 1] = "O";
                } else if (tablero[i][j] == 3) {
                    tablero2[i + 1][j + 1] = "X";
                }
            }
        }
        imprimirMatriz(tablero2);
    }

    public static void imprimirMatriz(String[][] matriz) {
        for (String[] fila : matriz) {
            for (String valor : fila) {
                if (valor == null) {
                    System.out.print(" ");
                } else {
                    System.out.print(valor + " ");
                }
            }
            System.out.println();
        }
    }
}
