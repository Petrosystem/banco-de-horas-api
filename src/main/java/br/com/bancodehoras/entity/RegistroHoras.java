package br.com.bancodehoras.entity;

import java.math.BigDecimal;
import java.sql.Time;
import java.time.LocalDateTime;
import java.util.Date;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "registro_horas")
public class RegistroHoras {

	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	@Column(name = "registro_id")
	private Long registroId;

	@Column(name = "horas_trabalhadas")
	private Time horasTrabalhadas;

	@ManyToOne
	@JoinColumn(name = "usuario_id", nullable = false)
	private Funcionario funcionario;

	@Column(name = "data_registro")
	private Date dataRegistro;


	private LocalDateTime hora;

	@Column(name = "hora_extra")
	private BigDecimal horaExtra;

	@Column(name = "hora_saida")
	private Time horaSaida;

	@Column(name = "hora_entrada")
	private Time horaEntrada;

	@Column(name = "data_criacao")
	private LocalDateTime dataCriacao;





}
