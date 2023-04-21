package com.telran.bank_app_23.service;

import com.telran.bank_app_23.dto.AccountDto;
import com.telran.bank_app_23.dto.AccountListDto;

public interface AccountService {

    AccountDto getAccountById(String id);

    AccountListDto getAllAccountsByStatusActive();
}
