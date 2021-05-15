package ar.edu.unju.fi.tp4.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Compra {
	private int id;
	private int cantidad;
	private double total;
	
	@Autowired
	private Producto producto;
	
	public Compra() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Compra(int id, int cantidad, double total, Producto producto) {
		super();
		this.id = id;
		this.cantidad = cantidad;
		this.total = total;
		this.producto = producto;
	}



	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	@Override
	public String toString() {
		return "Compra [id=" + id + ", cantidad=" + cantidad + ", total=" + total + ", producto=" + producto + "]";
	}
	
	
	
	
	
	
}
