import java.io.IOException;

public class Majúscules_O_Minúscules {
    public static void main (String [] args) throws IOException {
        char car1;
        System.out.println("Introduce una letra");
        car1=(char)System.in.read();
        if (Character.isUpperCase(car1)){
            System.out.println("Mayuscula");
        }
        else {
            System.out.println("Minuscula");
        }
    }
}
