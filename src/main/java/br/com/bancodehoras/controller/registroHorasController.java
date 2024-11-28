package br.com.bancodehoras.controller;
import br.com.bancodehoras.entity.RegistroHoras;
import br.com.bancodehoras.service.registroHorasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/registrarHora")
public class registroHorasController {
    @Autowired
    private registroHorasService registroHorasService;


    @GetMapping("listar")
    public List<RegistroHoras> listarHoras(){
        return registroHorasService.listarRegistros();
    }

    @PostMapping("/criar")
    public RegistroHoras cadastrarHoras(@RequestBody RegistroHoras registroHoras){
        return registroHorasService.save(registroHoras);

    }

    @DeleteMapping("/{id}")
    public void deletarRegistro(Long id){
        registroHorasService.deletarRegistro(id);
    }
}
