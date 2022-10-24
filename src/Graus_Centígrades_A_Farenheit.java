import java.util.Scanner;

public class Graus_Centígrades_A_Farenheit {
    public static void main (String [] args){
        double num1,resultat1;
        Scanner src=new Scanner(System.in);
        System.out.println("Introduce una temperatura en Grados Celsius");
        num1=src.nextDouble();
        resultat1=(num1*1.8)+32;
        System.out.println("La conversion de Celsius a Farenheit es "+resultat1+ "ªF");

    }

}
