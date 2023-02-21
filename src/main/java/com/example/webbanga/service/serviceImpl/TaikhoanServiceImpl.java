package com.example.webbanga.service.serviceImpl;

import com.example.webbanga.repository.TaikhoanRepository;
import com.example.webbanga.service.TaikhoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class TaikhoanServiceImpl implements TaikhoanService {
    @Autowired
    TaikhoanRepository taikhoanRepository ;

    @Override
    public String getTaikhoan() {
        System.out.printf(String.valueOf(taikhoanRepository.findAll()));
        return null;
    }
}
