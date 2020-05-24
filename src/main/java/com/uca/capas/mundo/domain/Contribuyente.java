package com.uca.capas.mundo.domain;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(schema="public", name="contribuyente")
public class Contribuyente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="c_contribuyente")
	private Integer id_contribuyente;
	
	@ManyToOne(fetch= FetchType.LAZY)
	@JoinColumn(name="c_importancia")
	private Importancia importancia;
	
	@Transient
	private Integer id_importancia;
	
	@Column(name="s_nombre")
	private String nombre;
	
	@Column(name="s_apellido")
	private String apellido;
	
	@Column(name="s_nit")
	private String nit;
	
	@Column(name="f_fecha_ingreso")
	private Date fIngreso;
	
	
	public Contribuyente() {}
	
	public Importancia getImportancia() {
		
		return importancia;
	}
	public void setImportancia(Importancia importancia) {
		this.importancia = importancia;
		
	}
	
	public Integer getId_contribuyente() {
		return id_contribuyente;
	}
	public void setId_contribuyente(Integer id_contribuyente) {
		this.id_contribuyente = id_contribuyente;
	}
	public Integer getId_importancia() {
		return id_importancia;
	}
	public void setId_importancia(Integer id_importancia) {
		this.id_importancia = id_importancia;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getNit() {
		return nit;
	}
	public void setNit(String nit) {
		this.nit = nit;
	}
	public Date getfIngreso() {
		return fIngreso;
	}
	public void setfIngreso(Date fIngreso) {
		this.fIngreso = fIngreso;
	}
	
	
	
	

}
