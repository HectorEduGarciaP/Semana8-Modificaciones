package especialidades;

import pizza.base.Pizza;
import pizza.base.Topping;

public class PizzaHawaiana extends Pizza {
    public PizzaHawaiana(String tamaño, Topping... toppings) {
        super("Pizza Hawaiana", 50, tamaño, toppings);
    }

    @Override
    public void preparar() {
        super.preparar();
        System.out.println("Añadiendo piña y jamón.");
    }
}
