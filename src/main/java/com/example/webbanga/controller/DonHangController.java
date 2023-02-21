package com.example.webbanga.controller;

import com.example.webbanga.entity.Donhang;
import com.example.webbanga.service.DanhmucService;
import com.example.webbanga.service.DonhangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/donhang")
public class DonHangController {
    @Autowired
    private DonhangService donhangService;

    @GetMapping()
    public List<Donhang> getDonHang(){
        return donhangService.getDonhang();
    }
}
