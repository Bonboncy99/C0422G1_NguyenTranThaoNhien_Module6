package com.example.bookstorebe.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Getter
@Setter
@Entity
public class AppRole {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(columnDefinition = "varchar(30)")
    private String role;

    @ManyToMany
    @JoinTable(name = "account_role", joinColumns = @JoinColumn(name ="role_id"),
    inverseJoinColumns = @JoinColumn(name = "account_id"))
    private Set<Account> accountSet;
}