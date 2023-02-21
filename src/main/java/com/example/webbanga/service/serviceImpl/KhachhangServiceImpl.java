package com.example.webbanga.service.serviceImpl;

import com.example.webbanga.entity.Khachhang;
import com.example.webbanga.repository.KhachhangRepository;
import com.example.webbanga.service.KhachhangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KhachhangServiceImpl implements KhachhangService {
    @Autowired
    KhachhangRepository khachhangRepository;

    @Override
    public List<Khachhang> getKhachhang(){
        return khachhangRepository.findAll();
    }

    @Override
    public void createKhachHang(Khachhang khachhang){
         khachhangRepository.save(khachhang);
    }

}
