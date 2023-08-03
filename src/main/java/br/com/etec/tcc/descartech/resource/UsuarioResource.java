package br.com.etec.tcc.descartech.resource;

import br.com.etec.tcc.descartech.model.Usuario;
import br.com.etec.tcc.descartech.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/usuarios")

public class UsuarioResource {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @GetMapping("/todos")
    public List<Usuario> ListarTodosUsuarios() {
        return usuarioRepository.findAll();
    }
}
