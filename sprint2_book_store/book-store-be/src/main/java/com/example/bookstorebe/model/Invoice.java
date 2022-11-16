package com.example.bookstorebe.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
public class Invoice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(columnDefinition = "varchar(20)")
    private String code;

    @Column(columnDefinition = "date")
    private String date;

    @ManyToOne
    @JoinColumn(referencedColumnName = "id")
    private Account account;

}