package com.example.bookstorebe.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
public class InvoiceDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer quantity;
    @ManyToOne
    @JoinColumn(referencedColumnName = "id")
    private Book book;
    @ManyToOne
    @JoinColumn(referencedColumnName = "id")
    private Invoice invoice;

}
