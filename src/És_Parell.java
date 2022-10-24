import java.util.Scanner;
public class És_Parell {
    public static void main(String[] args) {
        int numero;
        Scanner src = new Scanner(System.in);
        System.out.println("Introduce un numero");
        numero = src.nextInt();
        if (numero % 2 == 0) {
            System.out.println("Es par");
        } else System.out.println("Es impar");
    }
}
