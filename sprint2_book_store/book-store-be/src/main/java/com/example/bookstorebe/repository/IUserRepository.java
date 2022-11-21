package com.example.bookstorebe.repository;

import com.example.bookstorebe.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepository extends JpaRepository<User,Long> {
    User findByUsername(String userName);
}
