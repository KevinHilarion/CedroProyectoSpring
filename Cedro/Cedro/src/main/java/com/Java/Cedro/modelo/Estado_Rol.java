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
@Table(name="Estados_Rol")
public class Estado_Rol implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_Estado_Rol;
	
	@Column(name="Nombre_estado")
	private  String Nombre_estado;
	
	/*Estados_Rol - Roles*/
	@ManyToOne
	@JoinColumn(name="id_rol_fk", referencedColumnName = "id_Rol")
	private Rol id_rol_fk;

	/*Getters and Setters*/
	
	public Integer getId_Estado_Rol() {
		return id_Estado_Rol;
	}

	public void setId_Estado_Rol(Integer id_Estado_Rol) {
		this.id_Estado_Rol = id_Estado_Rol;
	}

	public String getNombre_estado() {
		return Nombre_estado;
	}

	public void setNombre_estado(String nombre_estado) {
		Nombre_estado = nombre_estado;
	}

	public Rol getId_rol_fk() {
		return id_rol_fk;
	}

	public void setId_rol_fk(Rol id_rol_fk) {
		this.id_rol_fk = id_rol_fk;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
	
	
	
	
	
	
}
