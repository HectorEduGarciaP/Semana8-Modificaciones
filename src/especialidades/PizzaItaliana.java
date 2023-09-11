package especialidades;

import pizza.base.Pizza;
import pizza.base.Topping;

public class PizzaItaliana extends Pizza {
    private String salsa;

    public PizzaItaliana(String tamaño, String salsa, Topping... toppings) {
        super("Pizza Italiana", 60, tamaño, toppings);
        this.salsa = salsa;
    }

    public String getSalsa() {
        return salsa;
    }

    public void setSalsa(String salsa) {
        this.salsa = salsa;
    }
}
