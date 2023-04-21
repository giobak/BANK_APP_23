package com.telran.bank_app_23.repository;

import com.telran.bank_app_23.entity.Account;
import com.telran.bank_app_23.entity.enums.AccountStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface AccountRepository extends JpaRepository<Account, UUID> {
    Optional<Account> findAccountById(UUID id);


    List<Account> getAllByStatus(AccountStatus status);
}