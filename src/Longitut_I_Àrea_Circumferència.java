import java.util.Scanner;

public class Longitut_I_Àrea_Circumferència {
    public static void main (String [] args){
        double radio,longitud,area;
        Scanner src=new Scanner(System.in);
        System.out.println("Introduce el radio de una circunferencia");
        radio=src.nextDouble();
        longitud=(2*Math.PI*radio);
        area=(Math.PI*Math.pow(radio,2));
        System.out.println("La longitud y el area de tu cirucunferencia es "+longitud+ " y "+area);
    }
}
