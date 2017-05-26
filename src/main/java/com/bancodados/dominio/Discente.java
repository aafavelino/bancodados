package com.bancodados.dominio;

import java.util.Calendar;
import java.util.List;


public class Discente extends Usuario{

	
	// pode virar um enum
	private Long matricula;
	private String reputacao;
	
	//construtores
	public Discente(String nome, Integer idade, Integer cpf, Endereco endereco, String email,
			String curriculo, Calendar dataNascimento, Identificacao identidicacao,
			List<String> areasConhecimento, Long matricula, String reputacao) {
		super(nome, idade, cpf, endereco, email, curriculo, dataNascimento, identidicacao);
		this.matricula = matricula;
		this.reputacao = reputacao;
	}
	
	public Discente() {
		// TODO Auto-generated constructor stub
	}
	
	
	//getters and setters
	
	public Long getMatricula() {
		return matricula;
	}
	public void setMatricula(Long matricula) {
		this.matricula = matricula;
	}
	public String getReputacao() {
		return reputacao;
	}
	public void setReputacao(String reputacao) {
		this.reputacao = reputacao;
	}
	
	
	
}