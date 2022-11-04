import java.util.Scanner;

public class Array10 {
    public static void main (String [] args){
        final int TAMAÑO=10;
        int lista[]=new int [TAMAÑO];
        Scanner src=new Scanner(System.in);
        for (int i=0; i<lista.length;i++){
            System.out.println("Introduce un numero");
            String texto=src.next();
            lista[i]=Integer.parseInt(texto);//Convierte el String en Entero
            System.out.println("El indice " +i+ " contiene el valor " +lista[1]);
    }
}
}
