package br.com.etec.tcc.descartech.repository.filter;

import java.math.BigInteger;

public class ProdutotipoFilter {

    private Integer idProduto;

    private String nomeproduto;

    private BigInteger valor;

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
}
