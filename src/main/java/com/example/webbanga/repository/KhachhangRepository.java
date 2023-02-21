package com.example.webbanga.repository;

import com.example.webbanga.entity.Khachhang;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KhachhangRepository extends JpaRepository <Khachhang, String> {
}
