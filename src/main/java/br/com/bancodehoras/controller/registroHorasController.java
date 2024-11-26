package br.com.bancodehoras.controller;
import br.com.bancodehoras.entity.registroHoras;
import br.com.bancodehoras.service.registroHorasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/registrarHora")
public class registroHorasController {
    @Autowired
    private registroHorasService registroHorasService;

    @PostMapping("")
    public registroHoras cadastrarHoras(@RequestBody registroHoras registroHoras){
        registroHoras newRegistroHoras =  registroHorasService.save(registroHoras);
        return newRegistroHoras;

    }
}
