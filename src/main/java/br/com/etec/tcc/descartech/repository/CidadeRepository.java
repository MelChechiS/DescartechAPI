package br.com.etec.tcc.descartech.repository;

import br.com.etec.tcc.descartech.model.Cidade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface CidadeRepository extends JpaRepository<Cidade, Long> {
}
