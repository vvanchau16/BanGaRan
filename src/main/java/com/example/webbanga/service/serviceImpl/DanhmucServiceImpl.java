package com.example.webbanga.service.serviceImpl;

import com.example.webbanga.entity.Danhmuc;
import com.example.webbanga.repository.DanhmucRepository;
import com.example.webbanga.service.DanhmucService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DanhmucServiceImpl implements DanhmucService {
    @Autowired
    DanhmucRepository danhmucRepository;

    @Override
    public List<Danhmuc> getDanhmuc(){
        return danhmucRepository.findAll();
    }
}
