//package com.example.service.impl;
//
//import com.example.model.UserType;
//import com.example.repository.IUserTypeRepository;
//import com.example.service.IUserTypeService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//@Service
//public class UserTypeService implements IUserTypeService {
//    @Autowired
//    private IUserTypeRepository iUserTypeRepository;
//    @Override
//    public List<UserType> findAll() {
//        return this.iUserTypeRepository.findAll();
//    }
//
//    @Override
//    public UserType findById(Integer id) {
//        return this.iUserTypeRepository.findById(id).orElse(null);
//    }
//}
