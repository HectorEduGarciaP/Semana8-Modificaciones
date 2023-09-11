package especialidades;

import pizza.base.Pizza;
import pizza.base.Topping;

public class PizzaMexicana extends Pizza {
    public PizzaMexicana(String tamaño, Topping... toppings) {
        super("Pizza Mexicana", 45, tamaño, toppings);
    }

    @Override
    public void preparar() {
        super.preparar();
        System.out.println("Añadiendo jalapeños, carne de res sazonada y guacamole.");
    }
}
