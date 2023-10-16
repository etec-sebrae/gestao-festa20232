package br.gov.sp.etec.gestaofesta.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Convidado {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY )
	private long idConvidado;
	private String nome;
	private String rg;
	private String cpf;
	
	@ManyToOne
	private Evento evento;
	
	public long getIdConvidado() {
		return idConvidado;
	}
	public void setIdConvidado(long idConvidado) {
		this.idConvidado = idConvidado;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	
	
	public int getNumeroacompanhante() {
		return numeroacompanhante;
	}
	public void setNumeroacompanhante(int numeroacompanhante) {
		this.numeroacompanhante = numeroacompanhante;
	}
	private int numeroacompanhante;

	public Evento getEvento() {
		return evento;
	}
	public void setEvento(Evento evento) {
		this.evento = evento;
	}
	
	
	
}
