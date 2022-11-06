package com.example.controller;


import com.example.model.HocVien;
import com.example.model.ThuongPhat;
import com.example.service.IThuongPhatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RequestMapping("thuongPhat")
@RestController
public class ThuongPhatRestController {
    @Autowired
    private IThuongPhatService iThuongPhatService;

    @GetMapping("")
    public ResponseEntity<List<ThuongPhat>> findAll() {
        List<ThuongPhat> thuongPhatList = this.iThuongPhatService.findAll();
        if (thuongPhatList.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(thuongPhatList, HttpStatus.OK);
    }
}
