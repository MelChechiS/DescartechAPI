package br.com.etec.tcc.descartech.repository;

import br.com.etec.tcc.descartech.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
