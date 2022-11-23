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
@Table(name="orden_de_produccion")
public class orden_de_produccion  implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_orden_de_produccion;

	
	@Column(name="Fecha")
	private String Fecha;
	
	/*OrdenPro_DetallePro*/
	@ManyToOne
	@JoinColumn(name="id_detallePro_fk", referencedColumnName = "id_detallePro")
	private Detalle_de_produccion id_detallePro_fk;
	
	/*OrdenPro_Venta*/
	@ManyToOne
	@JoinColumn(name="id_venta_fk", referencedColumnName = "id_ventas")
	private Venta id_venta_fk;
	
	
	/*EstadoOrdenPro_OrdenPro*/
	@OneToMany(mappedBy ="id_orden_de_produccion_fk")
	private List <Estado_orden_produccion>ListEstado_orden_produccion;
	
	//Getters and Setters
	
	public Integer getId_orden_de_produccion() {
		return id_orden_de_produccion;
	}

	public void setId_orden_de_produccion(Integer id_orden_de_produccion) {
		this.id_orden_de_produccion = id_orden_de_produccion;
	}

	public String getFecha() {
		return Fecha;
	}

	public void setFecha(String fecha) {
		this.Fecha = fecha;
	}

	public Detalle_de_produccion getId_detallePro_fk() {
		return id_detallePro_fk;
	}

	public void setId_detallePro_fk(Detalle_de_produccion id_detallePro_fk) {
		this.id_detallePro_fk = id_detallePro_fk;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Venta getId_venta_fk() {
		return id_venta_fk;
	}

	public void setId_venta_fk(Venta id_venta_fk) {
		this.id_venta_fk = id_venta_fk;
	}

	public List<Estado_orden_produccion> getListEstado_orden_produccion() {
		return ListEstado_orden_produccion;
	}

	public void setListEstado_orden_produccion(List<Estado_orden_produccion> listEstado_orden_produccion) {
		ListEstado_orden_produccion = listEstado_orden_produccion;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
