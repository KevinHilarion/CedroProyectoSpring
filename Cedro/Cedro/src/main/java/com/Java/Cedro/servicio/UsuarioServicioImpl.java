package com.Java.Cedro.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Java.Cedro.modelo.Usuario;
import com.Java.Cedro.repositorio.UsuarioRepositorio;

@Service
public class UsuarioServicioImpl implements UsuarioServicio{

	@Autowired
	private UsuarioRepositorio repositorio;
	
	@Override
	public List<Usuario> listarTodosLosUsuarios() {
		return repositorio.findAll();
	}

	@Override
	public Usuario guardarUsuario(Usuario usuario) {
		return repositorio.save(usuario);
	}

	@Override
	public Usuario obtenerUsuarioPorId(Integer id_usuario) {
		return repositorio.findById(id_usuario).get();
	}

	@Override
	public Usuario actualizarUsuario(Usuario usuario) {
		return repositorio.save(usuario);
	}

	@Override
	public void eliminarUsuario(Integer id_usuario) {
		repositorio.deleteById(id_usuario);
		
	}


}
