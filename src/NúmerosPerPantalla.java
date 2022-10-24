import java.util.Scanner;
public class NúmerosPerPantalla {
    public static void main (String [] args){
        int num1, num2;
        Scanner src=new Scanner(System.in);
        System.out.println("Introduce un numero");
        num1=src.nextInt();
        System.out.println("Introduce otro numero");
        num2=src.nextInt();
        System.out.println("Los valores introducidos son "+num1+" y "+num2);
    }
}
