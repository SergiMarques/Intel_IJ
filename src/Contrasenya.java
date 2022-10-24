import java.util.Scanner;

public class Contrasenya {
    public static void main(String[] args) {
        int contador = 3;
        boolean acertado = false;
        Scanner src = new Scanner(System.in);
        System.out.println("Escribe la contraseña");
        String contraseña = "12345678";
        String password;

        for (int i = 0; i<contador && !acertado; i++)
        {
            System.out.println("Introduce contraseña");
            password = src.next();
            if (password.equals(contraseña)){
            System.out.println("Enhorabuena");
            acertado = true;
        }
                        else{
            System.out.println("Sigue intentandolo");

        }
        }
    }
}