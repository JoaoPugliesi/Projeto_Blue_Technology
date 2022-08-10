package io.github.joaopugliesi.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ClienteDto {

	@NotBlank
	@NotEmpty
	private String nome;
	
	@NotBlank
	@Email
	private String email;
	
	@NotBlank
	private String telefone;
}
