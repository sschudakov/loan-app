package io.fourfinanceit.homework.service.impl;

import io.fourfinanceit.homework.domain.Loan;
import io.fourfinanceit.homework.repository.LoanRepository;
import io.fourfinanceit.homework.service.LoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Sergey on 4/19/2016.
 */
@Service
@Transactional
public class LoanServiceImpl implements LoanService {

	@Autowired
	private LoanRepository loanRepository;

	@Override
	public List<Loan> findAll() {
		return loanRepository.findAll();
	}

	@Override
	public Loan find(Long id) {
		return loanRepository.findOne(id);
	}

	@Override
	public Loan create(Loan loan) {
		return loanRepository.saveAndFlush(loan);
	}

	@Override
	public Loan update(Loan loan) {
		return loanRepository.saveAndFlush(loan);
	}

	public void delete(Long id) {
		loanRepository.delete(id);
	}

}
