package com.example.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Getter
@Setter
@Entity
public class Lop {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    @Column(columnDefinition = "date")
    private String startDay;
    @Column(columnDefinition = "date")
    private String endDay;

    @JsonBackReference
    @OneToMany(mappedBy = "lop")
    private Set<HocVien>hocVienSet;
}
