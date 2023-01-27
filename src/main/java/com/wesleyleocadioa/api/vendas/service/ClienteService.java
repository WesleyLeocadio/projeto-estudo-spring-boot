package com.wesleyleocadioa.api.vendas.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wesleyleocadioa.api.vendas.model.Cliente;
import com.wesleyleocadioa.api.vendas.repository.ClienteRepository;

@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository repository;

	public void salvar(Cliente cliente) {
		validar(cliente);
		repository.persistir();
	}
	
	public void validar(Cliente cliente) {}

}
