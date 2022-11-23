package com.Java.Cedro.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.Java.Cedro.modelo.Programacion_instalaciones;
import com.Java.Cedro.repositorio.Programacion_instalacionRepositorio;

@Service
public class Programacion_instalacionServicioImpl implements  Programacion_instalacionServicio{
	
	@Autowired
	private  Programacion_instalacionRepositorio repositorio;
	
	
	@Override
	public List<Programacion_instalaciones> listarTodosLasP() {
		return repositorio.findAll();
	}

	@Override
	public Programacion_instalaciones guardarP(Programacion_instalaciones programacion_instalaciones) {
		return repositorio.save(programacion_instalaciones);
	}

	@Override
	public Programacion_instalaciones obtenerPPorId(Integer id_Programacion_instalaciones) {
		return repositorio.findById(id_Programacion_instalaciones).get();
	}

	@Override
	public Programacion_instalaciones actualizarP(Programacion_instalaciones programacion_instalaciones) {
		return repositorio.save(programacion_instalaciones);
	}

	@Override
	public void eliminarP(Integer id_Programacion_instalaciones) {
		repositorio.deleteById(id_Programacion_instalaciones);
		
	}

}
