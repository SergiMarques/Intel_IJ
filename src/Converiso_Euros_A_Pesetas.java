import java.awt.*;
import java.util.Scanner;
public class Converiso_Euros_A_Pesetas {
    public static void main(String[] args) {
        double Euros, Pesetas;
        int Menu;
        Scanner src = new Scanner(System.in);
        System.out.println("Si vols Euros presioni 1 i si vols Pesetas presioni 2");
        //Linia de codigo para decir Euros o Pesetas
        Menu = src.nextInt();
        if (Menu == 1) {
            System.out.println("Introduce las pesetas que quiera convertir");
            Pesetas = src.nextDouble();
            Euros = Pesetas / 166.386;
            System.out.println("El total de euros son: " + Euros + "€");
        } else {
            System.out.println("Introduce los euros que quiera convertir");
            Euros = src.nextDouble();
            Pesetas = Euros * 166.386;
            System.out.println("El total de pesetas son: " + Pesetas + "pesetas");
        }
    }
}