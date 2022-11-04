import java.util.Scanner;

public class Array_valor_max_minimo_posiciones {
    public static void main (String [] args){
        int[] numero=new int[10];
        int minimo=Integer.MAX_VALUE;
                int maximo=Integer.MIN_VALUE;
        Scanner src=new Scanner(System.in);
int posicionMax=0;
int posicionMin=0;
        System.out.println("Introduce los 10 numeros");
        for (int i=0; i<numero.length;i++){
        numero[1]=src.nextInt();
        if (numero[i]<=minimo){
            minimo=numero[i];
            posicionMin=i+1;//Si es para usuario ya que la posicion 0 no suele razonable.
        }
if(numero[i]>=maximo){
maximo=numero[i];
posicionMax=i+1;
    }
}}}