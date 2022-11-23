package com.Java.Cedro.modelo;

import java.io.Serializable;
import java.math.BigInteger;
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
@Table(name="Productos")
public class Producto implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_producto;
	
	@Column(name="Nombre_producto ")
	private String Nombre_producto;
	
	@Column(name="Precio")
	private BigInteger Precio;
	
	
	
	/*Producto_DetallePro*/
	@ManyToOne
	@JoinColumn(name="id_detallePro_fk", referencedColumnName = "id_detallePro")
	private Detalle_de_produccion id_detallePro_fk;
	
	/*DetalleC_Producto*/
	@ManyToOne
	@JoinColumn(name="id_detalle_cotizacion_fk", referencedColumnName = "id_detalle_cotizacion")
	private Detalle_cotizacion id_detalle_cotizacion_fk;
	
	
	/*Producto__Categoria_P*/
	@OneToMany(mappedBy ="id_producto_fk")
	private List <Categoria_producto>ListCategoria_producto;
	
	/*Producto__Diseño*/
	@OneToMany(mappedBy ="id_producto_fk")
	private List <Diseño>ListDiseño;
	
	
	//Getters and Setters


	public Integer getId_producto() {
		return id_producto;
	}


	public void setId_producto(Integer id_producto) {
		this.id_producto = id_producto;
	}


	public String getNombre_producto() {
		return Nombre_producto;
	}


	public void setNombre_producto(String nombre_producto) {
		Nombre_producto = nombre_producto;
	}


	public BigInteger getPrecio() {
		return Precio;
	}


	public void setPrecio(BigInteger precio) {
		Precio = precio;
	}


	public Detalle_de_produccion getId_detallePro_fk() {
		return id_detallePro_fk;
	}


	public void setId_detallePro_fk(Detalle_de_produccion id_detallePro_fk) {
		this.id_detallePro_fk = id_detallePro_fk;
	}


	public Detalle_cotizacion getId_detalle_cotizacion_fk() {
		return id_detalle_cotizacion_fk;
	}


	public void setId_detalle_cotizacion_fk(Detalle_cotizacion id_detalle_cotizacion_fk) {
		this.id_detalle_cotizacion_fk = id_detalle_cotizacion_fk;
	}


	public List<Categoria_producto> getListCategoria_producto() {
		return ListCategoria_producto;
	}


	public void setListCategoria_producto(List<Categoria_producto> listCategoria_producto) {
		ListCategoria_producto = listCategoria_producto;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
		
	

}
