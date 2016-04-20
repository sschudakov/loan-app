package io.fourfinanceit.homework.domain;

import io.fourfinanceit.homework.util.LocalDateTimePersistenceConverter;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.time.LocalDateTime;

/**
 * Created by Sergey on 4/18/2016.
 */
@Entity
@Table(name = "loan_requests")
public class LoanRequest {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

//	@ManyToOne
//	@JoinColumn(name = "client_id")
//	private Client client;

	@Column(name = "request_time")
	@Convert(converter = LocalDateTimePersistenceConverter.class)
	private LocalDateTime requestTime;

	@Column(name = "amount")
	private Integer amount;

	@Column(name = "term")
	private Integer term; // in months

	@Column(name = "official_income")
	private Integer officialIncome;

	@Column(name = "additional_income")
	private Integer additional_income;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

//	public Client getClient() {
//		return client;
//	}
//
//	public void setClient(Client client) {
//		this.client = client;
//	}

	public LocalDateTime getRequestTime() {
		return requestTime;
	}

	public void setRequestTime(LocalDateTime requestTime) {
		this.requestTime = requestTime;
	}

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	public Integer getTerm() {
		return term;
	}

	public void setTerm(Integer term) {
		this.term = term;
	}

	public Integer getOfficialIncome() {
		return officialIncome;
	}

	public void setOfficialIncome(Integer officialIncome) {
		this.officialIncome = officialIncome;
	}

	public Integer getAdditional_income() {
		return additional_income;
	}

	public void setAdditional_income(Integer additional_income) {
		this.additional_income = additional_income;
	}
}
