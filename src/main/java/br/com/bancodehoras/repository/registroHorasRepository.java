package br.com.bancodehoras.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.bancodehoras.entity.registroHoras;

public interface registroHorasRepository extends JpaRepository<registroHoras, Long> {

}
