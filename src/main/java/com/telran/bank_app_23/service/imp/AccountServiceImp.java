package com.telran.bank_app_23.service.imp;


import com.telran.bank_app_23.dto.AccountDto;
import com.telran.bank_app_23.dto.AccountListDto;
import com.telran.bank_app_23.entity.enums.AccountStatus;
import com.telran.bank_app_23.mapper.AccountMapper;
import com.telran.bank_app_23.repository.AccountRepository;
import com.telran.bank_app_23.service.AccountService;
import com.telran.bank_app_23.service.exceptions.AccountNotFoundException;
import com.telran.bank_app_23.service.exceptions.ErrorMessage;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class AccountServiceImp implements AccountService {

   private final AccountMapper accountMapper;

   private final AccountRepository accountRepository;

    @Override
    @Transactional(readOnly = true)
    public AccountDto getAccountById(String id) {
        return accountMapper.toDto(accountRepository.findAccountById(UUID.fromString(id)).orElseThrow(
                () -> new AccountNotFoundException((ErrorMessage.ACCOUNT_NOT_FOUND))));
    }

    @Override
   public AccountListDto getAllAccountsByStatusActive() {
       return new AccountListDto(accountMapper.ToListDto(accountRepository.getAllByStatus(AccountStatus.ACTIVE)));
   }
}
