package com.example.webbanga.service.serviceImpl;

import com.example.webbanga.repository.QuyenRepository;
import com.example.webbanga.service.QuyenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuyenServiceImpl implements QuyenService {
    @Autowired
    QuyenRepository quyenRepository;

    @Override
    public String getQuyen() {
        System.out.printf(String.valueOf(quyenRepository.findAll()));
        return null;
    }
}
