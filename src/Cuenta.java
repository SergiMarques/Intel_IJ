public class Cuenta {
    private String titular;
    private double cantidad;


    //Creamos contructor
    public Cuenta(){

    }
    //Creamos objeto
    public Cuenta(Cuenta c){
        this.titular=c.titular;
        this.cantidad=c.cantidad;

    }
    public Cuenta (String titular) {
        this.titular = titular;
        this.cantidad = 0;
    }
    public Cuenta (String titular, double cantidad){
        this.titular=titular;
        //
        if (cantidad<0){
this.cantidad=0;
        }
        else{
            this.cantidad=cantidad;
        }
    }
    public String getTitular(){
    return titular;
    }
    public void setTitular (String titular){
        this.titular=titular;
        }
        public void setCantidad (double cantidad){
        this.cantidad=cantidad;
        }
public double getCantidad (){
    return cantidad;
}

        public void ingresar (double cantidad){
        if (cantidad>0){
            this.cantidad+=cantidad;
        }
        }
        public void retirar (double cantidad){
            if (this.cantidad - cantidad < 0) {
                this.cantidad=0;
            }
            else{
                this.cantidad-=cantidad;
            }
            }
            @Override
        public String toString(){
        return "El titular "+ titular + "tiene"+ cantidad+ " euros en la cuenta";
        }
    }