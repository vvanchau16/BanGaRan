package com.example.webbanga.repository;

import com.example.webbanga.entity.Khuyenmai;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KhuyenmaiRepository extends JpaRepository <Khuyenmai, String> {
}
