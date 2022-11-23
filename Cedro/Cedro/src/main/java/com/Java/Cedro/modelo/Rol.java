package com.Java.Cedro.modelo;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="Roles")
public class Rol implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_Rol;
	
	@Column(name="Nombre_Rol")
	private  String Nombre;
	
	
	/*Estados_Rol - Roles*/
	@JsonIgnore
	@OneToMany(mappedBy ="id_rol_fk")
	private List <Estado_Rol>ListEstado_Rol;
	
	
	
	
	
	
	/*Getters and Setters*/
	
	public Integer getId_Rol() {
		return id_Rol;
	}

	public void setId_Rol(Integer id_Rol) {
		this.id_Rol = id_Rol;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
	
}
