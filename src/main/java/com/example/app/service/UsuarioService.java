package com.example.app.service;

import com.example.app.dtos.UsuarioDTO;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.app.models.Usuario;
import com.example.app.repository.UsuarioRepository;
import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository repo;

    public List<Usuario> findAll() {
        return this.repo.findAll();

    }

    public Usuario findById(Integer Id) {
        return this.repo.findById(Id).orElse(null);

    }

    public Usuario save(UsuarioDTO usuario) {
        Usuario newUsuario = new Usuario();
        newUsuario.setUsername(usuario.getUsername());
        newUsuario.setPassword(usuario.getPassword());
        return this.repo.save(newUsuario);

    }

}
