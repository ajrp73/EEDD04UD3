public class Imagen extends Publicacion{
    String arhivo;

    public Imagen(){
        super();
        arhivo="";
    }

    public Imagen(int idp, String archivo){
        super(idp);
        this.arhivo=archivo;
    }

    public String getText(){  //Se sobreescribe el método getText heredado de Publicacion
        return super.getText() + " img archivo: " + this.arhivo;  //super.getText() invoca al método de la superclase
    }
}
