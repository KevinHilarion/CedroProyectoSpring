package com.Java.Cedro.servicio;

import java.util.List;



import com.Java.Cedro.modelo.Usuario;



public interface UsuarioServicio {
	
public List<Usuario> listarTodosLosUsuarios();
	
	public Usuario guardarUsuario(Usuario usuario);
	
	public Usuario obtenerUsuarioPorId(Integer id_usuario);
	
	public Usuario actualizarUsuario(Usuario usuario);
	
	public void eliminarUsuario(Integer id_usuario);
}
