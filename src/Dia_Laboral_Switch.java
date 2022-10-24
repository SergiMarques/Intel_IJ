import java.util.Scanner;

public class Dia_Laboral_Switch {
    public static void main (String [] args){
        int dia;
        Scanner src=new Scanner(System.in);
        System.out.println("Introduce el día de la semana en número");
        dia=src.nextInt();

        switch(dia){
            case 1:
                System.out.println("Es dia laboral");
                break;
            case 2:
                System.out.println("Es dia laboral");
                break;
            case 3:
                System.out.println("Es dia laboral");
                break;
            case 4:
                System.out.println("Es dia laboral");
                break;
            case 5:
                System.out.println("Es dia laboral");
                break;
            case 6:
                System.out.println("Dia no laboral");
                break;
            case 7:
                System.out.println("Dia no laboral");
        }
    }
    }
