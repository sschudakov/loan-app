package io.fourfinanceit.homework.service;

import io.fourfinanceit.homework.domain.Loan;

import java.util.List;

/**
 * Created by Sergey on 4/19/2016.
 */
public interface LoanService {

	List<Loan> findAll();

	Loan find(Long id);

	Loan create(Loan loan);

	Loan update(Loan loan);

	void delete(Long id);
}
