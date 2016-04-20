package io.fourfinanceit.homework.repository;

import io.fourfinanceit.homework.domain.Loan;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Sergey on 4/18/2016.
 */
public interface LoanRepository extends JpaRepository<Loan, Long> {

}
