public class Cajera implements Runnable {
    private String nombre;
    private Cliente cliente;

    public Cajera(String nombre, Cliente cliente){
        this.nombre = nombre;
        this.cliente = cliente;
    }

    @Override
    public void run() {
        System.out.println(nombre + " empieza con " + cliente.getNombre());
        int total = 0;

        for(Producto p : cliente.getProductos()){
            try {
                System.out.println(nombre + " procesando: " + p.getNombre());
                Thread.sleep(p.getTiempo() * 1000);
                total += p.getTiempo();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        System.out.println(nombre + " termina con " + cliente.getNombre() +
                " en " + total + " segundos");
    }
}
