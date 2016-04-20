package io.fourfinanceit.homework.service;

import io.fourfinanceit.homework.domain.Client;

import java.util.List;

/**
 * Created by Sergey on 4/19/2016.
 */
public interface ClientService {

	List<Client> findAll();

	Client find(Long id);

	Client create(Client client);

	Client update(Client client);

	void delete(Long id);
}
