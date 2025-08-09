package com.projectbank.banking.mapper;

import com.projectbank.banking.dto.AccountDto;
import com.projectbank.banking.entity.Account;

public class AccountMapper {

    public static Account maptoAccount(AccountDto accountDto) {
        Account account = new Account(
                accountDto.id(),
                accountDto.accountHolderName(),
                accountDto.balance()
        );
        return account;
    }

    public static AccountDto mapToAccountDto(Account account) {
        AccountDto accountDto = new AccountDto(
                account.getId(),
                account.getAccountHolderName(),
                account.getBalance()
        );

        return accountDto;
    }
}