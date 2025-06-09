package modelo;

public class ItenDelCarrito {
    private Producto producto;
    private int cantidad;

    public ItenDelCarrito() {

    }

    public ItenDelCarrito(Producto producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    public double subTotal(){
        return producto.getPrecio() * cantidad;
    }

    @Override
    public String toString() {
        return "modelo.ItenDelCarrito{" +
                "producto=" + producto +
                ", cantidad=" + cantidad +
                '}';
    }
}
