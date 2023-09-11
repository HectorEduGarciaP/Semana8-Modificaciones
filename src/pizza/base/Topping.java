package pizza.base;

import java.util.ArrayList;
import java.util.List;

public class Topping {

    private String nombre;
    private double precio;
    private List<String> ingredientes = new ArrayList<>();

    public Topping(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public void agregarIngrediente(String ingrediente) {
        this.ingredientes.add(ingrediente);
    }

    @Override
    public String toString() {
        return "Topping{" +
                "nombre='" + nombre + '\'' +
                ", ingredientes=" + ingredientes +
                ", Precio: " + precio + " Q" +
                '}';
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<String> getIngredientes() {
        return ingredientes;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setIngredientes(List<String> ingredientes) {
        this.ingredientes = ingredientes;
    }
}
