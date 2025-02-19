package net.bankapp.account.service;



import net.bankapp.account.dto.AccountsDto;

public interface AccountsService {
    /**
     * Fetch account details by customer ID
     */
    AccountsDto getAccountDetails(int customerId);

    /**
     * Create a new account
     */
    AccountsDto createAccount(AccountsDto accountsDto);

    /**
     * Update existing account
     */
    AccountsDto updateAccount(AccountsDto accountsDto);

    /**
     * Delete account by account number
     */
    void deleteAccount(long accountNumber);
}