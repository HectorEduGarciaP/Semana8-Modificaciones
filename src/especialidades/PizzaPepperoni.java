package especialidades;

import pizza.base.Pizza;
import pizza.base.Topping;

public class PizzaPepperoni extends Pizza {
    public PizzaPepperoni(String tamaño, Topping... toppings) {
        super("Pizza de Pepperoni", 40, tamaño, toppings);
    }

    @Override
    public void preparar() {
        super.preparar();
        System.out.println("Añadiendo rodajas de pepperoni.");
    }
}
