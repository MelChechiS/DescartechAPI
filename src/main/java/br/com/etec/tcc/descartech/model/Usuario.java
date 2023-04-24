package br.com.etec.tcc.descartech.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name="usuario")

public class Usuario {

    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer idUsuario;

    private String nomeusuario;

    @OneToMany(mappedBy = "usuario")
    private List<Doacoes> doacoesusuario = new ArrayList<>();

    @OneToMany(mappedBy = "usuario")
    private List<Descarte> descartesusuario = new ArrayList<>();

    @OneToMany(mappedBy = "usuario")
    private List<Doacoes_quem> doacoesquemusuario = new ArrayList<>();

    @ManyToOne
    @JoinColumn(name="idCidade")
    private Cidade cidade;


    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNomeusuario() {
        return nomeusuario;
    }

    public void setNomeusuario(String nomeusuario) {
        this.nomeusuario = nomeusuario;
    }

    public List<Doacoes> getDoacoesusuario() {
        return doacoesusuario;
    }

    public void setDoacoesusuario(List<Doacoes> doacoesusuario) {
        this.doacoesusuario = doacoesusuario;
    }

    public List<Descarte> getDescartesusuario() {
        return descartesusuario;
    }

    public void setDescartesusuario(List<Descarte> descartesusuario) {
        this.descartesusuario = descartesusuario;
    }

    public List<Doacoes_quem> getDoacoesquemusuario() {
        return doacoesquemusuario;
    }

    public void setDoacoesquemusuario(List<Doacoes_quem> doacoesquemusuario) {
        this.doacoesquemusuario = doacoesquemusuario;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return idUsuario.equals(usuario.idUsuario);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idUsuario);
    }
}
