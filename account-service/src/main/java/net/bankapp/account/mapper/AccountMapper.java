package net.bankapp.account.mapper;

import net.bankapp.account.dto.AccountsDto;
import net.bankapp.account.entity.Accounts;
import org.springframework.stereotype.Component;

@Component
public class AccountMapper {

    public AccountsDto toDto(Accounts accounts) {
        AccountsDto dto = new AccountsDto();
        dto.setCustomerId(accounts.getCustomerId());
        dto.setAccountNumber(accounts.getAccountNumber());
        dto.setAccountType(accounts.getAccountType());
        dto.setBranchAddress(accounts.getBranchAddress());
        dto.setCreateDt(accounts.getCreateDt());
        return dto;
    }

    public Accounts toEntity(AccountsDto dto) {
        Accounts accounts = new Accounts();
        accounts.setCustomerId(dto.getCustomerId());
        accounts.setAccountNumber(dto.getAccountNumber());
        accounts.setAccountType(dto.getAccountType());
        accounts.setBranchAddress(dto.getBranchAddress());
        accounts.setCreateDt(dto.getCreateDt());
        return accounts;
    }
}