package com.exemplo.livros.model;

import jakarta.persistence.*;

@Entity
public class Assunto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codAs;

    @Column(length = 20, nullable = false)
    private String descricao;

    // Getters e Setters
    public Long getCodAs() { return codAs; }
    public void setCodAs(Long codAs) { this.codAs = codAs; }
    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }
} 