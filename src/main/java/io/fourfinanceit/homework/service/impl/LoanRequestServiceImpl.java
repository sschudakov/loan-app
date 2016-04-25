package io.fourfinanceit.homework.service.impl;

import io.fourfinanceit.homework.domain.LoanRequest;
import io.fourfinanceit.homework.repository.LoanRequestRepository;
import io.fourfinanceit.homework.risk.RiskProcessor;
import io.fourfinanceit.homework.service.LoanRequestService;
import io.fourfinanceit.homework.web.dto.LoanRequestDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Sergey on 4/19/2016.
 */
@Service
@Transactional
public class LoanRequestServiceImpl implements LoanRequestService {

	@Autowired
	private LoanRequestRepository loanRequestRepository;

	@Autowired
	private RiskProcessor riskProcessor;

	@Override
	public List<LoanRequest> findAll() {
		return loanRequestRepository.findAll();
	}

	@Override
	public LoanRequest find(Long id) {
		return loanRequestRepository.findOne(id);
	}

	@Override
	public LoanRequest create(LoanRequest loanRequest) {
		return loanRequestRepository.saveAndFlush(loanRequest);
	}

	@Override
	public LoanRequest update(LoanRequest loanRequest) {
		return loanRequestRepository.saveAndFlush(loanRequest);
	}

	@Override
	public void delete(Long id) {
		loanRequestRepository.delete(id);
	}

	@Override
	public boolean processNewLoanRequest(LoanRequestDto loanRequestDto) {
		LoanRequest loanRequest = new LoanRequest();
		return riskProcessor.processRisk(loanRequest);
	}

}
