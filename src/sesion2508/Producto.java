/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesion2508;

/**
 *
 * @author labc205
 */
public class Producto {
    private int id;
    private String producto;
    private double precio;
    private int existencia;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getExistencia() {
        return existencia;
    }

    public void setExistencia(int existencia) {
        this.existencia = existencia;
    }

    public Producto() {
    }

    public Producto(int id, String producto, double precio, int existencia) {
        this.id = id;
        this.producto = producto;
        this.precio = precio;
        this.existencia = existencia;
    }

    @Override
    public String toString() {
        return " | " + id + " | " + producto + " | " + precio + " | " + existencia + " |\n";
    }
    
    
    
}
