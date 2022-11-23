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
@Table(name="Pedidos")
public class Pedido implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_pedido;
	

	@Column(name="Fecha")
	private String Fecha;
	
	/*Cliente_Pedido*/
	@ManyToOne
	@JoinColumn(name="id_cliente_fk", referencedColumnName = "id_clientes")
	private Cliente id_cliente_fk;
	
	/*Pedido_Ventas*/
	@ManyToOne
	@JoinColumn(name="id_venta_fk", referencedColumnName = "id_ventas")
	private Venta id_venta_fk;
	
	/*Pedido_Cotizacion*/
	@OneToMany(mappedBy ="id_pedidos_fk")
	private List <Cotizacion>ListCotizacion;

	
	
	//Getters And Setters
	
	public Integer getId_pedido() {
		return id_pedido;
	}

	public void setId_pedido(Integer id_pedido) {
		this.id_pedido = id_pedido;
	}

	public String getFecha() {
		return Fecha;
	}

	public void setFecha(String fecha) {
		Fecha = fecha;
	}

	public Cliente getId_cliente_fk() {
		return id_cliente_fk;
	}

	public void setId_cliente_fk(Cliente id_cliente_fk) {
		this.id_cliente_fk = id_cliente_fk;
	}

	public Venta getId_venta_fk() {
		return id_venta_fk;
	}

	public void setId_venta_fk(Venta id_venta_fk) {
		this.id_venta_fk = id_venta_fk;
	}

	public List<Cotizacion> getListCotizacion() {
		return ListCotizacion;
	}

	public void setListCotizacion(List<Cotizacion> listCotizacion) {
		ListCotizacion = listCotizacion;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	

	
	

}
