package br.com.bancodehoras.service;

import br.com.bancodehoras.entity.RegistroHoras;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.bancodehoras.repository.RegistroHorasRepository;

import java.util.List;

@Service
public class registroHorasService {
	
	@Autowired
    private RegistroHorasRepository registroHorasRepository;

	public RegistroHoras save(RegistroHoras registroHoras){
        registroHorasRepository.save(registroHoras);
        return registroHoras;
    }

    public List<RegistroHoras> listarRegistros(){
        return registroHorasRepository.findAll();
    }

    public void deletarRegistro(Long id){
         registroHorasRepository.deleteById(id);
    }



}
