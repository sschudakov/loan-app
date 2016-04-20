package io.fourfinanceit.homework.service.impl;

import io.fourfinanceit.homework.domain.Client;
import io.fourfinanceit.homework.repository.ClientRepository;
import io.fourfinanceit.homework.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Sergey on 4/19/2016.
 */
@Service
@Transactional
public class ClientServiceImpl implements ClientService {

	@Autowired
	private ClientRepository clientRepository;

	@Override
	public List<Client> findAll() {
		return clientRepository.findAll();
	}

	@Override
	public Client find(Long id) {
		return clientRepository.findOne(id);
	}

	@Override
	public Client create(Client client) {
		return clientRepository.saveAndFlush(client);
	}

	@Override
	public Client update(Client client) {
		return clientRepository.saveAndFlush(client);
	}

	public void delete(Long id) {
		clientRepository.delete(id);
	}

}
