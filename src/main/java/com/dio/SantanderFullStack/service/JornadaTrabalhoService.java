package com.dio.SantanderFullStack.service;

import com.dio.SantanderFullStack.model.JornadaTrabalho;
import com.dio.SantanderFullStack.repository.JornadaTrabalhoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JornadaTrabalhoService {

    JornadaTrabalhoRepository jornadaTrabalhoRepository;

    @Autowired
    public JornadaTrabalhoService(JornadaTrabalhoRepository jornadaTrabalhoRepository) {
        this.jornadaTrabalhoRepository = jornadaTrabalhoRepository;
    }

    public JornadaTrabalho save(JornadaTrabalho jornadaTrabalho){
        return jornadaTrabalhoRepository.save(jornadaTrabalho);
    }

    public List<JornadaTrabalho> findAll() {
        return jornadaTrabalhoRepository.findAll();
    }

    public Optional<JornadaTrabalho> getById(Long idJornada) {
    return jornadaTrabalhoRepository.findById(idJornada);
    }

    public JornadaTrabalho update(JornadaTrabalho jornadaTrabalho){
        return jornadaTrabalhoRepository.save(jornadaTrabalho);
    }

    public Optional<JornadaTrabalho> deleteById(Long idJornada) {
        Optional<JornadaTrabalho> jornadaTrabalho = this.getById(idJornada);

        jornadaTrabalhoRepository.deleteById(jornadaTrabalho.get().getId());
        return jornadaTrabalho;
    }
}
