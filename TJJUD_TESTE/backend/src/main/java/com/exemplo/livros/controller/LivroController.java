package com.exemplo.livros.controller;

import com.exemplo.livros.dto.LivroDTO;
import com.exemplo.livros.service.LivroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/livros")
public class LivroController {
    @Autowired
    private LivroService livroService;

    @GetMapping
    public List<LivroDTO> listar() {
        return livroService.listarTodos();
    }

    @PostMapping
    public LivroDTO criar(@RequestBody LivroDTO dto) {
        return livroService.salvar(dto);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        livroService.deletar(id);
    }
} 