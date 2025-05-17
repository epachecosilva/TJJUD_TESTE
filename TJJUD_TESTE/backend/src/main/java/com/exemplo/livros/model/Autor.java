package com.exemplo.livros.model;

import jakarta.persistence.*;
import java.util.*;

@Entity
public class Autor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codAu;

    @Column(length = 40, nullable = false)
    private String nome;

    // Getters e Setters
    public Long getCodAu() { return codAu; }
    public void setCodAu(Long codAu) { this.codAu = codAu; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
} 