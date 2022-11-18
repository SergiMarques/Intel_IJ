public class Flor {
    private String nombre_comun;
    private String nombre_cientifico;

    //Constructor por defecto
    public Flor (){

    }


    //Constructor de un objeto flor
    public Flor (Flor f){
        this.nombre_cientifico=f.nombre_cientifico;
        this.nombre_comun=f.nombre_comun;
    }
    public void setNombre_comun (String nombre_comun){
        this.nombre_comun=nombre_comun;
    }
    public void setNombre_cientifico(String nombre_cientifico){
        this.nombre_cientifico =nombre_cientifico;
    }
    public String getNombre_comun (){
        return nombre_comun;
    }
}
