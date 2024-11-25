package br.com.bancodehoras.service;

import br.com.bancodehoras.entity.Cargos;
import br.com.bancodehoras.entity.TipoDeRegistro;
import br.com.bancodehoras.entity.registroHoras;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.bancodehoras.repository.registroHorasRepository;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Service
public class registroHorasService {
	
	@Autowired
    private registroHorasRepository registroHorasRepository;

	public registroHoras save(registroHoras registroHoras){
        registroHoras = registroHorasRepository.save(registroHoras);
        return registroHoras;
    }




}
