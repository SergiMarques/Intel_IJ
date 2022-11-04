import java.util.Scanner;

public class Array_Funciones {
    public static void main (String [] args){
        final int TAMAÑO=10;
        int num[]=new int [TAMAÑO];
        rellenarArray(num);
        mostratArray(num);

    }
    public static void rellenarArray(int lista[]){
        Scanner src=new Scanner(System.in);
        for(int i=0; i<lista.length; i++){
            System.out.println("Introduce un numero");
            String texto=src.next();
        }
    }
    public static void mostratArray (int lista[]){
        for (int i=0; i<lista.length; i++);
    }
}
