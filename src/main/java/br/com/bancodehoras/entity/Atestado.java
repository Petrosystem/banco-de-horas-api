package br.com.bancodehoras.entity;

import java.time.LocalDateTime;

import jakarta.persistence.*;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "atestado")
public class Atestado {
	@Id
	@Column(name = "atestado_id")
	@GeneratedValue(strategy = GenerationType.UUID)
	private Long atestadoId;


	@ManyToOne
	@JoinColumn(name = "usuario_id", nullable = false)
	private Funcionario usuario;


	@Column(name = "data_inicio",nullable = false)
	private LocalDateTime datainicio;

	@Column(name = "data_fim",nullable = false)

	private LocalDateTime dataFim;


	private String motivo;

	@Column(name = "data_criacao")
	private LocalDateTime dataCriacao;



}