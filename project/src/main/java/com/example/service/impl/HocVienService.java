package com.example.service.impl;

import com.example.dto.HocVienDto;
import com.example.model.HocVien;
import com.example.repository.IHocVienRepository;
import com.example.service.IHocVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HocVienService implements IHocVienService {
    @Autowired
    private IHocVienRepository iHocVienRepository;

    @Override
    public Page<HocVien> findAll(Pageable pageable) {
        return this.iHocVienRepository.findAll(pageable);
    }



    @Override
    public void DeleteHocVien(int id) {
        this.iHocVienRepository.deleteById(id);
    }

    @Override
    public void addHocVien(HocVien hocVien) {
        this.iHocVienRepository.save(hocVien);
    }

    @Override
    public HocVien findById(int id) {
        return this.iHocVienRepository.findById(id).orElse(null);
    }

    @Override
    public Page<HocVien> searchByLop(String nameLop, Pageable pageable) {
        return this.iHocVienRepository.searchByLop("%"+nameLop+"%",pageable);
    }

    @Override
    public List<HocVien> listChuaThuong() {
        return this.iHocVienRepository.listChuaThuong();
    }

    @Override
    public Page<HocVienDto> top5Phat(Pageable pageable) {
        return this.iHocVienRepository.top5Phat(pageable);
    }
}
