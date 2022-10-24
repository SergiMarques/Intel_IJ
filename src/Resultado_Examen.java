import java.util.Scanner;

public class Resultado_Examen {
    public static void main (String [] args){
        int nota;
        Scanner src=new Scanner(System.in);
        System.out.println("Introduce tu nota del 0 al 10");
        nota=src.nextInt();

        switch (nota) {
            case 5:
                System.out.println("Suficient");
                break;
            case 6:
                System.out.println("Be");
                break;
            case 7:
                System.out.println("Notable baix");
                break;
            case 8:
                System.out.println("Notable alt");
                break;
            case 9:
                System.out.println("Excel·lent");
                break;
            case 10:
                System.out.println("Matricula d'honor");
                break;
            case 0,1,2,3,4:
                System.out.println("Suspens");
        }




    }
}
