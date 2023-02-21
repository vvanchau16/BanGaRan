package com.example.webbanga.repository;

import com.example.webbanga.entity.Monan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MonanRepository extends JpaRepository<Monan, String> {
}
