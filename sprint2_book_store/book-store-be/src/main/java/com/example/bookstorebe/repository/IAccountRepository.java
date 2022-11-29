package com.example.bookstorebe.repository;

import com.example.bookstorebe.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAccountRepository extends JpaRepository<Account,Long> {
    Account findByUserName(String userName);
}
