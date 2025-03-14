public class Documento extends Publicacion{
    String doc;

    public Documento(){
        super();
        doc="";
    }

    public Documento(int idp, String docp){
        super(idp);
        this.doc=docp;
    }

    public String getText(){  //Se sobreescribe el método getText heredado de Publicacion
        return super.getText() + " doc: " + this.doc;  //super.getText() invoca al método de la superclase
    }
}
