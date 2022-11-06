package com.example.model;

import com.example.model.composite.ThuongPhatHocvienKey;
import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class ThuongPhatHocVien {

//    @EmbeddedId
//    private ThuongPhatHocvienKey id;
//    @ManyToOne
//    @MapsId("idThuong")
////    @JsonBackReference(value = "userHobbit_hobbit")
//    @JsonBackReference
//    @JoinColumn(name = "id_thuong_phat")
//    private ThuongPhat thuongPhat;
//    @ManyToOne
//    @MapsId("idHocVien")
////    @JsonBackReference(value = "userHobbit_user")
//    @JsonBackReference()
//    @JoinColumn(name = "id_hoc_vien")
//    private HocVien hocVien;
//    private boolean status;

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer id;
//    @JsonBackReference()
    @ManyToOne
    @JoinColumn(referencedColumnName = "id")
    private HocVien hocVien;

//    @JsonBackReference()
    @ManyToOne
    @JoinColumn(referencedColumnName = "id")
    private ThuongPhat thuongPhat;

    private boolean status;
}
