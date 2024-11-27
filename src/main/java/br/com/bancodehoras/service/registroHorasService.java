package br.com.bancodehoras.service;

import br.com.bancodehoras.entity.RegistroHoras;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.bancodehoras.repository.registroHorasRepository;

@Service
public class registroHorasService {
	
	@Autowired
    private registroHorasRepository registroHorasRepository;

	public RegistroHoras save(RegistroHoras registroHoras){
        registroHoras = registroHorasRepository.save(registroHoras);
        return registroHoras;
    }




}
