/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio10;

import java.util.Date;
import java.util.Objects;

/**
 *
 * @author jpber
 */
public class Venta {
     private Producto producto;
    private int cantidad;
    private Date fecha;
    private double total;

    public Venta(Producto producto, int cantidad, Date fecha) {
        this.producto = producto;
        this.cantidad = cantidad;
        this.fecha = fecha;
        this.total = producto.getPrecio() * cantidad;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Venta venta = (Venta) o;
        return cantidad == venta.cantidad &&
               Double.compare(venta.total, total) == 0 &&
               Objects.equals(producto, venta.producto) &&
               Objects.equals(fecha, venta.fecha);
    }

    @Override
    public int hashCode() {
        return Objects.hash(producto, cantidad, fecha, total);
    }

    @Override
    public String toString() {
        return "Venta{" +
               "producto=" + producto +
               ", cantidad=" + cantidad +
               ", fecha=" + fecha +
               ", total=" + total +
               '}';
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

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    
}
