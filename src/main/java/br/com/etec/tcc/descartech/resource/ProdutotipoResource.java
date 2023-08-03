package br.com.etec.tcc.descartech.resource;

import br.com.etec.tcc.descartech.model.Produtotipo;
import br.com.etec.tcc.descartech.repository.ProdutotipoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/produtotipo")

public class ProdutotipoResource {

    @Autowired
    private ProdutotipoRepository produtotipoRepository;

    @GetMapping("/todos")
    public List<Produtotipo> ListarTodosProdutotipo() {
        return produtotipoRepository.findAll();
    }

}
