package com.example.app.repository;

import org.springframework.stereotype.Repository;

import com.example.app.models.Cliente;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente,Integer>  {

}
