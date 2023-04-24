package br.com.etec.tcc.descartech.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name="doacoes")

public class Doacoes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer idDoacao;

    @OneToMany(mappedBy = "doacoes")
    private List<Doacoes_quem> doacoesdoacoesquem = new ArrayList<>();

    @ManyToOne
    @JoinColumn(name="idUsuario")
    private Usuario usuario;

    public Integer getIdDoacao() {
        return idDoacao;
    }

    public void setIdDoacao(Integer idDoacao) {
        this.idDoacao = idDoacao;
    }

    public List<Doacoes_quem> getDoacoesdoacoesquem() {
        return doacoesdoacoesquem;
    }

    public void setDoacoesdoacoesquem(List<Doacoes_quem> doacoesdoacoesquem) {
        this.doacoesdoacoesquem = doacoesdoacoesquem;
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
        Doacoes doacoes = (Doacoes) o;
        return idDoacao.equals(doacoes.idDoacao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idDoacao);
    }
}
