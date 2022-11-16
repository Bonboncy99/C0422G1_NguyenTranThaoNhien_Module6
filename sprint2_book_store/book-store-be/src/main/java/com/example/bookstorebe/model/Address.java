package com.example.bookstorebe.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String stress;

    @ManyToOne
    @JoinColumn(columnDefinition = "id")
    private City city;


}
