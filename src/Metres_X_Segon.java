import java.util.Scanner;

public class Metres_X_Segon {
    public static void main(String [] args){
        double num1, resultat;
        Scanner src=new Scanner(System.in);
        System.out.println("Introduce tu velocidad en Km/h");
        num1=src.nextDouble();
        resultat=(num1*0.27777);
        System.out.println("La conversión es "+resultat+ "m/s");
    }
}
