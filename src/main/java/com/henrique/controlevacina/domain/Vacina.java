package com.henrique.controlevacina.domain;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Vacina implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private String nome;

	private LocalDate dataVacina;
	
	@ManyToOne
	private Usuario usuario;
	
	public Vacina() {
		super();
	}


	public Vacina(Integer id, String nome, LocalDate dataVacina, Usuario usuario) {
		super();
		this.id = id;
		this.nome = nome;
		this.dataVacina = dataVacina;
		this.usuario = usuario;
	}



	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public LocalDate getDataVacina() {
		return dataVacina;
	}

	public void setDataVacina(LocalDate dataVacina) {
		this.dataVacina = dataVacina;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}
