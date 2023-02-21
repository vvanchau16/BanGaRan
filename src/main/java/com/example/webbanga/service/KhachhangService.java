package com.example.webbanga.service;

import com.example.webbanga.entity.Khachhang;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface KhachhangService {

     List <Khachhang> getKhachhang();

     void createKhachHang (Khachhang khachhang);
}
