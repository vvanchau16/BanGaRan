package com.example.webbanga.repository;

import com.example.webbanga.entity.Ctgiohang;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CtgiohangRepository extends JpaRepository <Ctgiohang, String>{
}
