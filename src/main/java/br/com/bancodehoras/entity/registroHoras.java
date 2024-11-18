package br.com.bancodehoras.entity;

import java.time.LocalDateTime;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

@Entity
public class registroHoras {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long bancoHorasID;
	
	@ManyToOne
	@JoinColumn(name= "usuario_id", nullable = false)
	private usuario usuario;

	@Column
	@NotNull
	
	private LocalDateTime dataEntrada;
	
	@Column
	@NotNull
	
	private LocalDateTime dataSaida;
	
	public registroHoras() {
		
	}

	public registroHoras(Long bancoHorasID, br.com.bancodehoras.entity.usuario usuario,
			@NotNull @NotEmpty LocalDateTime dataEntrada, @NotNull @NotEmpty LocalDateTime dataSaida) {
		this.bancoHorasID = bancoHorasID;
		this.usuario = usuario;
		this.dataEntrada = dataEntrada;
		this.dataSaida = dataSaida;
	}

	public usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(usuario usuario) {
		this.usuario = usuario;
	}

	public LocalDateTime getDataEntrada() {
		return dataEntrada;
	}

	public void setDataEntrada(LocalDateTime dataEntrada) {
		this.dataEntrada = dataEntrada;
	}

	public LocalDateTime getDataSaida() {
		return dataSaida;
	}

	public void setDataSaida(LocalDateTime dataSaida) {
		this.dataSaida = dataSaida;
	}

	public Long getBancoHorasID() {
		return bancoHorasID;
	}
	
	
	
	
	
}
