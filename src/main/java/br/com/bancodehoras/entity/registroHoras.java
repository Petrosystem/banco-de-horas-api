package br.com.bancodehoras.entity;

import java.time.LocalDateTime;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

@Entity
public class registroHoras {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long bancoHorasID;

	@ManyToOne
	@JoinColumn(name = "usuario_id", nullable = false)
	private usuario usuario;

	@Column(nullable = false)
	@NotNull
	private LocalDateTime dataRegistro;

	@Column(nullable = false)
	@NotNull
	private LocalDateTime hora;

	@Enumerated(EnumType.STRING)
	@Column(nullable = false)
	@NotNull
	private TipoDeRegistro tipoDeRegistro;

	// Construtor padrão
	public registroHoras() {}

	// Construtor com parâmetros
	public registroHoras(Long bancoHorasID, usuario usuario, LocalDateTime dataRegistro, LocalDateTime hora, TipoDeRegistro tipoDeRegistro) {
		this.bancoHorasID = bancoHorasID;
		this.usuario = usuario;
		this.dataRegistro = dataRegistro;
		this.hora = hora;
		this.tipoDeRegistro = tipoDeRegistro;
	}

	// Getters e Setters
	public Long getBancoHorasID() {
		return bancoHorasID;
	}

	public usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(usuario usuario) {
		this.usuario = usuario;
	}

	public LocalDateTime getDataRegistro() {
		return dataRegistro;
	}

	public void setDataRegistro(LocalDateTime dataRegistro) {
		this.dataRegistro = dataRegistro;
	}

	public LocalDateTime getHora() {
		return hora;
	}

	public void setHora(LocalDateTime hora) {
		this.hora = hora;
	}

	public TipoDeRegistro getTipoDeRegistro() {
		return tipoDeRegistro;
	}

	public void setTipoDeRegistro(TipoDeRegistro tipoDeRegistro) {
		this.tipoDeRegistro = tipoDeRegistro;
	}
}
