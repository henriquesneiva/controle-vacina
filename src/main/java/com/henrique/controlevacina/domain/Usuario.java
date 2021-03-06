package com.henrique.controlevacina.domain;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.br.CPF;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
public class Usuario implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column()
	@NotNull(message = "compo nome é obrigatorio.")
	private String nome;
	@Column(unique = true)
	@Email
	@NotNull(message = "compo email é obrigatorio.")
	private String email;
	@Column(unique = true )
	@CPF
	@NotNull(message = "compo cpf é obrigatorio.")
	private String cpf;

	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private LocalDate data_nacimento;
	
	@OneToMany(mappedBy = "usuario")
	@JsonBackReference
	private List<Vacina> vacina;
	
	public Usuario() {
		super();
	}

	public Usuario(Integer id, String nome, String email, String cpf, LocalDate data_nacimento) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.cpf = cpf;
		this.data_nacimento = data_nacimento;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public LocalDate getData_nacimento() {
		return data_nacimento;
	}

	public void setData_nacimento(LocalDate data_nacimento) {
		this.data_nacimento = data_nacimento;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
	public List<Vacina> getVacina() {
		return vacina;
	}

	public void setVacina(List<Vacina> vacina) {
		this.vacina = vacina;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
