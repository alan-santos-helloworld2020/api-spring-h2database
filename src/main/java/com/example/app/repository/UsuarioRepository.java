package com.example.app.repository;

import org.springframework.stereotype.Repository;

import com.example.app.models.Usuario;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario,Integer>  {
    
}
