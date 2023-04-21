package com.telran.bank_app_23.mapper;

import com.telran.bank_app_23.dto.AccountDto;
import com.telran.bank_app_23.entity.Account;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "string")
public interface AccountMapper {
    @Mapping(source = "account.client.firstName", target = "clientFirstName")
    @Mapping(source = "account.client.lastName", target = "clientLastName")
    AccountDto toDto(Account account);

//    Account toEntity(AccountDto accountDto);

    List<AccountDto> ToListDto(List<Account> accounts);
}
