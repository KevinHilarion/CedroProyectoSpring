package com.Java.Cedro.modelo;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;






@Entity
@Table(name="Detalle_cotizacion")
public class Detalle_cotizacion implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_detalle_cotizacion;
	
	/*DetalleC_Cotizacion*/
	@ManyToOne
	@JoinColumn(name="id_cotizacion_fk", referencedColumnName = "id_cotizacion")
	private Cotizacion id_cotizacion_fk;
	
	@Column(name="Cantidad")
	private  Integer Cantidad;
	
	
	/*DetalleC_Producto*/
	@OneToMany(mappedBy ="id_detalle_cotizacion_fk")
	private List <Producto>ListProducto;
	
	
	/*DetalleC_Telas*/
	@OneToMany(mappedBy ="id_detalle_cotizacion_fk")
	private List <Tela>ListTela;
	
	/*DetalleC_Maderas*/
	@OneToMany(mappedBy ="id_detalle_cotizacion_fk")
	private List <Madera>ListMadera;
	
	//Getters and Setters
	
	public Integer getId_detalle_cotizacion() {
		return id_detalle_cotizacion;
	}

	public void setId_detalle_cotizacion(Integer id_detalle_cotizacion) {
		this.id_detalle_cotizacion = id_detalle_cotizacion;
	}

	public Cotizacion getId_cotizacion_fk() {
		return id_cotizacion_fk;
	}

	public void setId_cotizacion_fk(Cotizacion id_cotizacion_fk) {
		this.id_cotizacion_fk = id_cotizacion_fk;
	}

	public Integer getCantidad() {
		return Cantidad;
	}

	public void setCantidad(Integer cantidad) {
		Cantidad = cantidad;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
	
	

}
