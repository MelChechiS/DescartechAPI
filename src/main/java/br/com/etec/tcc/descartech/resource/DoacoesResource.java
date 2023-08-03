package br.com.etec.tcc.descartech.resource;

import br.com.etec.tcc.descartech.model.Doacoes;
import br.com.etec.tcc.descartech.repository.DoacoesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/doacoes")

public class DoacoesResource {

    @Autowired
    private DoacoesRepository doacoesRepository;

    @GetMapping("/todos")
    public List<Doacoes> ListarTodasDoacoes () {
        return doacoesRepository.findAll();
    }
}
