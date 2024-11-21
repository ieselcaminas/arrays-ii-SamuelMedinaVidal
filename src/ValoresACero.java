public class ValoresACero {
    public static void main(String[] args) {
        int[][] matriz = {{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 1, 0, 1, 1, 0, 0, 1, 0, 1},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {1, 0, 0, 0, 1, 1, 0, 1, 1, 1},
                {0, 0, 1, 1, 1, 1, 0, 0, 1, 0},
                {0, 1, 0, 1, 1, 0, 0, 0, 0, 1},
                {1, 0, 0, 1, 0, 0, 0, 1, 1, 0},
                {1, 1, 1, 0, 0, 1, 0, 0, 1, 0}};

        imprimirMatriz(matriz);

        int filasConCeros = contarFilasCeros(matriz);
        int columnasConCeros = contarColumnasCeros(matriz);

        System.out.println("Número de filas con todos sus valores a 0: " + filasConCeros);
        System.out.println("Número de columnas con todos sus valores a 0: " + columnasConCeros);
    }

    public static void imprimirMatriz(int[][] matriz) {
        for (int[] fila : matriz) {
            for (int valor : fila) {
                System.out.print(valor + " ");
            }
            System.out.println();
        }
    }

    public static int contarFilasCeros(int[][] matriz) {
        int filasConCeros = 0;
        for (int[] fila : matriz) {
            boolean todosCeros = true;
            for (int valor : fila) {
                if (valor != 0) {
                    todosCeros = false;
                    break;
                }
            }
            if (todosCeros) {
                filasConCeros++;
            }
        }
        return filasConCeros;
    }

    public static int contarColumnasCeros(int[][] matriz) {
        int columnasConCeros = 0;
        for (int j = 0; j < matriz[0].length; j++) {
            boolean todosCeros = true;
            for (int i = 0; i < matriz.length; i++) {
                if (matriz[i][j] != 0) {
                    todosCeros = false;
                    break;
                }
            }
            if (todosCeros) {
                columnasConCeros++;
            }
        }
        return columnasConCeros;
    }
}
