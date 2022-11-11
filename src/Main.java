import at.campus02.hellspizza.Pizza;
import at.campus02.hellspizza.PizeriaGraz;
import at.campus02.hellspizza.PizzeriaTakern2;

public class Main {
    public static void main(String[] args) {


        System.out.println("Weclome in Hells pizza!");

        PizeriaGraz DonAlfredoHellsPizza= new PizeriaGraz();
        DonAlfredoHellsPizza.getPizza("salami");

//       Pizza p0= DonAlfredoHellsPizza("salami");
//        Pizza p1= DonAlfredoHellsPizza("cheese");
//        Pizza p2= DonAlfredoHellsPizza("fahajaj");

        //neue Pizza erstellen
        PizzeriaTakern2 DonAlfredoHellesPizza_Taken2= new PizzeriaTakern2();
        DonAlfredoHellesPizza_Taken2.getPizza("kleinKlein");




    }
}