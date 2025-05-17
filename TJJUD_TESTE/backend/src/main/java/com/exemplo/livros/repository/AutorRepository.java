package com.exemplo.livros.repository;

import com.exemplo.livros.model.Autor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AutorRepository extends JpaRepository<Autor, Long> {
} 