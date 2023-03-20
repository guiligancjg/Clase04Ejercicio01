package Clase04Ejercicio01;

public class Carrito {
    private Descuento descuento;
    private Producto[] productos;

    public Carrito(){}

    public Carrito(Descuento descuento){
        this.productos = new Producto[3];
        this.descuento = descuento;
    }

    public void agregarProducto(Producto producto){
        new Carrito().agregar(producto);
    }

    public void agregar(Producto producto){
        if (producto != null){
            for (int i = 0; i < productos.length ; i++) {
                if(productos[i] != null){
                    productos[i] = producto;
                }
            }
        }
    }

    public double calcularTotal(){
        double total = 0;
        for (Producto producto: productos) {
            total += producto.getPrecio();
        }
        return total;
    }

}
