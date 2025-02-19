package net.bankapp.loans.mapper;

import net.bankapp.loans.dto.LoanDto;
import net.bankapp.loans.entity.Loan;
import org.springframework.stereotype.Component;

@Component
public class LoanMapper {

    public LoanDto toDto(Loan loan) {
        LoanDto dto = new LoanDto();
        dto.setLoanNumber(loan.getLoanNumber());
        dto.setCustomerId(loan.getCustomerId());
        dto.setStartDt(loan.getStartDt());
        dto.setLoanType(loan.getLoanType());
        dto.setTotalLoan(loan.getTotalLoan());
        dto.setAmountPaid(loan.getAmountPaid());
        dto.setOutstandingAmount(loan.getOutstandingAmount());
        dto.setCreatedDt(loan.getCreatedDt());
        return dto;
    }

    public Loan toEntity(LoanDto dto) {
        Loan loan = new Loan();
        loan.setLoanNumber(dto.getLoanNumber());
        loan.setCustomerId(dto.getCustomerId());
        loan.setStartDt(dto.getStartDt());
        loan.setLoanType(dto.getLoanType());
        loan.setTotalLoan(dto.getTotalLoan());
        loan.setAmountPaid(dto.getAmountPaid());
        loan.setOutstandingAmount(dto.getOutstandingAmount());
        loan.setCreatedDt(dto.getCreatedDt());
        return loan;
    }
}