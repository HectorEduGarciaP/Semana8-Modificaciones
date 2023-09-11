package especialidades;

import pizza.base.Pizza;
import pizza.base.Topping;

public class PizzaVegetariana extends Pizza {
    public PizzaVegetariana(String tamaño, Topping... toppings) {
        super("Pizza Vegetariana", 40, tamaño, toppings);
    }

    @Override
    public void preparar() {
        super.preparar();
        System.out.println("Añadiendo pimientos, cebolla, champiñones y aceitunas.");
    }
}
