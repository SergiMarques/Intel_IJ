import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        double valor1, valor2, result=0;
        Scanner src = new Scanner(System.in);
        System.out.println("Introduce el operador");
      String operador=src.next();

        System.out.println("Introduce el primer operando");
        valor1 = src.nextDouble();
        System.out.println("Escribe el segundo operando");
        valor2= src.nextDouble();

        switch (operador) {
            case "+":
               result=valor1+valor2;
                break;
            case"-":
                result=valor1-valor2;
                break;
            case"*":
                    result=valor1*valor2;
                    break;
            case"/":
                result=valor1/valor2;
                break;

            default:
                System.out.println("Error");
        }
        System.out.println(result);
    }
}