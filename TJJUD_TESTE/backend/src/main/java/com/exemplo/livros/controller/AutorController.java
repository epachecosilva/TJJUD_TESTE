package com.exemplo.livros.controller;

import com.exemplo.livros.model.Autor;
import com.exemplo.livros.service.AutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/autores")
public class AutorController {
    @Autowired
    private AutorService autorService;

    @GetMapping
    public List<Autor> listar() {
        return autorService.listarTodos();
    }

    @PostMapping
    public Autor criar(@RequestBody Autor autor) {
        return autorService.salvar(autor);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        autorService.deletar(id);
    }
} 