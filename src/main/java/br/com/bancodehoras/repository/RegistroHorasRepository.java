package br.com.bancodehoras.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.bancodehoras.entity.RegistroHoras;

public interface RegistroHorasRepository extends JpaRepository<RegistroHoras, Long> {

}
