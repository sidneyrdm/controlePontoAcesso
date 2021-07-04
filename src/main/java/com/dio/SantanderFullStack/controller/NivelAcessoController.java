package com.dio.SantanderFullStack.controller;

import com.dio.SantanderFullStack.model.NivelAcesso;
import com.dio.SantanderFullStack.service.NivelAcessoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/nivelAcesso")
public class NivelAcessoController {

    @Autowired
    NivelAcessoService nivelAcessoService;

    @PostMapping
    public NivelAcesso createNivelAcesso(@RequestBody NivelAcesso nivelAcesso){
        return nivelAcessoService.save(nivelAcesso);
    }

    @GetMapping
    public List<NivelAcesso> getNivelAcessoList(){
        return nivelAcessoService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<NivelAcesso> getNivelAcessoById(@PathVariable Long id) throws Exception {
        return ResponseEntity.ok(nivelAcessoService.getById(id).orElseThrow(() -> new NoSuchElementException("Not Found!")));
    }

    @PutMapping
    public NivelAcesso updateNivel(@RequestBody NivelAcesso nivelAcesso){
        return nivelAcessoService.update(nivelAcesso);
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<NivelAcesso> deleteNivelAcessoById(@PathVariable Long id) throws Exception {
        try {
            nivelAcessoService.deleteById(id);
        } catch (Exception e) {
            System.out.println("Erro ao tentar deletar "+e.getMessage());
        }
        return (ResponseEntity<NivelAcesso>) ResponseEntity.ok();
    }

}
