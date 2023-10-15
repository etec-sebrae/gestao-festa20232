package br.gov.sp.etec.gestaofesta.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Logiin {
 
	@Id
	@GeneratedValue
	private Long id;

	@Column(unique = true)
	private String email;
    private String senha;
    
    private String nome;
    
    private String cpf;
    
    private String genero;
    
    private LocalDate dataNascimento;
    
    public String getnome() {
		return nome;
	}

	public void setnome(String nome) {
		this.nome = nome;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	@Override
	public String toString() {
		return "Logiin [id=" + id + ", email=" + email + ", senha=" + senha + ", cpf=" + cpf + ", genero=" + genero
				+ ", dataNascimento=" + dataNascimento + ", getId()=" + getId() + ", getEmail()=" + getEmail()
				+ ", getSenha()=" + getSenha() + ", getCpf()=" + getCpf() + ", getGenero()=" + getGenero()
				+ ", getDataNascimento()=" + getDataNascimento() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
    
    
   
    
}
