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
@Table(name="Cotizacion")
public class Cotizacion implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_cotizacion;
	
	@Column(name="fecha")
	private String fecha;
	
	/*Cotizacion_Pedido*/
	@ManyToOne
	@JoinColumn(name="id_pedidos_fk", referencedColumnName = "id_pedido")
	private Pedido id_pedidos_fk;
	
	/*Cotizacion_EstadosCoti*/
	@OneToMany(mappedBy ="id_cotizacion_fk")
	private List <Estado_cotizacion>ListEstado_Cotizacion;
	
	/*DetalleC_Cotizacion*/
	@OneToMany(mappedBy ="id_cotizacion_fk")
	private List <Detalle_cotizacion>ListDetalle_cotizacion;
	
	//Getters and Setters
	
	public Integer getId_cotizacion() {
		return id_cotizacion;
	}

	public void setId_cotizacion(Integer id_cotizacion) {
		this.id_cotizacion = id_cotizacion;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public Pedido getId_pedidos_fk() {
		return id_pedidos_fk;
	}

	public void setId_pedidos_fk(Pedido id_pedidos_fk) {
		this.id_pedidos_fk = id_pedidos_fk;
	}

	public List<Estado_cotizacion> getListEstado_Cotizacion() {
		return ListEstado_Cotizacion;
	}

	public void setListEstado_Cotizacion(List<Estado_cotizacion> listEstado_Cotizacion) {
		ListEstado_Cotizacion = listEstado_Cotizacion;
	}

	public List<Detalle_cotizacion> getListDetalle_cotizacion() {
		return ListDetalle_cotizacion;
	}

	public void setListDetalle_cotizacion(List<Detalle_cotizacion> listDetalle_cotizacion) {
		ListDetalle_cotizacion = listDetalle_cotizacion;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
	

}
