import java.util.Scanner;

public class MetreSegon {
    public static void  main(String [] args){
        double velocidad,resultado;
        Scanner src=new Scanner(System.in);
        System.out.println("Intoduce la velocidad en km/h");
        velocidad=src.nextDouble();
calcularVelocidad(velocidad);


    }
    public static void calcularVelocidad (double v){
        double  resultado=v*1000/3600;
        System.out.println("La velocidad introducida en km/h es: "+resultado+ "m/s");
    }


}
