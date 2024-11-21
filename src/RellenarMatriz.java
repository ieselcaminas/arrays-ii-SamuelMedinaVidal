import java.util.Arrays;

public class RellenarMatriz {
    public static void main(String[] args) {
        int[][] matriz = new int[10][10];

        rellenarAleatorio(matriz);

        imprimirMatriz(matriz);
    }
    public static void rellenarAleatorio(int[][] matriz) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                matriz[i][j] = (int) (Math.random() * 2);
            }
        }
    }
    public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
                if (j == matriz[i].length - 1) {
                    System.out.println();
                }
            }
        }
    }
}
