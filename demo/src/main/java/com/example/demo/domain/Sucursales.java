package com.example.demo.domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * @author yodelgado
 *
 */
@Entity
@Table(name="SUCURSALES")
public class Sucursales implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long sucursaleId;
	private String nombre;
	@OneToOne(targetEntity = Ordenes.class)
	private List<Ordenes> ordenes;
	
	
	public Long getSucursaleId() {
		return sucursaleId;
	}
	public void setSucursaleId(Long sucursaleId) {
		this.sucursaleId = sucursaleId;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public List<Ordenes> getOrdenes() {
		return ordenes;
	}
	public void setOrdenes(List<Ordenes> ordenes) {
		this.ordenes = ordenes;
	}
	
	
}
