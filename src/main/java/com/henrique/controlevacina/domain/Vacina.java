package com.henrique.controlevacina.domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class Vacina implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private String nome;

	@JsonManagedReference
	@OneToMany(mappedBy = "vacina")
	private List<UsuarioVacina> usuarioVacinas;

	public Vacina() {
		super();
	}

	public Vacina(Integer id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
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

	public List<UsuarioVacina> getUsuarioVacinas() {
		return usuarioVacinas;
	}

	public void setUsuarioVacinas(List<UsuarioVacina> usuarioVacinas) {
		this.usuarioVacinas = usuarioVacinas;
	}

}
