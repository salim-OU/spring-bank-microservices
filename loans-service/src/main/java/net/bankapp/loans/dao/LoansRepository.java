package net.bankapp.loans.dao;

import net.bankapp.loans.entity.Loan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LoansRepository extends JpaRepository<Loan, Integer> {
    List<Loan> findByCustomerIdOrderByStartDtDesc(int customerId);
}