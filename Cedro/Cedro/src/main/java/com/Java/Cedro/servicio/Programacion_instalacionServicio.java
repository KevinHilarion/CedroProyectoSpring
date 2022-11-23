package com.Java.Cedro.servicio;

import java.util.List;
import com.Java.Cedro.modelo.Programacion_instalaciones;


public interface Programacion_instalacionServicio {
	
	
	public List<Programacion_instalaciones> listarTodosLasP();
	
	public Programacion_instalaciones guardarP(Programacion_instalaciones programacion_instalaciones);
	
	public Programacion_instalaciones obtenerPPorId(Integer id_Programacion_instalaciones);
	
	public Programacion_instalaciones actualizarP(Programacion_instalaciones programacion_instalaciones);
	
	public void eliminarP(Integer id_Programacion_instalaciones);
}
