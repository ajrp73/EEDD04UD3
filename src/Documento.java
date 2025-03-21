public class Documento extends Publicacion implements Mostrable{
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
        if (!super.checkPublicacion()){
            return "id: not defined";
        }else {
            return super.getText() + " doc: " + this.doc;  //super.getText() invoca al método de la superclase
        }
    }
   /* public final void resetId(){ El método resetId no puede ser sobreescrito por estar declarado como final
        super.id=1;
    }*/

    public void resetDoc(){
        super.resetId();  //Sí es posible utilizar el método final
        //super.addId(2); //No es posible utilizar addId porque está definido como private
        doc="";
    }

    public String mostrarColor(){
        return "Color: " + this.doc;
    }

    public String mostrarBN(){
        return "BN: " + this.doc;
    }
}
