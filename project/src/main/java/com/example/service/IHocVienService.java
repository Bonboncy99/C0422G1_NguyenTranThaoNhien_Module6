package com.example.service;

import com.example.dto.HocVienDto;
import com.example.model.HocVien;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IHocVienService {
   Page<HocVien> findAll(Pageable pageable);
   void DeleteHocVien(int id);
   void addHocVien(HocVien hocVien);
   HocVien findById(int id);
   Page<HocVien> searchByLop(String nameLop, Pageable pageable);
   List<HocVien> listChuaThuong();
   Page<HocVienDto> top5Phat(Pageable pageable);

}
