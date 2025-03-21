public class Imagen extends Publicacion implements Mostrable{
    String archivo;

    public Imagen(){
        super();
        archivo ="";
    }

    public Imagen(int idp, String archivo){
        super(idp);
        this.archivo =archivo;
    }

    public String getText(){  //Se sobreescribe el método getText heredado de Publicacion
        return super.getText() + " img archivo: " + this.archivo;  //super.getText() invoca al método de la superclase
    }

    public String mostrarColor(){
        return "Color: " + this.archivo;
    }

    public String mostrarBN(){
        return "BN: " + this.archivo;
    }
}
