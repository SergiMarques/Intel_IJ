import java.util.Scanner;

public class Farenheit {
    public static void  main(String [] args){
        double grados,resultado;
        Scanner src=new Scanner(System.in);
        System.out.println("Intoduce los grados en centigrados");
        grados=src.nextDouble();
        calcularGrados(grados);


    }
    public static void calcularGrados (double g){
        double  resultado=(32+(9*g/5));
        System.out.println("La grados Farenheit son" +resultado);
    }



}
