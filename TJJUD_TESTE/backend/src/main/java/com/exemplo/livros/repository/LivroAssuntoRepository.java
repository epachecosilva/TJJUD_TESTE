package com.exemplo.livros.repository;

import com.exemplo.livros.model.LivroAssunto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivroAssuntoRepository extends JpaRepository<LivroAssunto, Long> {
} 