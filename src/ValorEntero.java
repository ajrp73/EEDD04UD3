public class ValorEntero {
    private int ve;
    public static final int veCte= 0;
    public ValorEntero() {
        this.ve = 0;
    }
    public ValorEntero(int ve) {  //Los constructores son los primeros métodos sobrecargados
        this.ve = ve;
        // veCte = 2; No es posible modificar el valor de una variable final (constante)
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

    public void sumarVe(int v1, double v2){ //sobrecargar un método consiste en crear un nuevo método con el
        //mismo nombre y diferente lista de parámetros
        this.setVe(this.getVe()+ v1+ (int)v2);
    }


    //Método que devuelva una REFERENCIA (tipo ValorEntero) al objeto ValorEntero con mayor valor de ve
    public ValorEntero compareVe(ValorEntero o){
        if (this.getVe() > o.getVe()){
            return this; //referencia al objeto que recibe la llamada
        }else{
            return o;
        }
    }


}
