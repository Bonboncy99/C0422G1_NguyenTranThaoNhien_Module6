package com.example.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Getter
@Setter
@Entity
public class HocVien {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    @Column(columnDefinition = "date")
    private String dayOfBirth;
    private String phone;
    private String email;
    private String idCard;

    @ManyToOne
    @JoinColumn(referencedColumnName = "id")
    private Lop lop;

    @JsonBackReference
    @OneToMany(mappedBy = "hocVien")
    private Set<ThuongPhatHocVien> thuongPhatHocVienSet;


}
