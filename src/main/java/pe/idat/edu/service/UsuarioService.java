package pe.idat.edu.service;

import java.util.List;

import pe.idat.edu.model.Usuario;



public interface UsuarioService {
	
	void guardarUsuario(Usuario usuario);
	void actualizarUsuario(Usuario usuario);
	void eliminarUsuario(Integer id);
	List<Usuario> listarUsuario();
	Usuario obtenerUsuarioId(Integer id);


}
