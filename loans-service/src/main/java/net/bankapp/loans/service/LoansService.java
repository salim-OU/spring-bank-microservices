package net.bankapp.loans.service;

import net.bankapp.loans.dto.LoanDto;
import java.util.List;

public interface LoansService {
    List<LoanDto> getLoansByCustomerId(int customerId);
}