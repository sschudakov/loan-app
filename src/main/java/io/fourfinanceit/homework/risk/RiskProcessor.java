package io.fourfinanceit.homework.risk;

import io.fourfinanceit.homework.domain.LoanRequest;

public interface RiskProcessor {

	boolean processRisk(LoanRequest loanRequest);

}
