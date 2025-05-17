package com.exemplo.livros.repository;

import com.exemplo.livros.model.LivroAutor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivroAutorRepository extends JpaRepository<LivroAutor, Long> {
} 