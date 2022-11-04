import java.util.Scanner;

public class Array_Ejercicio__4 {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.println("Introcude el tamaño del array");
        final int TAMAÑO = src.nextInt();
        int lista []=new int[TAMAÑO];
        int suma=0;
        for (int i=0; i<lista.length; i++) {
            lista[i] = (int) Math.floor(Math.random() * 10);
            System.out.println("El valor es= " + lista[i]);
            suma+= lista[i];
            System.out.println("La posición es= " + (i + 1));
        }
        System.out.println("La suma es: "+ suma);

        }


    }

