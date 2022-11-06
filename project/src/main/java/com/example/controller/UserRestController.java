//package com.example.controller;
//
//import com.example.model.User;
//import com.example.service.IUserService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.Pageable;
//import org.springframework.data.web.PageableDefault;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//@CrossOrigin
//@RestController
//@RequestMapping("users")
//public class UserRestController {
//
//    @Autowired
//    private IUserService iUserService;
//
//    @GetMapping("")
//    public ResponseEntity<Page<User>> findAll(@PageableDefault(5) Pageable pageable) {
//        Page<User> userPage = this.iUserService.findAll(pageable);
//        if (userPage.hasContent()) {
//            return new ResponseEntity<>(userPage, HttpStatus.OK);
//        }
//        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//    }
////
//    @GetMapping("search1")
//    public ResponseEntity<Page<User>> search(@RequestParam(defaultValue = "") String name, @RequestParam(defaultValue = "") int id,@PageableDefault(5) Pageable pageable){
//        Page<User>userPage = this.iUserService.findAllByNameContainingAndUserType_Id(name,id,pageable);
//        if (userPage.hasContent()){
//            return new ResponseEntity<>(userPage, HttpStatus.OK);
//        }
//        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//    }
//
//    @GetMapping("search")
//    public ResponseEntity<Page<User>> search(@RequestParam(defaultValue = "") String name, @RequestParam(defaultValue = "") String id, @PageableDefault(5) Pageable pageable) {
//        Page<User> userPage = this.iUserService.searchByNameAndTypeId(name, id, pageable);
//        if (userPage.hasContent()) {
//            return new ResponseEntity<>(userPage, HttpStatus.OK);
//        }
//        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//    }
//
//
//    @PostMapping("")
//    public ResponseEntity<Void> addUser(@RequestBody User user) {
//        this.iUserService.addUser(user);
//        return new ResponseEntity<>(HttpStatus.OK);
//    }
//
//    @GetMapping("{id}")
//    public ResponseEntity<User> findAll(@PathVariable int id) {
//        User user = this.iUserService.findById(id);
//        if (user == null) {
//            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//        }
//        return new ResponseEntity<>(user, HttpStatus.OK);
//    }
//
//    @PatchMapping("")
//    public ResponseEntity<Void> updateUser(@RequestBody User user) {
//        this.iUserService.updateUser(user);
//        return new ResponseEntity<>(HttpStatus.OK);
//    }
//
//    @DeleteMapping("{id}")
//    public ResponseEntity<Void> deleteUser(@PathVariable int id) {
//        this.iUserService.deleteUserById(id);
//        return new ResponseEntity<>(HttpStatus.OK);
//    }
//}
