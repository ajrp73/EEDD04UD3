public class ValorEntero {
    int ve;

    public ValorEntero() {
        this.ve = 0;
    }
    public ValorEntero(int ve) {  //Los constructores son los primeros métodos sobrecargados
        this.ve = ve;
    }

    public int getVe() {
        return ve;
    }

    public void setVe(int ve) {
        this.ve = ve;
    }

    public void sumarVe(int v){
        //this.ve+= v;
        //ve+= v
        this.setVe(this.getVe()+v);
    }

    @Override
    public String toString() {
        return "ValorEntero{" +
                "ve=" + ve +
                '}';
    }

    public void sumarVe(int v1, int v2){ //sobrecargar un método consiste en crear un nuevo método con el
                                         //mismo nombre y diferente lista de parámetros
        this.setVe(this.getVe()+v1+v2);
    }

    //Método que devuelva una REFERENCIA (tipo ValorEntero) al objeto ValorEntero con mayor valor de ve


}
