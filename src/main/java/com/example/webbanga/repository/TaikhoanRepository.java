package com.example.webbanga.repository;

import com.example.webbanga.entity.Taikhoan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaikhoanRepository extends JpaRepository<Taikhoan, String> {
}
