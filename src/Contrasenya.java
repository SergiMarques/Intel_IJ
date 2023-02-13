import java.util.Scanner;
public class Contrasenya {
    public static void main(String[] args) {
        //Contador de los maximos fallos que se pueden realizar
        int contador = 3;
        //Boolean sobre si la contraseña introducida es veridica o no
        boolean acertado = false;
        Scanner src = new Scanner(System.in);
        //Sout para que el usuario sepa que introducir
        System.out.println("Escribe la contraseña");
        //El String para definir la contraseña elegida
        String contraseña = "12345678";
        String password;
//Este for indica que si no se hacierta el contador incrementa hasta el maximo de 3
        for (int i = 0; i<contador && !acertado; i++)
        {
            //Otro sout para el resto de los intentos
            System.out.println("Introduce contraseña");
            password = src.next();
            //Este if indica que si la contraseña es la misma que la que se introdujo, el boolean lo cuenta como veridico y se termina el programa
            if (password.equals(contraseña)){
            System.out.println("Enhorabuena");
            acertado = true;
        }
            //Este else simplemente enseña ese texto para que sepas que tienes mas intentos a la hora de fallar
                        else{
            System.out.println("Sigue intentandolo");

        }
        }
    }
}
