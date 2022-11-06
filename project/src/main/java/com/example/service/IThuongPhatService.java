package com.example.service;

import com.example.model.HocVien;
import com.example.model.ThuongPhat;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IThuongPhatService {
  List<ThuongPhat>findAll();

}
