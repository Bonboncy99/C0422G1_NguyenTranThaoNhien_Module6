package com.example.controller;

import com.example.dto.HocVienDto;
import com.example.model.HocVien;
import com.example.service.IHocVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RequestMapping("hocVien")
@RestController
public class HocVienRestController {

    @Autowired
    private IHocVienService iHocVienService;

    @GetMapping("")
    public ResponseEntity<Page<HocVien>> findAll(@PageableDefault(5) Pageable pageable) {
        Page<HocVien> hocVienPage = this.iHocVienService.findAll(pageable);
        if (hocVienPage.hasContent()) {
            return new ResponseEntity<>(hocVienPage, HttpStatus.OK);
        }
        return new ResponseEntity<>(hocVienPage,HttpStatus.NO_CONTENT);
    }
    @GetMapping("search")
    public ResponseEntity<Page<HocVien>> search(@RequestParam(defaultValue = "") String nameLop,@PageableDefault(5) Pageable pageable) {
        Page<HocVien> hocVienPage = this.iHocVienService.searchByLop(nameLop, pageable);
        if (hocVienPage.hasContent()) {
            return new ResponseEntity<>(hocVienPage, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @GetMapping("chuaThuong")
    public ResponseEntity<List<HocVien>> chuaThuong(@PageableDefault(5) Pageable pageable) {
        List<HocVien> hocVienList = this.iHocVienService.listChuaThuong();
        if (hocVienList.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(hocVienList, HttpStatus.OK);
    }
    @GetMapping("topPhat")
    public ResponseEntity<Page<HocVienDto>> top5Phat(@PageableDefault(5) Pageable pageable) {
        Page<HocVienDto> hocVienPage = this.iHocVienService.top5Phat(pageable);
        if (hocVienPage.hasContent()) {
            return new ResponseEntity<>(hocVienPage, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
    @PostMapping("")
    public ResponseEntity<Void> addHocVien(@RequestBody HocVien hocVien) {
        this.iHocVienService.addHocVien(hocVien);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("{id}")
    public ResponseEntity<HocVien> findAll(@PathVariable int id) {
        HocVien hocVien = this.iHocVienService.findById(id);
        if (hocVien == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(hocVien, HttpStatus.OK);
    }


    @DeleteMapping("{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable int id) {
        this.iHocVienService.DeleteHocVien(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
