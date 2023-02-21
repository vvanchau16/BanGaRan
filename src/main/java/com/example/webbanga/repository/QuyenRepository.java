package com.example.webbanga.repository;

import com.example.webbanga.entity.Quyen;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuyenRepository extends JpaRepository <Quyen, String>{
}
