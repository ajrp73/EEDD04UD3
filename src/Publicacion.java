public abstract class Publicacion { //No se pueden instanciar objetos de una clase abstract
    protected int id;

    public Publicacion(){
        this.id=0;
    }

    public Publicacion(int id){
        this.id=id;
    }

    public String getText(){

        if (this.checkPublicacion()){
            return "id: "+ this.id;
        }else{
            return "id: not defined";
        }
    }

    protected boolean checkPublicacion(){
        return this.id > 0 ;
    }

    public final void resetId(){
        id=0;
    }

    @Override
    public String toString() {
        return "Publicacion{" +
                "id=" + id +
                '}';
    }

    private void addId(int id){ //Sólo es posible utilizar addId dentro de la clase Publicacion
        this.id+=id;
    }


}
