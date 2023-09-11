package interfaces;

public class PizzaBase implements IPreparable {
    private String nombre;
    private double precio;

    public PizzaBase(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public void prepare() {

    }

    @Override
    public void preparar() {
        System.out.println("Preparando pizza: " + nombre);
        System.out.println("La pizza está lista!");
    }
}
