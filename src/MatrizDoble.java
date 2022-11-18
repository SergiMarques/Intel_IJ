public class MatrizDoble {

    public static void main(String[] args) {
        final int FILAS = 5;
        final int COLUMNAS = 5;
        int[][] numero2 = new int[FILAS][COLUMNAS];
        int[][] numero = new int[FILAS][COLUMNAS];
        int[][] Sumatorio = new int[FILAS][COLUMNAS];
        System.out.println("Generando 2 matrices 5x5 aleatorias");
        rellenarMatriz(numero, FILAS, COLUMNAS);

        rellenarMatriz(numero2, FILAS, COLUMNAS);

        rellenarMatrizSumatoria(numero, numero2, Sumatorio, FILAS, COLUMNAS);
        mostrarMatriz(numero, FILAS, COLUMNAS);
        mostrarMatriz(numero2, FILAS, COLUMNAS);
        mostrarMatriz(Sumatorio, FILAS, COLUMNAS);

    }

    public static void rellenarMatriz(int[][] lista, int fil, int col) {
        for (int i = 0; i < fil; i++) {
            for (int j = 0; j < col; j++) {
                lista[i][j] = (int) (Math.random() * 10);
            }
        }
    }

    public static void mostrarMatriz(int[][] lista, int fil, int col) {
        for (int j = 0; j < col; j++) {
            for (int i = 0; i < fil; i++) {
                System.out.println(lista[i][j] + "\t");

            }
        }
    }

    public static void rellenarMatrizSumatoria(int[][] lista, int[][] lista2, int[][] lista3, int fil, int col) {
        for (int i = 0; i < fil; i++) {
            for (int j = 0; j < col; j++) {
                lista3[i][j] = lista[i][j] + lista2[i][j];


            }

        }
    }
}