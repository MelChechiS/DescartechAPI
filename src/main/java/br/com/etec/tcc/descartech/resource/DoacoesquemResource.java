package br.com.etec.tcc.descartech.resource;


import br.com.etec.tcc.descartech.model.Doacoes_quem;
import br.com.etec.tcc.descartech.repository.DoacoesquemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/doacoes_quem")

public class DoacoesquemResource {

    @Autowired
    private DoacoesquemRepository doacoesquemRepository;

    @GetMapping("/todos")
    public List<Doacoes_quem> ListarTodosDoacoesquem () {
        return doacoesquemRepository.findAll();
    }
}
