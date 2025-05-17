package com.exemplo.livros.service;

import com.exemplo.livros.model.Assunto;
import com.exemplo.livros.repository.AssuntoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AssuntoService {
    @Autowired
    private AssuntoRepository assuntoRepository;

    public List<Assunto> listarTodos() {
        return assuntoRepository.findAll();
    }

    public Assunto salvar(Assunto assunto) {
        return assuntoRepository.save(assunto);
    }

    public void deletar(Long id) {
        assuntoRepository.deleteById(id);
    }
} 