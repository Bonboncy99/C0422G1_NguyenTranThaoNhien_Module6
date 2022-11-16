package com.example.bookstorebe.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
public class CartDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer quantity;

    @ManyToOne
    @JoinColumn(columnDefinition = "id")
    private Book book;

    @ManyToOne
    @JoinColumn(columnDefinition = "id")
    private Cart cart;
}
