package net.bankapp.account.web;

import lombok.extern.slf4j.Slf4j;
import net.bankapp.account.dto.AccountsDto;
import net.bankapp.account.dto.CustomerRequest;
import net.bankapp.account.service.AccountsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@Slf4j
public class AccountsController {

    @Autowired
    private AccountsService accountsService;

    @PostMapping("/myAccount")
    public ResponseEntity<AccountsDto> getAccountDetails(@RequestBody CustomerRequest request) {
        log.info("Fetching account details for customer ID: {}", request.getCustomerId());
        AccountsDto accountsDto = accountsService.getAccountDetails(request.getCustomerId());
        return ResponseEntity.ok(accountsDto);
    }

    @PostMapping("/accounts")
    public ResponseEntity<AccountsDto> createAccount(@RequestBody AccountsDto accountsDto) {
        log.info("Creating new account for customer ID: {}", accountsDto.getCustomerId());
        return new ResponseEntity<>(accountsService.createAccount(accountsDto),
                HttpStatus.CREATED);
    }

    @PutMapping("/accounts")
    public ResponseEntity<AccountsDto> updateAccount(@RequestBody AccountsDto accountsDto) {
        log.info("Updating account: {}", accountsDto.getAccountNumber());
        return ResponseEntity.ok(accountsService.updateAccount(accountsDto));
    }

    @DeleteMapping("/accounts/{accountNumber}")
    public ResponseEntity<Void> deleteAccount(@PathVariable long accountNumber) {
        log.info("Deleting account: {}", accountNumber);
        accountsService.deleteAccount(accountNumber);
        return ResponseEntity.noContent().build();
    }
}