package io.fourfinanceit.homework.web.dto;

import javax.persistence.Convert;
import javax.persistence.Converter;
import java.time.LocalDateTime;

/**
 * Created by Sergey on 4/20/2016.
 */

public class LoanRequestDto {

	private LocalDateTime requestDate;

	private String clientName;

	private String clientSurname;

	private String clientPassportNum;

	private String clientAge;

	private String amount;

	private String term;

	private String clientOfficialIncome;

	private String clientAdditionalIncome;

	public LocalDateTime getRequestDate() {
		return requestDate;
	}

	public void setRequestDate(LocalDateTime requestDate) {
		this.requestDate = requestDate;
	}

	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public String getClientSurname() {
		return clientSurname;
	}

	public void setClientSurname(String clientSurname) {
		this.clientSurname = clientSurname;
	}

	public String getClientPassportNum() {
		return clientPassportNum;
	}

	public void setClientPassportNum(String clientPassportNum) {
		this.clientPassportNum = clientPassportNum;
	}

	public String getClientAge() {
		return clientAge;
	}

	public void setClientAge(String clientAge) {
		this.clientAge = clientAge;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getTerm() {
		return term;
	}

	public void setTerm(String term) {
		this.term = term;
	}

	public String getClientOfficialIncome() {
		return clientOfficialIncome;
	}

	public void setClientOfficialIncome(String clientOfficialIncome) {
		this.clientOfficialIncome = clientOfficialIncome;
	}

	public String getClientAdditionalIncome() {
		return clientAdditionalIncome;
	}

	public void setClientAdditionalIncome(String clientAdditionalIncome) {
		this.clientAdditionalIncome = clientAdditionalIncome;
	}
}
