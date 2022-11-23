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
@Table(name="usuarios")
public class Usuario implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_usuario;
	
	@Column(name="Nombre", nullable = false)
	private String Nombre;
	
	@Column(name="Apellido", nullable = false)
	private String Apellido;

	@Column(name="Tipo_documento", nullable = false)
	private String Tipo_documento;
	
	@Column(name="Numero_documento", nullable = false)
	private String Numero_documento;
	
	@Column(name="Telefono", nullable = false)
	private String Telefono;

	@Column(name="Direccion", nullable = false)
	private String Direccion;
	
	@Column(name="Correo", nullable = false)
	private String Correo;
	
	@Column(name="Contraseña", nullable = false)
	private String Contraseña;
	
	/*Usuario_Cliente*/
	@JsonIgnore
	@OneToMany(mappedBy ="id_usuario_fk")
	private List <Cliente>ListCliente;
	
	
	/*Usuario_Vendedor*/
	@JsonIgnore
	@OneToMany(mappedBy ="id_usuario_fk")
	private List <Vendedor>ListVendedor;
	
	
	
	
	
	
	/*Getters and Setters*/
	public Integer getId_usuario() {
		return id_usuario;
	}

	public void setId_usuario(Integer id_usuario) {
		this.id_usuario = id_usuario;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getApellido() {
		return Apellido;
	}

	public void setApellido(String apellido) {
		Apellido = apellido;
	}

	public String getTipo_documento() {
		return Tipo_documento;
	}

	public void setTipo_documento(String tipo_documento) {
		Tipo_documento = tipo_documento;
	}

	public String getNumero_documento() {
		return Numero_documento;
	}

	public void setNumero_documento(String numero_documento) {
		Numero_documento = numero_documento;
	}

	public String getTelefono() {
		return Telefono;
	}

	public void setTelefono(String telefono) {
		Telefono = telefono;
	}

	public String getDireccion() {
		return Direccion;
	}

	public void setDireccion(String direccion) {
		Direccion = direccion;
	}

	public String getCorreo() {
		return Correo;
	}

	public void setCorreo(String correo) {
		Correo = correo;
	}

	public String getContraseña() {
		return Contraseña;
	}

	public void setContraseña(String contraseña) {
		Contraseña = contraseña;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
	
	
	

}
