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
@Table(name="Categorias_productos")
public class Categoria_producto implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_categorias_productos;
	
	@Column(name="Nombre_categoria")
	private  String Nombre_categoria;
	
	
	/*Producto__Categoria_P*/
	@ManyToOne
	@JoinColumn(name="id_producto_fk", referencedColumnName = "id_producto")
	private Producto id_producto_fk;

	
	//Getters and Setters

	public Integer getId_categorias_productos() {
		return id_categorias_productos;
	}


	public void setId_categorias_productos(Integer id_categorias_productos) {
		this.id_categorias_productos = id_categorias_productos;
	}


	public String getNombre_categoria() {
		return Nombre_categoria;
	}


	public void setNombre_categoria(String nombre_categoria) {
		Nombre_categoria = nombre_categoria;
	}


	public Producto getId_producto_fk() {
		return id_producto_fk;
	}


	public void setId_producto_fk(Producto id_producto_fk) {
		this.id_producto_fk = id_producto_fk;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	

	
	
	
	

}
