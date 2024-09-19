/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio10;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author jpber
 */
public class Tienda {
    private List<Producto> productos;
    private List<Fabricante> fabricantes;
    private List<Venta> ventas;

    public Tienda() {
        this.productos = new ArrayList<>();
        this.fabricantes = new ArrayList<>();
        this.ventas = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public void registrarFabricante(Fabricante fabricante) {
        fabricantes.add(fabricante);
    }

    public void realizarVenta(Producto producto, int cantidad, Date fecha) {
        Venta venta = new Venta(producto, cantidad, fecha);
        ventas.add(venta);
    }

    public double calcularTotalVentas(Date inicio, Date fin) {
        return ventas.stream()
                .filter(v -> !v.getFecha().before(inicio) && !v.getFecha().after(fin))
                .mapToDouble(Venta::getTotal)
                .sum();
    }
}
