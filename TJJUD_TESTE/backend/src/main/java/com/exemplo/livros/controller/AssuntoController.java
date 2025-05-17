package com.exemplo.livros.controller;

import com.exemplo.livros.model.Assunto;
import com.exemplo.livros.service.AssuntoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/assuntos")
public class AssuntoController {
    @Autowired
    private AssuntoService assuntoService;

    @GetMapping
    public List<Assunto> listar() {
        return assuntoService.listarTodos();
    }

    @PostMapping
    public Assunto criar(@RequestBody Assunto assunto) {
        return assuntoService.salvar(assunto);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        assuntoService.deletar(id);
    }
} 