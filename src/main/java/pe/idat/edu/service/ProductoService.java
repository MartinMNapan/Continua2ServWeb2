package pe.idat.edu.service;

import java.util.List;

import pe.idat.edu.model.Productos;

public interface ProductoService {
	
	void guardarProducto(Productos producto);
	void actualizarProducto(Productos producto);
	void eliminarProducto(Integer id);
	List<Productos> listarProducto();
	Productos obtenerProductoId(Integer id);

}
