import java.util.Scanner;
public class DobleiTripleDeUnNúmero {
    public static void main (String [] args){
        int num1,resultat1,resultat2;
        Scanner src=new Scanner(System.in);
        System.out.println("Introduce un numero");
        num1=src.nextInt();
        resultat1=num1*2;
        resultat2=num1*3;
        //Puedo ahorrar la variable resultado1 y 2 para multiplicar directamente en la siguiente liniea de codigo
        System.out.println("El doble y triple de tu valor es respectivamente "+resultat1+ " y " +resultat2);
    }
}
