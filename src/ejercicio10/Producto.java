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
public class Producto {
     private String nombre;
    private String codigo;
    private String tipo;
    private double precio;
    private List<Fabricante> fabricantes;

    public Producto(String nombre, String codigo, String tipo, double precio) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.tipo = tipo;
        this.precio = precio;
        this.fabricantes = new ArrayList<>();
    }

    public void agregarFabricante(Fabricante fabricante) {
        if (!fabricantes.contains(fabricante)) {
            fabricantes.add(fabricante);
            fabricante.agregarProducto(this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Producto producto = (Producto) o;
        return Objects.equals(codigo, producto.codigo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo);
    }

    @Override
    public String toString() {
        return "Producto{" +
               "nombre='" + nombre + '\'' +
               ", codigo='" + codigo + '\'' +
               ", tipo='" + tipo + '\'' +
               ", precio=" + precio +
               '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public List<Fabricante> getFabricantes() {
        return fabricantes;
    }

    public void setFabricantes(List<Fabricante> fabricantes) {
        this.fabricantes = fabricantes;
    }

}
