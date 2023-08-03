package br.com.etec.tcc.descartech.repository;

import br.com.etec.tcc.descartech.model.Doacoes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface DoacoesRepository extends JpaRepository<Doacoes, Long> {
}
