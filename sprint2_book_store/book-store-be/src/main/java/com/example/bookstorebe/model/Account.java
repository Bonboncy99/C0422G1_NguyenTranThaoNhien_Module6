package com.example.bookstorebe.model;

import lombok.Getter;
import lombok.Setter;
import org.apache.catalina.User;

import javax.persistence.*;
import java.util.Set;

@Getter
@Setter
@Entity
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(columnDefinition = "varchar(200)")
    private String userName;
    @Column(columnDefinition = "varchar(30)")
    private String password;

    @OneToOne
    @JoinColumn(referencedColumnName = "id")
    private AppUser appUser;




    @ManyToMany
    @JoinTable(name = "account_role", joinColumns = @JoinColumn(name = "account_id"),
    inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Set<AppRole> appRoles;
}
