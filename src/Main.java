public class Main {
    public static void main(String[] args) {

        Producto arroz = new Producto("Arroz", 2500, 1);
        Producto huevos = new Producto("Huevos", 15000, 2);
        Producto leche = new Producto("Leche", 4000, 1);
        Producto pan = new Producto("Pan", 4000, 1)

        Cliente c1 = new Cliente("Juan");
        c1.agregar(arroz);
        c1.agregar(leche);

        Cliente c2 = new Cliente("María");
        c2.agregar(huevos);

        Thread t1 = new Thread(new Cajera("Cajera 1", c1));
        Thread t2 = new Thread(new Cajera("Cajera 2", c2));
        Thread t3 = new Thread(new Cajera("Cajera 3", c3));

        t1.start();
        t2.start();
        t3.start();
    }
}
