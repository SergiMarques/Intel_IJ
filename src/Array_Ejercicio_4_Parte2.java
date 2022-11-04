import java.util.Scanner;

public class Array_Ejercicio_4_Parte2 {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.println("Introcude el tamaño del array");
        final int TAMAÑO = src.nextInt();
int num[]=new int [TAMAÑO];
rellenarNumAleatorioArray(num,0,9);
mostrarArray(num);
    }
public static void  rellenarNumAleatorioArray(int lista[], int a,int b){
        for (int i=0; i<lista.length; i++){
            //Geerar el aleatorio y rellenamos
            lista[i]=(int)Math.floor(Math.random()*(a-b)+b);
        }
}
    public static void mostrarArray(int lista[]){
int suma=0;
for (int i=0; i<lista.length; i++){
    suma+=lista[1];
    System.out.println("El indice "+i+" contiene el valor "+lista[i]);
}
        System.out.println("La suma es: "+suma);
    }
}
