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
@Table(name="Estados_orden_produccion")
public class Estado_orden_produccion implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_estado_produccion;
	
	@Column(name="Nombre_estado_produccion")
	private  String Nombre_estado_produccion;
	
	/*EstadoOrdenPro_OrdenPro*/
	@ManyToOne
	@JoinColumn(name="id_orden_de_produccion_fk", referencedColumnName = "id_orden_de_produccion")
	private orden_de_produccion id_orden_de_produccion_fk;
	
	//Getters and Setters
	
	
	public Integer getId_estado_produccion() {
		return id_estado_produccion;
	}

	public void setId_estado_produccion(Integer id_estado_produccion) {
		this.id_estado_produccion = id_estado_produccion;
	}

	public String getNombre_estado_produccion() {
		return Nombre_estado_produccion;
	}

	public void setNombre_estado_produccion(String nombre_estado_produccion) {
		Nombre_estado_produccion = nombre_estado_produccion;
	}

	public orden_de_produccion getId_orden_de_produccion_fk() {
		return id_orden_de_produccion_fk;
	}

	public void setId_orden_de_produccion_fk(orden_de_produccion id_orden_de_produccion_fk) {
		this.id_orden_de_produccion_fk = id_orden_de_produccion_fk;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
	
	
	
}
