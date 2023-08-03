package br.com.etec.tcc.descartech.resource;

import br.com.etec.tcc.descartech.model.Descarte;
import br.com.etec.tcc.descartech.repository.DescarteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/descartes")

public class DescarteResource {

    @Autowired
    private DescarteRepository descarteRepository;

    @GetMapping("/todos")
    public List<Descarte> ListarTodosDescartes() {
        return descarteRepository.findAll();
    }
}
