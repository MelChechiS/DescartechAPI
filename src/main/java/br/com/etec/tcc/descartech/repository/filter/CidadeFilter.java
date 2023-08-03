package br.com.etec.tcc.descartech.repository.filter;

import java.math.BigInteger;

public class CidadeFilter {

    private String nomecidade;

    private String uf;

    private BigInteger cep;

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
}
