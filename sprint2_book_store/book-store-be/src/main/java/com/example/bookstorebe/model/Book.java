package com.example.bookstorebe.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Getter
@Setter
@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Double height;
    private Double width;
    @Column(columnDefinition = "text")
    private String imgUrl;
    @Column(columnDefinition = "text")
    private String summary;
    private Integer quantity;
    @Column(columnDefinition = "varchar(200)")
    private String title;
    private Integer totalPage;
    private Double price;

    @ManyToOne
    @JoinColumn(referencedColumnName = "id")
    private Publisher publisher;

    @ManyToOne
    @JoinColumn(referencedColumnName = "id")
    private Author author;

    @JsonBackReference
    @ManyToMany
    @JoinTable(name = "book_detail", joinColumns = @JoinColumn(name = "book_id"),
    inverseJoinColumns = @JoinColumn(name = "category_id"))
    private Set<Category> categorySet;
}
