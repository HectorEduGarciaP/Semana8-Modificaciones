package pizza.base;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Pizza {

    private String name;
    private double price;
    private String tamaño; // Pequeña, Mediana, Grande
    private List<Topping> toppings = new ArrayList<>();

    public Pizza(String name, double price, String tamaño, Topping... toppings) {
        this.name = name;
        this.price = price;
        this.tamaño = tamaño;
        Collections.addAll(this.toppings, toppings);
    }

    public void addTopping(Topping topping) {
        toppings.add(topping);
    }

    public double getPizzaPrice() {
        double total = price;
        for (Topping topping : toppings) {
            total += topping.getPrecio();
        }

        // Ajustar el precio según el tamaño
        if ("Grande".equalsIgnoreCase(tamaño)) {
            total *= 1.35; // Aumento del 35%
        } else if ("Mediana".equalsIgnoreCase(tamaño)) {
            total *= 1.2; // Aumento del 20%
        }

        return total;
    }

    public void removeTopping(int index) {
        if (index >= 0 && index < toppings.size()) {
            toppings.remove(index);
        }
    }

    public List<Topping> getToppings() {
        return Collections.unmodifiableList(toppings);
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void preparar() {
        System.out.println("Preparando " + tamaño + " Pizza " + name);
        System.out.println("Añadiendo toppings:");

        double total = price;
        for (Topping topping : toppings) {
            System.out.println("- " + topping.getNombre() + "   Precio: " + topping.getPrecio());
            total += topping.getPrecio();
            // Añadir algún mensaje específico de la especialidad aquí
        }

        // Ajustar el precio según el tamaño
        if ("Grande".equalsIgnoreCase(tamaño)) {
            total *= 1.35; // Aumento del 35%
        } else if ("Mediana".equalsIgnoreCase(tamaño)) {
            total *= 1.2; // Aumento del 20%
        }

        System.out.println("La Pizza está lista!" + "\nTotal a pagar: " + total + " quetzales (Q)");
    }
}
