/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio10;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author jpber
 */
public class Fabricante {

    private String nombre;
    private String pais;
    private int añoFundacion;
    private List<Producto> productos;

    public Fabricante(String nombre, String pais, int añoFundacion) {
        this.nombre = nombre;
        this.pais = pais;
        this.añoFundacion = añoFundacion;
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        if (!productos.contains(producto)) {
            productos.add(producto);
            producto.agregarFabricante(this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fabricante that = (Fabricante) o;
        return Objects.equals(nombre, that.nombre) &&
               Objects.equals(pais, that.pais);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, pais);
    }

    @Override
    public String toString() {
        return "Fabricante{" +
               "nombre='" + nombre + '\'' +
               ", pais='" + pais + '\'' +
               ", añoFundacion=" + añoFundacion +
               '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getAñoFundacion() {
        return añoFundacion;
    }

    public void setAñoFundacion(int añoFundacion) {
        this.añoFundacion = añoFundacion;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    
}

