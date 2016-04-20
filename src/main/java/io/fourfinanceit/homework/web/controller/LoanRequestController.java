package io.fourfinanceit.homework.web.controller;

import io.fourfinanceit.homework.domain.Loan;
import io.fourfinanceit.homework.domain.LoanRequest;
import io.fourfinanceit.homework.service.LoanRequestService;
import io.fourfinanceit.homework.web.dto.LoanRequestDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.List;

/**
 * Created by Sergey on 4/19/2016.
 */
@RestController
public class LoanRequestController {

	@Autowired
	private LoanRequestService loanRequestService;

	//////////////////////////// GET ////////////////////////////

	@RequestMapping(value = "/loan-requests", method = RequestMethod.GET)
	List<LoanRequest> loanRequests() {
		return loanRequestService.findAll();
	}

	@RequestMapping(value = "/loan-requests/{id}", method = RequestMethod.GET)
	LoanRequest loanRequest(@PathVariable("id") Long id) {
		return loanRequestService.find(id);
	}

	//////////////////////////// POST ////////////////////////////
	// Process new loan request
	@RequestMapping(value = "/loan-requests", method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	Loan createLoanRequest(HttpServletResponse httpServletResponse, @RequestBody LoanRequestDto loanRequestDto) {
		loanRequestDto.setRequestDate(LocalDateTime.now());
		boolean loanIssued = loanRequestService.processNewLoanRequest(loanRequestDto);
		if (!loanIssued) {
			try {
				httpServletResponse.sendError(HttpServletResponse.SC_PRECONDITION_FAILED, "Loan was not issued");
			} catch (IOException e) {
				e.printStackTrace();
			}
			return null;
		}
		return new Loan();
	}

	//////////////////////////// PUT ////////////////////////////

	@RequestMapping(value = "/loan-requests", method = RequestMethod.PUT)
	@ResponseStatus(HttpStatus.OK)
	LoanRequest updateLoanRequest(@PathVariable Long id, @RequestBody LoanRequest loanRequest) {
		loanRequest.setId(id);
		return loanRequestService.update(loanRequest);
	}

	//////////////////////////// DELETE ////////////////////////////

	@RequestMapping(value = "/loan-requests/{id}", method = RequestMethod.DELETE)
	@ResponseStatus(HttpStatus.NO_CONTENT)
	void delete(@PathVariable("id") Long id) {
		loanRequestService.delete(id);
	}

}
