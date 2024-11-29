package br.com.bancodehoras.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.bancodehoras.entity.Funcionario;
import br.com.bancodehoras.service.usuarioService;

@RestController
@RequestMapping("/usuario")
public class usuarioController {

	@Autowired
	private usuarioService usuarioService;

	@ResponseStatus(HttpStatus.CREATED)
	@PostMapping("/salvar")
	public Funcionario cadastrarUsuario(@RequestBody Funcionario usuario) {
		return usuarioService.salvarUsuario(usuario);

	}

	@ResponseStatus(HttpStatus.OK)
	@GetMapping("/listar-user")
	@ResponseBody
	public List<Funcionario> listarUsuario() {
		List<Funcionario> usuario = usuarioService.ListarUsuario();
		return usuario;
	}

}
