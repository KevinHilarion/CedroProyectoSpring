package com.Java.Cedro.controlador;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import com.Java.Cedro.modelo.Detalle_de_produccion;
import com.Java.Cedro.modelo.Insumo;
import com.Java.Cedro.modelo.Salida;
import com.Java.Cedro.servicio.Detalle_de_produccionServicio;
import com.Java.Cedro.servicio.InsumoServicio;
import com.Java.Cedro.servicio.SalidaServicio;


	@Controller
	public class SalidaControlador {

	@Autowired
	private SalidaServicio Sservicio;

	@Autowired
	private InsumoServicio IServicio;

	@Autowired
	private Detalle_de_produccionServicio DServicio;

	@GetMapping({ "/salidas", "/" })
	public String listarsalidas(Model modelo) {
		modelo.addAttribute("salidas", Sservicio.listarTodosLasSalidas());
		return "SalidaCRUD/Salida";
	}
	
	@GetMapping("/salidas/nuevo")
	public String mostrarFormularioDeRegistrarSalida(Model modelo) {
		
		List<Insumo> lstI = IServicio.listarTodosLosInsumos();
		modelo.addAttribute("lstI", lstI);
		
		List<Detalle_de_produccion> lstD = DServicio.listarTodosLosDetalle();
		modelo.addAttribute("lstD", lstD);
		
		Salida salida = new Salida();

		
		modelo.addAttribute("salidas", salida);
		return "SalidaCRUD/Crear_Salida";
	}
	
	@PostMapping("/salidas")
	public String guardarSalida(@ModelAttribute("salidas") Salida salida) {
		Sservicio.guardarSalida(salida);
		return "redirect:/salidas";
	}
	
	@GetMapping("/salidas/editar/{id}")
	public String mostrarFormularioDeEditar(@PathVariable Integer id, Model modelo) {

		List<Insumo> lstI = IServicio.listarTodosLosInsumos();
		modelo.addAttribute("lstI", lstI);
		
		List<Detalle_de_produccion> lstD = DServicio.listarTodosLosDetalle();
		modelo.addAttribute("lstD", lstD);

		modelo.addAttribute("salidas", Sservicio.obtenerSalidaPorId(id));
		return "SalidaCRUD/Editar_Salida";
	}
	
	@PostMapping("/salidas/{id}")
	public String actualizarSalida(@PathVariable Integer id, @ModelAttribute("salida") Salida salida, Model modelo) {

		Salida S = Sservicio.obtenerSalidaPorId(id);
		
		S.setId_salida(id);
		S.setId_insumo_fk(salida.getId_insumo_fk());
		S.setFecha(salida.getFecha());
		S.setCantidad(salida.getCantidad());
		S.setId_detallePro_fk(salida.getId_detallePro_fk());
		
		
		Sservicio.actualizarSalida(S);
		return "redirect:/salidas";
	}
	
	@GetMapping("/salidas/{id}")
	public String eliminarSalida(@PathVariable Integer id) {
		Sservicio.eliminarSalida(id);
		return "redirect:/salidas";
	}
}
