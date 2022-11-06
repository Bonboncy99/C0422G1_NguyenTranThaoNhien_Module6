package com.example.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Getter
@Setter
@Entity
public class ThuongPhat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String thuongPhatname;
    private String loai;
    @JsonBackReference
    @OneToMany(mappedBy = "thuongPhat")
    private Set<ThuongPhatHocVien> thuongPhatHocVienSet;


}