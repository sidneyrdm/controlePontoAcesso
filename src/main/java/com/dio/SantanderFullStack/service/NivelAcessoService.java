package com.dio.SantanderFullStack.service;

import com.dio.SantanderFullStack.model.NivelAcesso;
import com.dio.SantanderFullStack.repository.NivelAcessoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NivelAcessoService {

    NivelAcessoRepository nivelAcessoRepository;

    @Autowired
    public NivelAcessoService(NivelAcessoRepository nivelAcessoRepository) {
        this.nivelAcessoRepository = nivelAcessoRepository;
    }

    public NivelAcesso save(NivelAcesso nivelAcesso) {
      return  nivelAcessoRepository.save(nivelAcesso);
    }

    public List<NivelAcesso> findAll() {
        return nivelAcessoRepository.findAll();
    }

    public Optional<NivelAcesso> getById(Long id) {
        return nivelAcessoRepository.findById(id);
    }

    public NivelAcesso update(NivelAcesso nivelAcesso){
        return nivelAcessoRepository.save(nivelAcesso);
    }

    public Optional<NivelAcesso> deleteById(Long id) {
        Optional<NivelAcesso> nivelAcesso = this.getById(id);

        nivelAcessoRepository.deleteById(nivelAcesso.get().getId());
        return nivelAcesso;
    }
}
