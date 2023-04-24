package br.com.etec.tcc.descartech.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name="descarte")

public class Descarte {

    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer idDescarte;


    @OneToMany(mappedBy = "descarte")
    private List<Produtotipo> descarteprodutotipo = new ArrayList<>();


    @ManyToOne
    @JoinColumn(name="idUsuario")
    private Usuario usuario;

    public Integer getIdDescarte() {
        return idDescarte;
    }

    public void setIdDescarte(Integer idDescarte) {
        this.idDescarte = idDescarte;
    }

    public List<Produtotipo> getDescarteprodutotipo() {
        return descarteprodutotipo;
    }

    public void setDescarteprodutotipo(List<Produtotipo> descarteprodutotipo) {
        this.descarteprodutotipo = descarteprodutotipo;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Descarte descarte = (Descarte) o;
        return idDescarte.equals(descarte.idDescarte);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idDescarte);
    }
}
