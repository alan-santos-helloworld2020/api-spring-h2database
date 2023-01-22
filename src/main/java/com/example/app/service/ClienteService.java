package com.example.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.app.dtos.ClienteDTO;
import com.example.app.models.Cliente;
import com.example.app.repository.ClienteRepository;

@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository repo;
	
	
	public List<Cliente> findAll(){
		return this.repo.findAll(); 
	}
	
	public Cliente findById(Integer id){
		return this.repo.findById(id).orElse(null); 
	}
	
	public Cliente save(ClienteDTO cliente) {
		Cliente newCliente = new Cliente();
		newCliente.setNome(cliente.getNome());
		newCliente.setTelefone(cliente.getTelefone());
		newCliente.setEmail(cliente.getEmail());
		newCliente.setCep(cliente.getCep());		
		return this.repo.save(newCliente);
	}

}
