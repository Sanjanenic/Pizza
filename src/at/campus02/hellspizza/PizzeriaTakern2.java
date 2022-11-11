package at.campus02.hellspizza;

public class PizzeriaTakern2 extends HellsPizzaKette {
    @Override
    public Pizza getPizza(String type) {
        Pizza p = super.getPizza(type);

        if(p != null) //Kann Kette zubereitern?
            return p;

        else if(type.equals("uhturm") ) {
            return new KleinKleinPizza();
        }
        else{
            return  null;
        }

    }
}

