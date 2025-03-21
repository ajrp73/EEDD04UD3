public class Main {

    public static void main(String[] args) {

        System.out.println("Hello world!");

        ValorEntero ve1= new ValorEntero(10);
        System.out.println("ve1: " + ve1); //10
        ve1.sumarVe(10);
        System.out.println("ve1: " + ve1); //20
        ve1.sumarVe(10, 10);
        System.out.println("ve1: " + ve1); //40
        ve1.sumarVe(2, 8.4);
        System.out.println("ve1: " + ve1); //50

        ValorEntero ve2 = new ValorEntero(50);

        ValorEntero ve3= ve2.compareVe(ve1);
        System.out.println("ve3: " + ve3); //50

        //Publicacion p1= new Publicacion(); No es posible instanciar por ser Publicacion abstracta
        Documento d0 = new Documento();
        System.out.println("d0: " + d0.getText());
        if (d0.checkPublicacion()){ //Es posible acceder a un método protected desde fuera de la clase
            System.out.println("d0: id >0");
        }else{
            System.out.println("d0: id ==0");
        }


        Documento d1 = new Documento(1, "hola");
        Imagen i1 = new Imagen(2, "a.jpg");

        Publicacion p1= d1; //A una referencia a la superclase le podemos asignar referencias a objetos de las subclases
        Publicacion p2= i1;

        System.out.println("p1: " + p1.getText()); //Polimorfismo: Se invoca a getTex de Documento
        System.out.println("p2: " + p2.getText()); //Polimorfismo: Se invoca a getTex de Imagen

        Mostrable []elementos= new Mostrable[4];
        Imagen i2= new Imagen(3, "img3.jpg");
        Documento d2= new Documento(4, "que tal");

        elementos[0]= d1;
        elementos[1]= i1;
        elementos[2]= i2;
        elementos[3]= d2;

        for(Mostrable m: elementos){
            System.out.println(m.mostrarBN());
            System.out.println(m.mostrarColor());
        }


    }
}