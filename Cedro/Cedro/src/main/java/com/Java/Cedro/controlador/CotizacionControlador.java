package com.Java.Cedro.controlador;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import com.Java.Cedro.modelo.Cotizacion;
import com.Java.Cedro.modelo.Pedido;
import com.Java.Cedro.servicio.CotizacionServicio;
import com.Java.Cedro.servicio.PedidoServicio;


@Controller
public class CotizacionControlador {
	
	@Autowired
	private CotizacionServicio CServicio;
	
	@Autowired
	private PedidoServicio PeServicio;

	@GetMapping({ "/cotizaciones", "/" })
	public String listarCotizaciones(Model modelo) {
		modelo.addAttribute("cotizaciones", CServicio.listarTodosLasCotizaciones());
		return "CotizacionCRUD/Cotizacion";
	}
	
	@GetMapping("/cotizaciones/nuevo")
	public String mostrarFormularioDeRegistrarCotizacion(Model modelo) {
		
		List<Pedido> lstPe = PeServicio.listarTodosLospedidos();
		modelo.addAttribute("lstPe", lstPe);
		
		
		Cotizacion cotizacion = new Cotizacion();

		
		modelo.addAttribute("cotizaciones", cotizacion);
		return "CotizacionCRUD/Crear_Cotizacion";
	}
	
	@PostMapping("/cotizaciones")
	public String guardarCotizacion(@ModelAttribute("cotizaciones") Cotizacion cotizacion) {
		CServicio.guardarCotizacion(cotizacion);
		return "redirect:/cotizaciones";
	}
	
	
	@GetMapping("/cotizaciones/editar/{id}")
	public String mostrarFormularioDeEditar(@PathVariable Integer id, Model modelo) {

		List<Pedido> lstPe = PeServicio.listarTodosLospedidos();
		modelo.addAttribute("lstPe", lstPe);

		modelo.addAttribute("cotizaciones", CServicio.obtenerCotizacionPorId(id));
		return "CotizacionCRUD/Editar_Cotizacion";
	}
	
	
	@PostMapping("/cotizaciones/{id}")
	public String actualizarCotizacion(@PathVariable Integer id, @ModelAttribute("cotizacion") Cotizacion cotizacion, Model modelo) {

		Cotizacion C = CServicio.obtenerCotizacionPorId(id);
		
		C.setId_cotizacion(id);
		C.setFecha(cotizacion.getFecha());
		C.setId_pedidos_fk(cotizacion.getId_pedidos_fk());
		
		CServicio.actualizarCotizacion(C);
		return "redirect:/cotizaciones";
	}
	
	@GetMapping("/cotizaciones/{id}")
	public String eliminarCotizacion(@PathVariable Integer id) {
		CServicio.eliminarCotizacion(id);
		return "redirect:/cotizaciones";
	}
	
	
	
}
