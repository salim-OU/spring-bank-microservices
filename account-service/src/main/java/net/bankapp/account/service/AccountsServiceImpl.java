package net.bankapp.account.service;

import lombok.extern.slf4j.Slf4j;
import net.bankapp.account.dao.AccountsRepository;
import net.bankapp.account.dto.AccountsDto;
import net.bankapp.account.entity.Accounts;
import net.bankapp.account.exception.ResourceNotFoundException;
import net.bankapp.account.mapper.AccountMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
@Slf4j
public class AccountsServiceImpl implements AccountsService {

    @Autowired
    private AccountsRepository accountsRepository;

    @Autowired
    private AccountMapper accountMapper;

    @Override
    public AccountsDto getAccountDetails(int customerId) {
        log.info("Fetching account details for customer ID: {}", customerId);
        Accounts account = accountsRepository.findByCustomerId(customerId)
                .orElseThrow(() -> new ResourceNotFoundException(
                        "Account not found for Customer ID: " + customerId));
        return accountMapper.toDto(account);
    }

    @Override
    public AccountsDto createAccount(AccountsDto accountsDto) {
        log.info("Creating new account for customer ID: {}", accountsDto.getCustomerId());
        accountsDto.setCreateDt(LocalDate.now());
        Accounts account = accountMapper.toEntity(accountsDto);
        Accounts savedAccount = accountsRepository.save(account);
        return accountMapper.toDto(savedAccount);
    }

    @Override
    public AccountsDto updateAccount(AccountsDto accountsDto) {
        log.info("Updating account number: {}", accountsDto.getAccountNumber());

        // Verify account exists
        accountsRepository.findById(accountsDto.getAccountNumber())
                .orElseThrow(() -> new ResourceNotFoundException(
                        "Account not found with number: " + accountsDto.getAccountNumber()));

        Accounts account = accountMapper.toEntity(accountsDto);
        Accounts updatedAccount = accountsRepository.save(account);
        return accountMapper.toDto(updatedAccount);
    }

    @Override
    public void deleteAccount(long accountNumber) {
        log.info("Deleting account number: {}", accountNumber);
        Accounts account = accountsRepository.findById(accountNumber)
                .orElseThrow(() -> new ResourceNotFoundException(
                        "Account not found with number: " + accountNumber));
        accountsRepository.delete(account);
    }
}