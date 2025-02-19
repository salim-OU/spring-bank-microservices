package net.bankapp.loans.web;


import lombok.extern.slf4j.Slf4j;
import net.bankapp.loans.dto.CustomerRequest;
import net.bankapp.loans.dto.LoanDto;
import net.bankapp.loans.service.LoansService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@Slf4j
public class LoansController {

    @Autowired
    private LoansService loansService;

    @PostMapping("/myLoans")
    public ResponseEntity<List<LoanDto>> getLoanDetails(@RequestBody CustomerRequest request) {
        log.info("Start fetching loans for customer: {}", request.getCustomerId());
        List<LoanDto> loans = loansService.getLoansByCustomerId(request.getCustomerId());
        return ResponseEntity.ok(loans);
    }
}