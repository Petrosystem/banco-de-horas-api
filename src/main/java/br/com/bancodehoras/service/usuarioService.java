package br.com.bancodehoras.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.bancodehoras.entity.usuario;
import br.com.bancodehoras.repository.usuarioRepository;
import jakarta.transaction.Transactional;

@Service
public class usuarioService {

	@Autowired
	private usuarioRepository usuarioRepository;

	public List<usuario> ListarUsuario() {
		List<usuario> usuario = usuarioRepository.findAll();
		return usuario;

	}

	@Transactional
	public usuario salvarUsuario(usuario usuario) {
		usuario = usuarioRepository.save(usuario);
		return usuario;
	}

}
