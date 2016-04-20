package io.fourfinanceit.homework.repository;

import io.fourfinanceit.homework.domain.Client;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Sergey on 4/18/2016.
 */
public interface ClientRepository extends JpaRepository<Client, Long> {

	Client findByPassportNum(String passportNum);

}
