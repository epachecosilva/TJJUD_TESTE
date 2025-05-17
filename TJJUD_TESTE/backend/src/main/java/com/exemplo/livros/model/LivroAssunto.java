package com.exemplo.livros.model;

import jakarta.persistence.*;
import java.io.Serializable;

@Entity
@IdClass(LivroAssuntoId.class)
public class LivroAssunto {
    @Id
    private Long livroCodI;
    @Id
    private Long assuntoCodAs;

    // Getters e Setters
    public Long getLivroCodI() { return livroCodI; }
    public void setLivroCodI(Long livroCodI) { this.livroCodI = livroCodI; }
    public Long getAssuntoCodAs() { return assuntoCodAs; }
    public void setAssuntoCodAs(Long assuntoCodAs) { this.assuntoCodAs = assuntoCodAs; }
}

class LivroAssuntoId implements Serializable {
    private Long livroCodI;
    private Long assuntoCodAs;
    // equals e hashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LivroAssuntoId that = (LivroAssuntoId) o;
        return livroCodI.equals(that.livroCodI) && assuntoCodAs.equals(that.assuntoCodAs);
    }
    @Override
    public int hashCode() {
        return java.util.Objects.hash(livroCodI, assuntoCodAs);
    }
} 