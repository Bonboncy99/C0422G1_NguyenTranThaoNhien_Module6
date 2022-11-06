package com.example.service.impl;

import com.example.model.ThuongPhat;
import com.example.repository.IThuongPhatRepository;
import com.example.service.IThuongPhatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ThuongPhatService implements IThuongPhatService {

@Autowired
private IThuongPhatRepository iThuongPhatRepository;
  @Override
  public List<ThuongPhat> findAll() {
    return this.iThuongPhatRepository.findAll();
  }
}
