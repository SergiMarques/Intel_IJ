public class Factura {
    private double IVA =0.21;
    private String codigo;
    private double cantidad;


    public Factura(){

    }
public Factura (Factura f){
        this.codigo=f.codigo;
        this.cantidad=f.cantidad;
}

    public Factura(String codigo, double cantidad) {
        this.codigo = codigo;
        if (cantidad<0){
            this.cantidad=0;
        }
        else {
            this.cantidad=cantidad;
        }

    }

    public double getCantidad() {
        return cantidad;
    }
    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }


    public String getCodigo() {
        return codigo;

    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public void CalcularFactura(double cantidad){
        if (cantidad>=0){
            this.cantidad=(cantidad*IVA)+cantidad;
        }
    }
    }
