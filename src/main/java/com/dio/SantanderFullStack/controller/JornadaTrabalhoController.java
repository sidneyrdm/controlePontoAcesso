package com.dio.SantanderFullStack.controller;

import com.dio.SantanderFullStack.model.JornadaTrabalho;
import com.dio.SantanderFullStack.service.JornadaTrabalhoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController //já retorna um JSON
@RequestMapping("/jornada")
public class JornadaTrabalhoController {

    @Autowired
    JornadaTrabalhoService jornadaTrabalhoService;

    @PostMapping
    public JornadaTrabalho createJornada(@RequestBody JornadaTrabalho jornadaTrabalho){
    return jornadaTrabalhoService.save(jornadaTrabalho);
    }

    @GetMapping
    public List<JornadaTrabalho> getJornadaTrabalhoList(){
        return jornadaTrabalhoService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<JornadaTrabalho> getjornadaTrabalhoById(@PathVariable Long id) throws Exception {
        return ResponseEntity.ok(jornadaTrabalhoService.getById(id).orElseThrow(() -> new NoSuchElementException("Not Found!")));
    }

    @PutMapping
    public JornadaTrabalho updateJornada(@RequestBody JornadaTrabalho jornadaTrabalho){
        return jornadaTrabalhoService.update(jornadaTrabalho);
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<JornadaTrabalho> deletejornadaTrabalhoById(@PathVariable Long id) throws Exception {
        try {
            jornadaTrabalhoService.deleteById(id);
        } catch (Exception e) {
            System.out.println("Erro ao tentar deletar "+e.getMessage());
        }
        return (ResponseEntity<JornadaTrabalho>) ResponseEntity.ok();
    }
}
