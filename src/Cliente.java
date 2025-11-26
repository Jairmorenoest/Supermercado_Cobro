import java.util.ArrayList;

public class Cliente {
    private String nombre;
    private ArrayList<Producto> productos;

    public Cliente(String nombre) {
        this.nombre = nombre;
        productos = new ArrayList<>();
    }

    public void agregar(Producto p){
        productos.add(p);
    }

    public ArrayList<Producto> getProductos(){
        return productos;
    }

    public String getNombre(){
        return nombre;
    }
}
