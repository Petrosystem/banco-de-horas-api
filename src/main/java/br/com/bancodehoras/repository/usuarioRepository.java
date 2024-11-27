package br.com.bancodehoras.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.bancodehoras.entity.Funcionario;

public interface usuarioRepository extends JpaRepository <Funcionario,Long> {

}
