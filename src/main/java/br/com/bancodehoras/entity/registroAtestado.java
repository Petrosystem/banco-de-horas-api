package br.com.bancodehoras.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import jakarta.validation.constraints.NotNull;

@Entity
public class registroAtestado {

	@ManyToOne
	@JoinColumn(name = "usuario_id", nullable = false)
	private Funcionario usuario;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_atestado;

	@Column(nullable = false)
	private LocalDateTime datainicio;
	@Column(nullable = false)
	private LocalDateTime datafinal;

	@Column(name = "motivo", nullable = false)
	@NotNull

	private String motivo;

	@Column
	@NotNull
	private String arquivoatestado;

	public registroAtestado(Funcionario usuario, Long id_atestado, LocalDateTime datainicio,
                            LocalDateTime datafinal, @NotNull String motivo, @NotNull String arquivoatestado) {

		this.usuario = usuario;
		this.id_atestado = id_atestado;
		this.datainicio = datainicio;
		this.datafinal = datafinal;
		this.motivo = motivo;
		this.arquivoatestado = arquivoatestado;
	}

	public Funcionario getUsuario() {
		return usuario;
	}

	public void setUsuario(Funcionario usuario) {
		this.usuario = usuario;
	}

	public LocalDateTime getDatainicio() {
		return datainicio;
	}

	public void setDatainicio(LocalDateTime datainicio) {
		this.datainicio = datainicio;
	}

	public LocalDateTime getDatafinal() {
		return datafinal;
	}

	public void setDatafinal(LocalDateTime datafinal) {
		this.datafinal = datafinal;
	}

	public String getMotivo() {
		return motivo;
	}

	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}

	public String getArquivoatestado() {
		return arquivoatestado;
	}

	public void setArquivoatestado(String arquivoatestado) {
		this.arquivoatestado = arquivoatestado;
	}

	public Long getId_atestado() {
		return id_atestado;
	}

}
