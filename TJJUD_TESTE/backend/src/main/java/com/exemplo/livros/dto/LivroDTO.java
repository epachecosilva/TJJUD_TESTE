package com.exemplo.livros.dto;

import java.math.BigDecimal;
import java.util.List;

public class LivroDTO {
    private Long codI;
    private String titulo;
    private String editora;
    private Integer edicao;
    private String anoPublicacao;
    private BigDecimal valor;
    private List<Long> autores;
    private List<Long> assuntos;

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
    public List<Long> getAutores() { return autores; }
    public void setAutores(List<Long> autores) { this.autores = autores; }
    public List<Long> getAssuntos() { return assuntos; }
    public void setAssuntos(List<Long> assuntos) { this.assuntos = assuntos; }
} 