package io.fourfinanceit.homework.service;

import io.fourfinanceit.homework.domain.LoanRequest;
import io.fourfinanceit.homework.web.dto.LoanRequestDto;

import java.util.List;

/**
 * Created by Sergey on 4/19/2016.
 */
public interface LoanRequestService {

	List<LoanRequest> findAll();

	LoanRequest find(Long id);

	LoanRequest create(LoanRequest loanRequest);

	LoanRequest update(LoanRequest loanRequest);

	void delete(Long id);

	boolean processNewLoanRequest(LoanRequestDto loanRequestDto);

}
