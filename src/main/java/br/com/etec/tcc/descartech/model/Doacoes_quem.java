package br.com.etec.tcc.descartech.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="doacoes_quem")
public class Doacoes_quem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Date data;

    @ManyToOne
    @JoinColumn(name="idUsuario")
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name="idDoacao")
    private Doacoes doacoes;

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Doacoes getDoacoes() {
        return doacoes;
    }

    public void setDoacoes(Doacoes doacoes) {
        this.doacoes = doacoes;
    }
}
