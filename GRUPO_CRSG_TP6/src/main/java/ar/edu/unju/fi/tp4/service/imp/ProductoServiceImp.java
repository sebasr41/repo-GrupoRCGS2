package ar.edu.unju.fi.tp4.service.imp;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;

import ar.edu.unju.fi.tp4.model.Producto;
import ar.edu.unju.fi.tp4.service.IProductoService;
import ar.edu.unju.fi.tp4.util.TablaProducto;

@Service("productoUtilService")
public class ProductoServiceImp implements IProductoService {


    private static final Log LOGGER = LogFactory.getLog(ProductoServiceImp.class);

    private List<Producto> productos;

    @Override
    public void generarTablaProducto() {
        productos = TablaProducto.listaProductos;
        productos.add(new Producto(1,"Zapatilla",10133,"Adidas",1122));
        productos.add(new Producto(2,"Pelota",2133,"Nike",2222));
    }
    
    @Override
    public void guardarProducto(Producto producto) {
    	
    	if(productos == null) {
    		generarTablaProducto();
    	}
        productos.add(producto);
        LOGGER.info("SERVICE: IProductoService -> ProductoServiceImp");
        LOGGER.info("METHOD: addProducto - se agregó un objeto producto en la lista -> "+productos.get(productos.size()-1));
        LOGGER.info("RESULT: a object producto");
    }
    
    
	@Override
	public List<Producto> obtenerProductos() {
		return productos;
	}

	@Override
	public Producto getProductoPorCodigo(int codigo) {
		Producto unProducto = new Producto();
		for(Producto prod : productos) {
			if(prod.getCodigo() == codigo) {
				unProducto = prod;
			}
		}
		return unProducto;
	}  

}
