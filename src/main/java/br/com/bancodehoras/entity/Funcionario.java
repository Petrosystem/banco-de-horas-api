package br.com.bancodehoras.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Date;

@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name="funcionarios")
public class Funcionario {

	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private Long funcionarioId;

	private String nome;

	private String email;

	@NotNull
	private String senha;

	@NotNull
	private Boolean is_adm;
	
	@NotNull
	private LocalDateTime data_criacao;

}
