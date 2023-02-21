package com.example.webbanga.repository;

import com.example.webbanga.entity.Danhmuc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DanhmucRepository extends JpaRepository<Danhmuc, String> {
}
