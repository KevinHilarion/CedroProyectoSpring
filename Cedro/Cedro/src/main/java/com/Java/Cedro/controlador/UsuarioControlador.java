package com.Java.Cedro.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import com.Java.Cedro.modelo.Usuario;
import com.Java.Cedro.servicio.UsuarioServicio;



@Controller
public class UsuarioControlador {
	
	@Autowired
	private UsuarioServicio servicio;
	
	@GetMapping({ "/usuarios", "/" })
	public String listarUsario(Model modelo) {
		modelo.addAttribute("usuarios", servicio.listarTodosLosUsuarios());
		return "UsuarioCRUD/usuarios"; 
	}
	
	@GetMapping("/usuarios/nuevo")
	public String mostrarFormularioDeRegistrtarUsuarios(Model modelo) {
		Usuario usuario = new Usuario();
		modelo.addAttribute("usuarios", usuario);
		return "UsuarioCRUD/crear_usuario";
	}
	
	@PostMapping("/usuarios")
	public String guardarUsuario(@ModelAttribute("usuario") Usuario usuario) {
		servicio.guardarUsuario(usuario);
		return "redirect:/usuarios";
	}
	
	

	@GetMapping("/usuarios/editar/{id}")
	public String mostrarFormularioDeEditar(@PathVariable Integer id, Model modelo) {
		modelo.addAttribute("usuarios", servicio.obtenerUsuarioPorId(id));
		return "UsuarioCRUD/editar_usuario";
	}

	@PostMapping("/usuarios/{id}")
	public String actualizarEstudiante(@PathVariable Integer id, @ModelAttribute("usuario") Usuario usuario,
			Model modelo) {
		Usuario usuarioE = servicio.obtenerUsuarioPorId(id);
		usuarioE.setId_usuario(id);
		usuarioE.setNombre(usuario.getNombre());
		usuarioE.setApellido(usuario.getApellido());
		usuarioE.setTipo_documento(usuario.getTipo_documento());
		usuarioE.setNumero_documento(usuario.getNumero_documento());
		usuarioE.setDireccion(usuario.getDireccion());
		usuarioE.setTelefono(usuario.getTelefono());
		usuarioE.setCorreo(usuario.getCorreo());
		
	

		servicio.actualizarUsuario(usuarioE);
		return "redirect:/usuarios";
	}

	@GetMapping("/usuarios/{id}")
	public String eliminarEstudiante(@PathVariable Integer id) {
		servicio.eliminarUsuario(id);
		return "redirect:/usuarios";
	}
}
