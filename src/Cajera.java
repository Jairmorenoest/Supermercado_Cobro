public class Cajera implements Runnable {
    private final String nombre;
    private final Cliente cliente;

    public Cajera(String nombre, Cliente cliente){
        this.nombre = nombre;
        this.cliente = cliente;
    }

    @Override
    public void run() {
        System.out.println(nombre + " empieza cargando productos del cliente " + cliente.getNombre());
        int total = 0;

        for(Producto p : cliente.getProductos()){
            try {
                System.out.println(nombre + " procesando: " + p.getNombre());
                Thread.sleep(p.getTiempo() * 1000L);
                total += p.getTiempo();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        System.out.println(nombre + " termina con " + cliente.getNombre() +
                " en " + total + " segundos");
    }
}
