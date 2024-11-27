package br.com.bancodehoras.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.bancodehoras.entity.Funcionario;
import br.com.bancodehoras.repository.usuarioRepository;
import jakarta.transaction.Transactional;

@Service
public class usuarioService {

	@Autowired
	private usuarioRepository usuarioRepository;

	public List<Funcionario> ListarUsuario() {
		List<Funcionario> usuario = usuarioRepository.findAll();
		return usuario;

	}

	@Transactional
	public Funcionario salvarUsuario(Funcionario usuario) {
		usuario = usuarioRepository.save(usuario);
		return usuario;
	}

}
