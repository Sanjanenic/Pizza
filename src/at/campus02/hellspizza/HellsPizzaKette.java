package at.campus02.hellspizza;

public class HellsPizzaKette {
    public  Pizza getPizza(String type){

        if(type.equals("cheese")){
            return new CheesePizza();
        }
        else if(type.equals("salami")){
            return new SalamiPizza();
        }
        else {

            return null;

        }

    }
}
