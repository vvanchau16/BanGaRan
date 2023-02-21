package com.example.webbanga.repository;

import com.example.webbanga.entity.Donhang;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DonhangRepository extends JpaRepository <Donhang, String>{
}
