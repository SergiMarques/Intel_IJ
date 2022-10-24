import java.util.Scanner;
public class Àrea_Triangle_Quadrat_Pentàgon {
    public static void main(String [] args){
        Scanner src=new Scanner(System.in);
        double base, altura,apotema, resultado;
        int menu;
        System.out.println("Si vols Cuadrat Presioni 1/n Triangle el 2/n Pentagon el 3");
        menu=src.nextInt();
        if (menu == 1) {
            System.out.println("Introduce un lado");
            //Cuadrado
            base= src.nextDouble();
            resultado=(base*base);
            System.out.println("El area del triangulo es: "+resultado+ "metros cuadrados");
        } else if (menu == 2){
            System.out.println("Introduce la base");
            base=src.nextDouble();
            System.out.println("Introduce la altura");
            apotema= src.nextDouble();
            resultado=5*base*apotema/2;
            System.out.println("El area del pentagono es: "+resultado+ "metros cuadrados");
        }
    }
}
