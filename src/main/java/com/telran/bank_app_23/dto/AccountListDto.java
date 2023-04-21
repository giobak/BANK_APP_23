package com.telran.bank_app_23.dto;

import lombok.Value;
import java.util.List;

@Value
public class AccountListDto {

    List<AccountDto> accountDtoList;
}
