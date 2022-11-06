//package com.example.service;
//
//import com.example.model.User;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.Pageable;
//
//public interface IUserService {
//    Page<User> findAll(Pageable pageable);
//    Page<User>findAllByNameContainingAndUserType_Id(String name, int typeId, Pageable pageable);
//    Page<User>searchByNameAndTypeId(String name,String typeId, Pageable pageable);
//
//    User findById(Integer id);
//    void addUser(User user);
//    void updateUser(User user);
//    void deleteUserById(Integer id);
//}
