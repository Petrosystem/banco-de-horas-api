package br.com.bancodehoras.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.UUID;

@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name="funcionario")
public class Funcionario {

	@Id
	@Column(name = "funcionario_id")
	@GeneratedValue(strategy = GenerationType.UUID)
	private UUID funcionarioId;

	private String nome;

	private String email;

	private String senha;

	private Boolean is_adm;
	@CreationTimestamp
	private LocalDateTime data_criacao;

}
