import java.util.Scanner;

public class Array_Con_Suma {
    public static void  main (String [] args){
final int TAMAÑO=5;
int lista []= new int[TAMAÑO];
int resultado=0;
int valor;

        Scanner src=new Scanner(System.in);
        for(int i=0; i<lista.length; i++ ){
            System.out.println("Introduce un numero");
            valor=src.nextInt();
            lista[i]=valor;
                    resultado+=lista[i];
            System.out.println("El resultado es " +resultado);



        }
    }
}
