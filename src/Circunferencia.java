import java.util.Scanner;

public class Circunferencia {
    public static void main (String [] args){
        double radio;
        Scanner src=new Scanner(System.in);
        System.out.println("Introduce el radio de la cirucmferencia");
        radio=src.nextDouble();

        CalcularArea(radio);
        CalcularLongitud(radio);

    }
    public static void CalcularArea (double r){
       double area;
        area=Math.PI*Math.pow(r,2);
        System.out.println("El area de la circumferencia es " +area);

    }



    public static void CalcularLongitud (double r){
        double longitud;
        longitud=2*Math.PI*r;
        System.out.println("La longitud de la ciucumferencia es "+longitud);
    }
}
