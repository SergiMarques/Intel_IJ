public class MatrizDoble {

    public static void main(String[] args) {
        final int FILAS = 5;
        final int COLUMNAS = 5;
        int[][] numero = new int[FILAS][COLUMNAS];
        System.out.println("Generando 2 matrices 5x5 aleatorias");
        rellenarMatriz(numero, FILAS, COLUMNAS);
        mostrarMatriz(numero, FILAS, COLUMNAS);

        segundaMatriz(numero2,FILAS2,COLUMNAS2);
        terceraMatriz(resultado);
    }

    public static void rellenarMatriz(int[][] lista, int fil, int col) {
        for (int i = 0; i < fil; i++) {
            //se puede usar lista.length
            for (int j = 0; j < col; j++) {
                //se puede usar lista.length
                lista[i][j] = (int) (Math.random() * 10);
            }
        }
    }

    public static void mostrarMatriz(int[][] lista, int fil, int col) {
        int suma=0;
        for (int j = 0; j < col; j++) {
            for (int i = 0; i < fil; i++) {
                System.out.println(lista[i][j] + "\t");
                suma+=lista[i][j];
            }
        }
        System.out.println(suma);
    }
    public static void segundaMatriz(int[][] lista, int fil2, int col2) {
    }



    public static void terceraMatriz(int[][]lista, resultado){

    }
}
