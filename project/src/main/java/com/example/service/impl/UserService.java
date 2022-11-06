//package com.example.service.impl;
//
//import com.example.model.User;
//import com.example.repository.IUserRepository;
//import com.example.service.IUserService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.Pageable;
//import org.springframework.stereotype.Service;
//
//@Service
//public class UserService implements IUserService {
//    @Autowired
//    private IUserRepository iUserRepository;
//
//    @Override
//    public Page<User> findAll(  Pageable pageable) {
//        return this.iUserRepository.findAll(pageable);
//    }
//
//    @Override
//    public Page<User> findAllByNameContainingAndUserType_Id(String name, int typeId, Pageable pageable) {
//        return this.iUserRepository.findAllByNameContainingAndUserType_Id(name, typeId, pageable);
//    }
//
//    @Override
//    public Page<User> searchByNameAndTypeId(String name, String typeId, Pageable pageable) {
//        return this.iUserRepository.searchByNameAndTypeId('%' + name + '%', '%' + typeId + '%', pageable);
//    }
//
//    @Override
//    public User findById(Integer id) {
//        return this.iUserRepository.findById(id).orElse(null);
//    }
//
//    @Override
//    public void addUser(User user) {
//        this.iUserRepository.save(user);
//    }
//
//    @Override
//    public void updateUser(User user) {
//        this.iUserRepository.save(user);
//    }
//
//    @Override
//    public void deleteUserById(Integer id) {
//        this.iUserRepository.deleteById(id);
//    }
//}
