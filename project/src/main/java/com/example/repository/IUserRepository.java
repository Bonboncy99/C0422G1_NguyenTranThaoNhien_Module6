//package com.example.repository;
//
//import com.example.model.User;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.Pageable;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//
//public interface IUserRepository extends JpaRepository<User,Integer> {
//
//    @Query(value = "SELECT \n" +
//            "    u.*\n" +
//            "FROM\n" +
//            "    user u\n" +
//            "        JOIN\n" +
//            "    user_type ut ON ut.id = u.user_type_id\n" +
//            "WHERE\n" +
//            "    u.name LIKE ?1 AND ut.id LIKE ?2",nativeQuery = true,countQuery = "SELECT \n" +
//            "    u.*\n" +
//            "FROM\n" +
//            "    user u\n" +
//            "        JOIN\n" +
//            "    user_type ut ON ut.id = u.user_type_id\n" +
//            "WHERE\n" +
//            "    u.name LIKE ?1 AND ut.id LIKE ?2")
//    Page<User>searchByNameAndTypeId(String name, String typeId, Pageable pageable);
//
//
//
//    Page<User>findAllByNameContainingAndUserType_Id(String name, int typeId, Pageable pageable);
//}
