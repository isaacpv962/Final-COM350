/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PC-Solution 3-8-21
 */


import java.util.ArrayList;
import java.util.List;

interface Producto {
    double getPrecio();
}

class PipocaPequena implements Producto {
    private static final double PRECIO = 5.0;

    @Override
    public double getPrecio() {
        return PRECIO;
    }
}

class PipocaMediana implements Producto {
    private static final double PRECIO = 8.0;

    @Override
    public double getPrecio() {
        return PRECIO;
    }
}

class PipocaGrande implements Producto {
    private static final double PRECIO = 10.0;

    @Override
    public double getPrecio() {
        return PRECIO;
    }
}

class SodaPequena implements Producto {
    private static final double PRECIO = 4.0;

    @Override
    public double getPrecio() {
        return PRECIO;
    }
}

class SodaMediana implements Producto {
    private static final double PRECIO = 6.0;

    @Override
    public double getPrecio() {
        return PRECIO;
    }
}

class SodaGrande implements Producto {
    private static final double PRECIO = 8.0;

    @Override
    public double getPrecio() {
        return PRECIO;
    }
}

