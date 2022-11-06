//package com.example.controller;
//
//import com.example.model.User;
//import com.example.model.UserType;
//import com.example.service.IUserTypeService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.Pageable;
//import org.springframework.data.web.PageableDefault;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.List;
//
//@CrossOrigin
//@RestController
//@RequestMapping("userTypes")
//public class UserTypeRestController {
//@Autowired
//private IUserTypeService iUserTypeService;
//    @GetMapping("")
//    public ResponseEntity<List<UserType>> findAll(){
//        List<UserType>userTypes = this.iUserTypeService.findAll();
//        if (userTypes.isEmpty()){
//            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//        }
//        return new ResponseEntity<>(userTypes, HttpStatus.OK);
//    }
//}
