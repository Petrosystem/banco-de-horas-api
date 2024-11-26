package br.com.bancodehoras.entity;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long usuario_id;

	@Column(name = "username", length = 100, nullable = false, unique = true)
	@NotNull
	private String username;

	@Column(name = "nome", length = 150, nullable = false, unique = true)
	@NotNull
	private String nome;

	@Column(name = " email", length = 140, nullable = false, unique = true)
	@NotNull
	private String email;

	@Column(name = "password", length = 60, nullable = false)
	@NotNull
	private String password;

	@Column(name = "cargo", nullable = false)
	@NotNull
	private Cargos cargo;
	
	@Column(name = "jornadahoras", nullable = false)
	@NotNull
	private Integer jornadaHoras;

	public usuario() {

	}

	public usuario(Long usuario_id, @NotNull @NotEmpty String username, @NotNull @NotEmpty String nome, @NotEmpty String email,
			@NotNull @NotEmpty String password, @NotNull @NotEmpty Cargos cargo) {
		this.usuario_id = usuario_id;
		this.username = username;
		this.nome = nome;
		this.email = email;
		this.password = password;
		this.cargo = cargo;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Long getusuario_id() {
		return usuario_id;
	}

	public Cargos getCargo() {
		return cargo;
	}

	public void setCargo(Cargos cargo) {
		this.cargo = cargo;
	}
	
	
	
	

}
