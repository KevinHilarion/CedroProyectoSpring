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
@Table(name="Telas")
public class Tela  implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_telas;
	
	@Column(name="Nombre_tela")
	private String Nombre_tela;
	
	@Column(name="Valor")
	private String Valor;
	
	/*DetalleC_Telas*/
	@ManyToOne
	@JoinColumn(name="id_detalle_cotizacion_fk", referencedColumnName = "id_detalle_cotizacion")
	private Detalle_cotizacion id_detalle_cotizacion_fk;
	
	/*Tela_ColorT*/
	@OneToMany(mappedBy ="id_telas_fk")
	private List <Color_tela>ListColor_tela;
	
	
	//Getters and Setters
	
	public Integer getId_telas() {
		return id_telas;
	}

	public void setId_telas(Integer id_telas) {
		this.id_telas = id_telas;
	}

	public String getNombre_tela() {
		return Nombre_tela;
	}

	public void setNombre_tela(String nombre_tela) {
		Nombre_tela = nombre_tela;
	}

	public String getValor() {
		return Valor;
	}

	public void setValor(String valor) {
		Valor = valor;
	}

	public Detalle_cotizacion getId_detalle_cotizacion_fk() {
		return id_detalle_cotizacion_fk;
	}

	public void setId_detalle_cotizacion_fk(Detalle_cotizacion id_detalle_cotizacion_fk) {
		this.id_detalle_cotizacion_fk = id_detalle_cotizacion_fk;
	}

	public List<Color_tela> getListColor_tela() {
		return ListColor_tela;
	}

	public void setListColor_tela(List<Color_tela> listColor_tela) {
		ListColor_tela = listColor_tela;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
	

}
