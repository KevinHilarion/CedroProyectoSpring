package com.Java.Cedro.modelo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="Estados_citas")
public class Estado_cita implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_estados_citas;
	
	@Column(name="Nombre")
	private  String Nombre_estado_cita;
	
	
	/*ProgramacionI_EstadoC*/
	@ManyToOne
	@JoinColumn(name="id_Programacion_instalaciones_fk", referencedColumnName = "id_Programacion_instalaciones")
	private Programacion_instalaciones id_Programacion_instalaciones_fk;

	/*Getters and Setters*/
	
	
	public Integer getId_estados_citas() {
		return id_estados_citas;
	}


	public void setId_estados_citas(Integer id_estados_citas) {
		this.id_estados_citas = id_estados_citas;
	}


	public String getNombre_estado_cita() {
		return Nombre_estado_cita;
	}


	public void setNombre_estado_cita(String nombre_estado_cita) {
		Nombre_estado_cita = nombre_estado_cita;
	}


	public Programacion_instalaciones getId_Programacion_instalaciones_fk() {
		return id_Programacion_instalaciones_fk;
	}


	public void setId_Programacion_instalaciones_fk(Programacion_instalaciones id_Programacion_instalaciones_fk) {
		this.id_Programacion_instalaciones_fk = id_Programacion_instalaciones_fk;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
	

}
