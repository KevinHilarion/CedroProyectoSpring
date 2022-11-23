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
@Table(name="Estado_cotizacion")
public class Estado_cotizacion implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_estado_cotizacion;
	
	@Column(name="Nombre_estado_cotizacion")
	private  String Nombre_estado_cotizacion;
	
	/*Estado_Cotizacion_cotizacion*/
	@ManyToOne
	@JoinColumn(name="id_cotizacion_fk", referencedColumnName = "id_cotizacion")
	private Cotizacion id_cotizacion_fk;
	
	//Getters and Setters
	
	public Integer getId_estado_cotizacion() {
		return id_estado_cotizacion;
	}

	public void setId_estado_cotizacion(Integer id_estado_cotizacion) {
		this.id_estado_cotizacion = id_estado_cotizacion;
	}

	public String getNombre_estado_cotizacion() {
		return Nombre_estado_cotizacion;
	}

	public void setNombre_estado_cotizacion(String nombre_estado_cotizacion) {
		Nombre_estado_cotizacion = nombre_estado_cotizacion;
	}

	public Cotizacion getId_cotizacion_fk() {
		return id_cotizacion_fk;
	}

	public void setId_cotizacion_fk(Cotizacion id_cotizacion_fk) {
		this.id_cotizacion_fk = id_cotizacion_fk;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
	

}
