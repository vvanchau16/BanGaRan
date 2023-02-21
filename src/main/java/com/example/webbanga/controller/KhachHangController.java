package com.example.webbanga.controller;

import com.example.webbanga.entity.Khachhang;
import com.example.webbanga.service.KhachhangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/api/KH")

public class KhachHangController {
    @Autowired
    private KhachhangService khachhangService;

    @GetMapping()
    public List<Khachhang> getKhachhang() {
        return khachhangService.getKhachhang();
    }

    @PostMapping()
    public void createKhachHang (@RequestBody Khachhang khachhang){
        khachhangService.createKhachHang(khachhang);
    }
}
