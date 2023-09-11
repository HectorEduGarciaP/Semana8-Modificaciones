import especialidades.PizzaItaliana;
import especialidades.PizzaHawaiana;
import especialidades.PizzaPepperoni;
import especialidades.PizzaVegetariana;
import pizza.base.Topping;

public class Main {
    public static void main(String[] args) {
        // Crear una instancia de PizzaItaliana
        PizzaItaliana pizzaItaliana = new PizzaItaliana("De Tomate", "Pequeña",
                new Topping("Salsa", 2),
                new Topping("Queso mozzarella", 2),
                new Topping("Champiñon", 5)
        );
        pizzaItaliana.preparar();
        System.out.println("Salsa: " + pizzaItaliana.getSalsa());

        double precioItaliana = pizzaItaliana.getPizzaPrice();
        System.out.println("Precio de la Pizza Italiana: Q" + precioItaliana);

        PizzaHawaiana pizzaHawaiana = new PizzaHawaiana("Mediana",
                new Topping("Piña", 3),
                new Topping("Jamón", 4)
        );
        pizzaHawaiana.preparar();
        double precioHawaiana = pizzaHawaiana.getPizzaPrice();
        System.out.println("Precio de la Pizza Hawaiana: Q" + precioHawaiana);

        PizzaPepperoni pizzaPepperoni = new PizzaPepperoni("Grande",
                new Topping("Pepperoni", 5)
        );
        pizzaPepperoni.preparar();
        double precioPepperoni = pizzaPepperoni.getPizzaPrice();
        System.out.println("Precio de la Pizza de Pepperoni: Q" + precioPepperoni);

        PizzaVegetariana pizzaVegetariana = new PizzaVegetariana("Pequeña",
                new Topping("Pimientos", 2),
                new Topping("Cebolla", 2),
                new Topping("Champiñones", 3),
                new Topping("Aceitunas", 1)
        );
        pizzaVegetariana.preparar();
        double precioVegetariana = pizzaVegetariana.getPizzaPrice();
        System.out.println("Precio de la Pizza Vegetariana: Q" + precioVegetariana);
    }
}
