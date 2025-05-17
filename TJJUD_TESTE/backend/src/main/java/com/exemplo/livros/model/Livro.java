package com.exemplo.livros.model;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.util.*;

@Entity
public class Livro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codI;

    @Column(length = 40, nullable = false)
    private String titulo;

    @Column(length = 40)
    private String editora;

    private Integer edicao;

    @Column(length = 4)
    private String anoPublicacao;

    @Column(nullable = false)
    private BigDecimal valor;

    // Getters e Setters
    public Long getCodI() { return codI; }
    public void setCodI(Long codI) { this.codI = codI; }
    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }
    public String getEditora() { return editora; }
    public void setEditora(String editora) { this.editora = editora; }
    public Integer getEdicao() { return edicao; }
    public void setEdicao(Integer edicao) { this.edicao = edicao; }
    public String getAnoPublicacao() { return anoPublicacao; }
    public void setAnoPublicacao(String anoPublicacao) { this.anoPublicacao = anoPublicacao; }
    public BigDecimal getValor() { return valor; }
    public void setValor(BigDecimal valor) { this.valor = valor; }
} 