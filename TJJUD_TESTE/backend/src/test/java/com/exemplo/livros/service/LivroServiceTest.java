package com.exemplo.livros.service;

import com.exemplo.livros.dto.LivroDTO;
import com.exemplo.livros.model.Livro;
import com.exemplo.livros.repository.LivroRepository;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import java.math.BigDecimal;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

class LivroServiceTest {
    @Mock
    private LivroRepository livroRepository;

    @InjectMocks
    private LivroService livroService;

    public LivroServiceTest() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testSalvar() {
        LivroDTO dto = new LivroDTO();
        dto.setTitulo("Teste");
        dto.setValor(BigDecimal.valueOf(10.0));
        Livro livro = new Livro();
        livro.setTitulo(dto.getTitulo());
        livro.setValor(dto.getValor());
        when(livroRepository.save(any(Livro.class))).thenReturn(livro);

        assertNotNull(livroService.salvar(dto));
    }
} 