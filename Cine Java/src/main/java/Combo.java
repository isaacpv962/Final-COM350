
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PC-Solution 3-8-21
 */
public class Combo implements Producto {
    private List<Producto> productos;
    private double descuento;

    public Combo() {
        productos = new ArrayList<>();
        descuento = 0.0;
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    @Override
    public double getPrecio() {
        double precioTotal = 0.0;
        for (Producto producto : productos) {
            precioTotal += producto.getPrecio();
        }
        return precioTotal - descuento;
    }
}

