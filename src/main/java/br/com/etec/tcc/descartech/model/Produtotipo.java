package br.com.etec.tcc.descartech.model;

import javax.persistence.*;
import java.math.BigInteger;
import java.util.Objects;

@Entity
@Table(name="produtotipo")

public class Produtotipo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer idProduto;

    private String nomeproduto;
    // valor aqui é a pontuação
    private BigInteger valor;


    @ManyToOne
    @JoinColumn(name="idDescarte")
    private Descarte descarte;

    public Integer getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(Integer idProduto) {
        this.idProduto = idProduto;
    }

    public String getNomeproduto() {
        return nomeproduto;
    }

    public void setNomeproduto(String nomeproduto) {
        this.nomeproduto = nomeproduto;
    }

    public BigInteger getValor() {
        return valor;
    }

    public void setValor(BigInteger valor) {
        this.valor = valor;
    }

    public Descarte getDescarte() {
        return descarte;
    }

    public void setDescarte(Descarte descarte) {
        this.descarte = descarte;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produtotipo that = (Produtotipo) o;
        return idProduto.equals(that.idProduto);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idProduto);
    }
}
