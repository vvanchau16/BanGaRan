package com.example.webbanga.repository;

import com.example.webbanga.entity.Ctdanhgia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CtdanhgiaRepository extends JpaRepository<Ctdanhgia, Long> {

}
