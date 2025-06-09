import modelo.CarritoDeCompras;
import modelo.Producto;


public class App {
    public static void main(String[] args) {
        Producto producto1 = new Producto("PB15","Computadora",200);
        Producto producto2 = new Producto("OR5","Refrigeradora",180);
        Producto producto3 = new Producto("SRF1","Impresora",150);
        Producto producto4 = new Producto("KRD4","Microondas",50);
        Producto producto5 = new Producto("LRO6","Mouse",20);

        CarritoDeCompras nuevosProductos = new CarritoDeCompras();
        nuevosProductos.agregarCarrito(producto1,1);
        nuevosProductos.agregarCarrito(producto2,2);
        nuevosProductos.agregarCarrito(producto3,3);
        nuevosProductos.agregarCarrito(producto4,4);
        nuevosProductos.agregarCarrito(producto5,5);

        nuevosProductos.agregarDetalle();

    }
}
