package com.exemplo.livros.model;

import jakarta.persistence.*;
import java.io.Serializable;

@Entity
@IdClass(LivroAutorId.class)
public class LivroAutor {
    @Id
    private Long livroCodI;
    @Id
    private Long autorCodAu;

    // Getters e Setters
    public Long getLivroCodI() { return livroCodI; }
    public void setLivroCodI(Long livroCodI) { this.livroCodI = livroCodI; }
    public Long getAutorCodAu() { return autorCodAu; }
    public void setAutorCodAu(Long autorCodAu) { this.autorCodAu = autorCodAu; }
}

class LivroAutorId implements Serializable {
    private Long livroCodI;
    private Long autorCodAu;
    // equals e hashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LivroAutorId that = (LivroAutorId) o;
        return livroCodI.equals(that.livroCodI) && autorCodAu.equals(that.autorCodAu);
    }
    @Override
    public int hashCode() {
        return java.util.Objects.hash(livroCodI, autorCodAu);
    }
} 