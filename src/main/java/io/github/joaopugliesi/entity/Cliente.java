package io.github.joaopugliesi.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "tb_agenda")
@Setter
@Getter
public class Cliente {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(nullable = false, length = 255)
	private String nome;
	
	@Email
	@Column(nullable = false, length = 255)
	private String email;
	
	@Column(nullable = false)
	private String telefone;

	public Cliente(String nome,String email, String telefone) {
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
	}

	public Cliente() {
		
	}

	
	
}
