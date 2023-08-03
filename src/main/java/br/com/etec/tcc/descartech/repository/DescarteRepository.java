package br.com.etec.tcc.descartech.repository;

import br.com.etec.tcc.descartech.model.Descarte;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface DescarteRepository extends JpaRepository<Descarte, Integer> {
}
