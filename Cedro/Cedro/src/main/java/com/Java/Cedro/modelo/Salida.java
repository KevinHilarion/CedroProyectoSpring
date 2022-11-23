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
@Table(name="Salidas")
public class Salida implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_salida;
	
	/*Salida_Insumo*/
	@ManyToOne
	@JoinColumn(name="id_insumo_fk", referencedColumnName = "id_insumo")
	private Insumo id_insumo_fk;
	
	@Column(name="Fecha")
	private String fecha;
	
	@Column(name="Cantidad")
	private Integer cantidad;
	
	/*Salida_Detallepro*/
	@ManyToOne
	@JoinColumn(name="id_detallePro_fk", referencedColumnName = "id_detallePro")
	private Detalle_de_produccion id_detallePro_fk;
	
	
	//Getters  and Setters
	
	public Integer getId_salida() {
		return id_salida;
	}

	public void setId_salida(Integer id_salida) {
		this.id_salida = id_salida;
	}

	public Insumo getId_insumo_fk() {
		return id_insumo_fk;
	}

	public void setId_insumo_fk(Insumo id_insumo_fk) {
		this.id_insumo_fk = id_insumo_fk;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public Detalle_de_produccion getId_detallePro_fk() {
		return id_detallePro_fk;
	}

	public void setId_detallePro_fk(Detalle_de_produccion id_detallePro_fk) {
		this.id_detallePro_fk = id_detallePro_fk;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
	
}
