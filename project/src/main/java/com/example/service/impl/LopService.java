package com.example.service.impl;

import com.example.model.Lop;
import com.example.repository.ILopRepository;
import com.example.service.ILopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class LopService implements ILopService {
    @Autowired
    private ILopRepository iLopRepository;
    @Override
    public List<Lop> findAll() {
        return this.iLopRepository.findAll();
    }
}
