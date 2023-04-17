package com.andersenland.bank_app_23.service;

import com.andersenland.bank_app_23.dto.AccountDto;
import com.andersenland.bank_app_23.dto.AccountListDto;

public interface AccountService {

    AccountDto getAccountById(String id);

    AccountListDto getAllAccountsByStatusActive();
}
