package br.com.bancodehoras.entity;

import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.persistence.*;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

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
	private UUID atestadoId;


	@ManyToOne
	@JoinColumn(name = "funcionario_id", nullable = false)
	private Funcionario funcionario;


	@Column(name = "data_inicio",nullable = false)
	private LocalDateTime datainicio;

	@Column(name = "data_fim",nullable = false)

	private LocalDateTime dataFim;


	private String motivo;

	@Column(name = "data_criacao")
	@CreationTimestamp
	private LocalDateTime dataCriacao;



}
