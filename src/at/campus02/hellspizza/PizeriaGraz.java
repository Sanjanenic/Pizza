package at.campus02.hellspizza;

public class PizeriaGraz extends HellsPizzaKette {
    @Override
    public Pizza getPizza(String type) {
        Pizza p = super.getPizza(type);

        if(p != null) //Kann Kette zubereitern?
            return p;

       else if(type.equals("uhturm") ) {
            return new UhrturmPizza();
        }
        else{
            return  null;
        }

    }
}
