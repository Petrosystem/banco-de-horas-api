package br.com.bancodehoras.service;

import br.com.bancodehoras.entity.Atestado;
import br.com.bancodehoras.repository.registroAtestadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
;import java.util.List;

@Service
public class AtestadoService {

    @Autowired registroAtestadoRepository atestadoRepository;

    public Atestado criarAtestado(Atestado atestado){
        atestadoRepository.save(atestado);
        return atestado;
    }

    public List<Atestado> listarAtestados(){
        return atestadoRepository.findAll();
    }

    public void deletarAtestado(Long id){
        atestadoRepository.deleteById(id);
    }
}
