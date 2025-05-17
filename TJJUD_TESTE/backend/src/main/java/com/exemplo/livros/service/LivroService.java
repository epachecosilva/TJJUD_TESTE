package com.exemplo.livros.service;

import com.exemplo.livros.dto.LivroDTO;
import com.exemplo.livros.model.Livro;
import com.exemplo.livros.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class LivroService {
    @Autowired
    private LivroRepository livroRepository;

    public List<LivroDTO> listarTodos() {
        return livroRepository.findAll().stream().map(this::toDTO).collect(Collectors.toList());
    }

    public LivroDTO salvar(LivroDTO dto) {
        Livro livro = toEntity(dto);
        livro = livroRepository.save(livro);
        return toDTO(livro);
    }

    public void deletar(Long id) {
        livroRepository.deleteById(id);
    }

    private LivroDTO toDTO(Livro livro) {
        LivroDTO dto = new LivroDTO();
        dto.setCodI(livro.getCodI());
        dto.setTitulo(livro.getTitulo());
        dto.setEditora(livro.getEditora());
        dto.setEdicao(livro.getEdicao());
        dto.setAnoPublicacao(livro.getAnoPublicacao());
        dto.setValor(livro.getValor());
        // autores e assuntos devem ser preenchidos conforme relacionamento
        return dto;
    }

    private Livro toEntity(LivroDTO dto) {
        Livro livro = new Livro();
        livro.setCodI(dto.getCodI());
        livro.setTitulo(dto.getTitulo());
        livro.setEditora(dto.getEditora());
        livro.setEdicao(dto.getEdicao());
        livro.setAnoPublicacao(dto.getAnoPublicacao());
        livro.setValor(dto.getValor());
        // autores e assuntos devem ser preenchidos conforme relacionamento
        return livro;
    }
} 