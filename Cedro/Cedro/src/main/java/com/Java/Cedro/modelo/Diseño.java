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
@Table(name="Diseños")
public class Diseño implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_diseño;
	
	@Column(name="Nombre_diseño")
	private  String Nombre_diseño;

	
	/*Producto__Diseño*/
	@ManyToOne
	@JoinColumn(name="id_producto_fk", referencedColumnName = "id_producto")
	private Producto id_producto_fk;


	//Getters and Setters
	
	
	public Integer getId_diseño() {
		return id_diseño;
	}


	public void setId_diseño(Integer id_diseño) {
		this.id_diseño = id_diseño;
	}


	public String getNombre_diseño() {
		return Nombre_diseño;
	}


	public void setNombre_diseño(String nombre_diseño) {
		Nombre_diseño = nombre_diseño;
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
