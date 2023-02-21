package com.example.webbanga.repository;

import com.example.webbanga.entity.Ctkm;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CtkmRepository extends JpaRepository <Ctkm, String>  {
}
