package com.example.webbanga.service;

import com.example.webbanga.entity.Nhanvien;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface NhanvienService {

    List<Nhanvien> getNhanVien();

    void createNhanVien(Nhanvien nhanvien);

    void deleteNhanVien(String nhanvien);

}
