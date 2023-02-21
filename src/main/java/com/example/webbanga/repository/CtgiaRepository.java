package com.example.webbanga.repository;

import com.example.webbanga.entity.Ctgia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CtgiaRepository extends JpaRepository<Ctgia, Long> {
}
