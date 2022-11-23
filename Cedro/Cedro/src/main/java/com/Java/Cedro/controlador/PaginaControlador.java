package com.Java.Cedro.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import com.Java.Cedro.modelo.Usuario;
import com.Java.Cedro.servicio.UsuarioServicio;



@Controller
public class PaginaControlador {

	@Autowired
	private UsuarioServicio servicio;

	@GetMapping("/index")
	public String index() {
		return "index";

	}
	
	@GetMapping("/cookies")
	public String cookies() {
		return "cookies";

	}
	
	@GetMapping("/cruds")
	public String cruds() {
		return "CRUDS";

	}
	
	/*UsersD*/
	
	@GetMapping("/dashboard")
	public String dashboard() {
		return "dashboard";

	}
	
	@GetMapping("/dashboardP")
	public String dashboardP() {
		return "dashboard-produccion";

	}
	
	@GetMapping("/dashboardV")
	public String dashboardV() {
		return "dashboard-ventas";

	}
	
	/*UsersD*/

	@GetMapping("/cotizacion-cliente")
	public String cotizarC() {
		return "cotizarC";

	}

	@GetMapping("/Iniciar")
	public String Iniciar() {
		return "/LogIn/Iniciar";

	}

	//SignUp


	@GetMapping("/Registrar")
	public String mostrarFormularioDeRegistrtarNuevoU(Model modelo) {
		Usuario usuario = new Usuario();
		modelo.addAttribute("RegistrarU", usuario);
		return "LogIn/Registrar";
	}

	@PostMapping("/Registrar")
	public String guardarUsuario(@ModelAttribute("registrar") Usuario usuario) {
		servicio.guardarUsuario(usuario);
		return "redirect:/usuarios";
	}
	
	//SignUp

	@GetMapping("/Recuperar")
	public String Recuperar() {
		return "/LogIn/Recuperar";

	}
}
