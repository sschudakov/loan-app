package io.fourfinanceit.homework.risk.impl;

import io.fourfinanceit.homework.domain.LoanRequest;
import io.fourfinanceit.homework.risk.RiskProcessor;
import org.springframework.stereotype.Component;

@Component
public class RiskProcessorImpl implements RiskProcessor {

	@Override
	public boolean processRisk(LoanRequest loanRequest) {
		return false;
	}
}
