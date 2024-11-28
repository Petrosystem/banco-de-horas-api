package br.com.bancodehoras.controller;

import br.com.bancodehoras.entity.Atestado;
import br.com.bancodehoras.service.AtestadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/atestado")
public class AtestadoController {
    @Autowired
    private AtestadoService atestadoService;

    @GetMapping("/listar")
    public List<Atestado> listarAtestados(){
        return atestadoService.listarAtestados();
    }

    @PostMapping("/criar")
    public Atestado salvarAtestado(@RequestBody Atestado atestado){
        return atestadoService.criarAtestado(atestado);
    }

    @DeleteMapping("/{id}")
    public void deletarAtestado(@PathVariable Long id){
        atestadoService.deletarAtestado(id);
    }
}
