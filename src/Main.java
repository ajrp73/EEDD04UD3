public class Main {

    public static void main(String[] args) {

        System.out.println("Hello world!");

        ValorEntero ve1= new ValorEntero(10);
        System.out.println("ve1: " + ve1); //10
        ve1.sumarVe(10);
        System.out.println("ve1: " + ve1); //20
        ve1.sumarVe(10, 10);
        System.out.println("ve1: " + ve1); //40

        ValorEntero ve2 = new ValorEntero(50);

        ValorEntero ve3= ve2.compareVe(ve1);
        System.out.println("ve3: " + ve3); //50

        //Publicacion p1= new Publicacion(); No es posible instanciar por ser Publicacion abstracta
        Documento d1 = new Documento(1, "hola");
        Imagen i1 = new Imagen(2, "a.jpg");


        Publicacion p1= d1;
        Publicacion p2= i1;

        System.out.println("p1: " + p1.getText()); //Polimorfismo
        System.out.println("p2: " + p2.getText());

    }
}