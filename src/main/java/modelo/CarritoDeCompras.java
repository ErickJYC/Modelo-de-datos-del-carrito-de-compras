package modelo;

import java.util.ArrayList;
import java.util.List;

public class CarritoDeCompras {
    private List<ItenDelCarrito> nuevosProductos;

    public CarritoDeCompras() {
        nuevosProductos = new ArrayList<>();
    }

    public void agregarCarrito(Producto producto, int cantidad){
        nuevosProductos.add(new ItenDelCarrito(producto,cantidad));
    }
    public double calcularTotal(){
        double total = 0;
        for (ItenDelCarrito item : nuevosProductos){
            total += item.getSubTotal();
        }
        return total;
    }

    public void agregarDetalle() {
        for (ItenDelCarrito item : nuevosProductos){
            System.out.println(item.getProducto().getNombre() + "---"+ item.getCantidad() +
                    ".. $" + item.getSubTotal());
        }
        System.out.println("El valor calculado es: $ " + calcularTotal());
    }
}
