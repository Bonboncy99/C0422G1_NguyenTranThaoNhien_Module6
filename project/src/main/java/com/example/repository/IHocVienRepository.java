package com.example.repository;

import com.example.dto.HocVienDto;
import com.example.model.HocVien;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface IHocVienRepository extends JpaRepository<HocVien, Integer> {
    Page<HocVien> findAll(Pageable pageable);

    @Query(value = "select hv.* from hoc_vien hv\n" +
            "left join lop l on l.id = hv.lop_id\n" +
            "where l.name like ?1", nativeQuery = true, countQuery = "select hv.* from hoc_vien hv\n" +
            "left join lop l on l.id = hv.lop_id\n" +
            "where l.name like ?1")
    Page<HocVien> searchByLop(String nameLop, Pageable pageable);

    @Query(value = "select * from hoc_vien where id not in (select hv.id from hoc_vien hv \n" +
            "left join thuong_phat_hoc_vien tphv on tphv.hoc_vien_id = hv.id\n" +
            "where tphv.thuong_phat_id <= 4\n" +
            "group by hv.id)", nativeQuery = true)
    List<HocVien> listChuaThuong();

    @Query(value = "select hv.id,\n" +
            "hv.day_of_birth as dayOfBirth,\n" +
            "hv.email,\n" +
            "hv.id_card as idCard,\n" +
            "hv.name,\n" +
            "hv.phone,\n" +
            " count(*) as soLanPhat  from hoc_vien hv \n" +
            "left join thuong_phat_hoc_vien tphv on tphv.hoc_vien_id = hv.id\n" +
            "where tphv.thuong_phat_id > 4\n" +
            "group by hv.id\n" +
            "limit 5", nativeQuery = true, countQuery = "select hv.id,\n" +
            "hv.day_of_birth as dayOfBirth,\n" +
            "hv.email,\n" +
            "hv.id_card as idCard,\n" +
            "hv.name,\n" +
            "hv.phone,\n" +
            " count(*) as soLanPhat  from hoc_vien hv \n" +
            "left join thuong_phat_hoc_vien tphv on tphv.hoc_vien_id = hv.id\n" +
            "where tphv.thuong_phat_id > 4\n" +
            "group by hv.id\n" +
            "limit 5")
    Page<HocVienDto> top5Phat(Pageable pageable);

}
