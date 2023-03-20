package Clase04Ejercicio01;

public class Descuento {
    private String descripcion;
    private int unidades;
    private int descuento;


    public Descuento(String descripcion, int unidades, int descuento){
        this.descripcion = descripcion;
        this.unidades = unidades;
        this.descuento = descuento;
    }

    public int getUnidades() {
        return unidades;
    }

}
