package com.proficao.educadores_Model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class EduModel {

	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	
	private Long id;
	private String nome;
	private String materia;
	
	public EduModel() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}
	
	
	
	
}
