package br.com.etec.tcc.descartech.model;

import javax.persistence.*;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name="cidade")

public class Cidade {

    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer idCidade;

    private String nomecidade;

    private String uf;

    private BigInteger cep;

    @OneToMany(mappedBy = "cidade")
    private List<Usuario> usuariocidade = new ArrayList<>();

    //get and set
    public Integer getIdCidade() {
        return idCidade;
    }

    public void setIdCidade(Integer idCidade) {
        this.idCidade = idCidade;
    }

    public String getNomecidade() {
        return nomecidade;
    }

    public void setNomecidade(String nomecidade) {
        this.nomecidade = nomecidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public BigInteger getCep() {
        return cep;
    }

    public void setCep(BigInteger cep) {
        this.cep = cep;
    }

    public List<Usuario> getUsuariocidade() {
        return usuariocidade;
    }

    public void setUsuariocidade(List<Usuario> usuariocidade) {
        this.usuariocidade = usuariocidade;
    }

    // hash code
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cidade cidade = (Cidade) o;
        return idCidade.equals(cidade.idCidade);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idCidade);
    }
}
