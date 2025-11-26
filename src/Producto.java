public class Producto {
    private String nombre;
    private double precio;
    private int tiempo;

    public Producto(String nombre, double precio, int tiempo) {
        this.nombre = nombre;
        this.precio = precio;
        this.tiempo = tiempo;
    }

    public String getNombre() { return nombre; }
    public double getPrecio() { return precio; }
    public int getTiempo() { return tiempo; }
}
