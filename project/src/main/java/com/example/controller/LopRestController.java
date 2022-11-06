package com.example.controller;

import com.example.model.Lop;
import com.example.service.ILopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RequestMapping("lop")
@RestController
public class LopRestController {
    @Autowired
    private ILopService iLopService;

    @GetMapping("")
    public ResponseEntity<List<Lop>> findAll() {
        List<Lop> lops = this.iLopService.findAll();
        if (lops.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(lops, HttpStatus.OK);
    }

}
