package com.example.webbanga.repository;

import com.example.webbanga.entity.Nhanvien;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NhanvienRepository extends JpaRepository<Nhanvien, String> {

    //---- để làm mẫu, sau này muốn xóa vào copy thử----
//    @Transactional
//    @Modifying
//    @Query(value = "delete from nhanvien nv where nv = :maNV", nativeQuery = true)
//    void deleteNhanVienById(String maNV);
}
