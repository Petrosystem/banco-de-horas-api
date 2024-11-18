package br.com.bancodehoras.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.bancodehoras.entity.usuario;

public interface usuarioRepository extends JpaRepository <usuario ,Long> {

}
