package net.bankapp.loans.service;

import lombok.extern.slf4j.Slf4j;
import net.bankapp.loans.dao.LoansRepository;
import net.bankapp.loans.dto.LoanDto;
import net.bankapp.loans.entity.Loan;
import net.bankapp.loans.exception.ResourceNotFoundException;
import net.bankapp.loans.mapper.LoanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Slf4j
public class LoansServiceImpl implements LoansService {

    @Autowired
    private LoansRepository loansRepository;

    @Autowired
    private LoanMapper loanMapper;

    @Override
    public List<LoanDto> getLoansByCustomerId(int customerId) {
        log.info("Fetching loans for customer ID: {}", customerId);
        List<Loan> loans = loansRepository.findByCustomerIdOrderByStartDtDesc(customerId);

        if(loans.isEmpty()) {
//            throw new ResourceNotFoundException("No loans found for customer ID: " + customerId);
            throw new ResourceNotFoundException("No loans found for customer ID: %s", customerId);
        }

        return loans.stream()
                .map(loanMapper::toDto)
                .collect(Collectors.toList());
    }
}