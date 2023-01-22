package com.example.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.app.dtos.ClienteDTO;
import com.example.app.models.Cliente;
import com.example.app.service.ClienteService;

@RestController
@CrossOrigin(origins="*")
@RequestMapping("/clientes")
public class ClienteController {
	
	@Autowired
	private ClienteService service;
	
	@GetMapping
	public  ResponseEntity<List<Cliente>> findAll(){
		
		return ResponseEntity.ok().body(this.service.findAll()); 
		
	}
	
	@GetMapping("/{id}")
    public ResponseEntity<Cliente> findById(@PathVariable("id") Integer id) {
        var cliente = this.service.findById(id);
        if (cliente != null) {
            return ResponseEntity.ok().body(cliente);
        }
        return ResponseEntity.notFound().build();
    }
	
	@PostMapping
	public ResponseEntity<ClienteDTO> save(@RequestBody ClienteDTO cliente){
		this.service.save(cliente);
		return ResponseEntity.ok().body(cliente);
	}
	

}
