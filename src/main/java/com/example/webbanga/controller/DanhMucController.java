package com.example.webbanga.controller;

import com.example.webbanga.entity.Danhmuc;
import com.example.webbanga.service.DanhmucService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/danhmuc")
public class DanhMucController {
    @Autowired
    private DanhmucService danhmucService;

    @GetMapping()
    public List<Danhmuc> getDanhMuc(){
        return danhmucService.getDanhmuc();
    }
}
