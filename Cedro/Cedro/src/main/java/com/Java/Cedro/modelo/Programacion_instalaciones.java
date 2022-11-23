package com.Java.Cedro.modelo;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table(name="Programacion_instalaciones")
public class Programacion_instalaciones implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_Programacion_instalaciones;

	
	@Column(name="Fecha")
	private String Fecha;
	
	/*ProgramacionI_EstadoC*/
	@OneToMany(mappedBy ="id_Programacion_instalaciones_fk")
	private List <Estado_cita>ListEstado_cita;
	
	/*ProgramacionI_Ventas*/
	@OneToMany(mappedBy ="id_Programacion_instalaciones_fk")
	private List <Venta>ListVenta;
	
	/*Getters and Setters*/
	
	public Integer getId_Programacion_instalaciones() {
		return id_Programacion_instalaciones;
	}

	public void setId_Programacion_instalaciones(Integer id_Programacion_instalaciones) {
		this.id_Programacion_instalaciones = id_Programacion_instalaciones;
	}

	public String getFecha() {
		return Fecha;
	}

	public void setFecha(String fecha) {
		Fecha = fecha;
	}

	public List<Estado_cita> getListEstado_cita() {
		return ListEstado_cita;
	}

	public void setListEstado_cita(List<Estado_cita> listEstado_cita) {
		ListEstado_cita = listEstado_cita;
	}

	public List<Venta> getListVenta() {
		return ListVenta;
	}

	public void setListVenta(List<Venta> listVenta) {
		ListVenta = listVenta;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
	
	
}
