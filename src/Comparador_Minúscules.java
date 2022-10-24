import org.w3c.dom.ls.LSOutput;

import java.io.IOException;

public class Comparador_Minúscules {
    public static void main(String [] args) throws IOException {
        char car1, car2;
        System.out.println("Introduce un caracter");
        car1 = (char) System.in.read();
        System.in.read();
        System.out.println("Introduce el segundo caracter");
        car2=(char)System.in.read();
        if (Character.isLowerCase(car1)) {
            System.out.println("El primer caracter es Minuscula");
            if (Character.isLowerCase(car2)) {
                System.out.println("El segundo caracter es Minuscula");
            } else {
                System.out.println("El segundo caracter no es Minuscula");
            }
        }
            else if (Character.isLowerCase(car2)) {
                System.out.println("El segon caraceter es Mayuscula");
            } else {
                System.out.println("Cap caracter es minuscula");


            }
        }
}
