package br.gov.sp.etec.gestaofesta.model;

import java.time.LocalDate;
import java.time.LocalTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Evento {
    
	@Id
	@GeneratedValue
	private Long id;
	
	private String nome;
	
	private String local;
	
	private LocalDate data;
	
	private LocalTime horaii;
	
	private LocalTime horaff;

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

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public LocalTime getHoraii() {
		return horaii;
	}

	public void setHoraii(LocalTime horaii) {
		this.horaii = horaii;
	}

	public LocalTime getHoraff() {
		return horaff;
	}

	public void setHoraff(LocalTime horaff) {
		this.horaff = horaff;
	}
	
	
	
}
