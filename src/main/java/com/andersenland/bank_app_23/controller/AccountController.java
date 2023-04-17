package com.andersenland.bank_app_23.controller;


import com.andersenland.bank_app_23.dto.AccountDto;
import com.andersenland.bank_app_23.dto.AccountListDto;
import com.andersenland.bank_app_23.service.AccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/accounts")
@RequiredArgsConstructor
public class AccountController {
    public final AccountService accountService;

    @GetMapping("/id/{accountId}")
    @ResponseStatus(HttpStatus.OK)
    public AccountDto getAccountById(@PathVariable("accountId") String accountId) {
        return accountService.getAccountById(accountId);
    }

    @GetMapping("/all/active")
    public AccountListDto getAllAccounts() {
        return accountService.getAllAccountsByStatusActive();
    }
}
