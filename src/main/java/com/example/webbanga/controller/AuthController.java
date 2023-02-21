package com.example.webbanga.controller;

import com.example.webbanga.entity.*;
import com.example.webbanga.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/demo/test")

public class AuthController {
    @Autowired
    public QuyenService quyenService;
    @Autowired
    public TaikhoanService taikhoanService;

    @GetMapping("/quyen")
    public Quyen test (){
        System.out.printf (quyenService.getQuyen());
        return null;
    }
    @GetMapping ("/taikhoan")
    public Taikhoan demo (){
        System.out.printf (taikhoanService.getTaikhoan());
        return null;
    }


}
