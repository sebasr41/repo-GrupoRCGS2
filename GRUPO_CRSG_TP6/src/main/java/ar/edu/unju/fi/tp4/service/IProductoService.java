package ar.edu.unju.fi.tp4.service;

import java.util.List;

import ar.edu.unju.fi.tp4.model.Producto;

public interface IProductoService {
	
    public void guardarProducto(Producto producto);

    public void generarTablaProducto();
    
    public List<Producto> obtenerProductos();
    
    public Producto getProductoPorCodigo(int codigo);

}
