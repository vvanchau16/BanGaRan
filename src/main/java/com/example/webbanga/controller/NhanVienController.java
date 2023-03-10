package com.example.webbanga.controller;

import com.example.webbanga.entity.Nhanvien;
import com.example.webbanga.service.NhanvienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/nhanvien")
public class NhanVienController {
    @Autowired
    private NhanvienService nhanvienService;

    @GetMapping()
    public List<Nhanvien> getNhanVien(){
        return nhanvienService.getNhanVien();
    }
    @PostMapping
    public void createNhanVien(@RequestBody Nhanvien nhanvien){
        nhanvienService.createNhanVien(nhanvien);
    }
    @PostMapping("/delete")
    public void deleteNhanVien(@Param("maNV") String maNV){
        nhanvienService.deleteNhanVien(maNV);
    }

}
