package com.example.webbanga.service.serviceImpl;

import com.example.webbanga.entity.Nhanvien;
import com.example.webbanga.repository.NhanvienRepository;
import com.example.webbanga.service.NhanvienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NhanvienServiceImpl implements NhanvienService {
    @Autowired
    NhanvienRepository nhanvienRepository;

    @Override
    public List<Nhanvien> getNhanVien() {
        return nhanvienRepository.findAll();
    }

    @Override
    public void createNhanVien(Nhanvien nhanvien) {
        nhanvienRepository.save(nhanvien);
    }

    @Override
    public void deleteNhanVien(String nhanvien) {

    }

//    @Override
//    public void deleteNhanVien(String maNV) {
//        nhanvienRepository.deleteNhanVienById(maNV);
//    }
}
