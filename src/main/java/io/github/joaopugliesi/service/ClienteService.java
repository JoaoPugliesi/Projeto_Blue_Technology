package io.github.joaopugliesi.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import io.github.joaopugliesi.entity.Cliente;
import io.github.joaopugliesi.repository.ClienteRepository;

@Service
public class ClienteService {

	final ClienteRepository clienteRepository;

	public ClienteService(ClienteRepository clienteRepository) {
		this.clienteRepository = clienteRepository;
	}

	@Transactional
	public Cliente save(Cliente cliente) {
		return clienteRepository.save(cliente);
	}

	public List<Cliente> findAll() {
		return clienteRepository.findAll();
	}

	public Optional<Cliente> findById(Integer id) {
		return clienteRepository.findById(id);
	}

	@Transactional
	public void delete(Cliente cliente) {
		clienteRepository.delete(cliente);
	}

}
