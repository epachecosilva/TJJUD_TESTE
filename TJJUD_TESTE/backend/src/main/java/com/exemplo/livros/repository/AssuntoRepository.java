package com.exemplo.livros.repository;

import com.exemplo.livros.model.Assunto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AssuntoRepository extends JpaRepository<Assunto, Long> {
} 