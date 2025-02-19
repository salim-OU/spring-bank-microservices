package net.bankapp.account.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class AccountsDto {
    private int customerId;
    private long accountNumber;
    private String accountType;
    private String branchAddress;
    private LocalDate createDt;
}