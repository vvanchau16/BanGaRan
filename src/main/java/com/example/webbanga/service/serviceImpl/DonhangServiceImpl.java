package com.example.webbanga.service.serviceImpl;

import com.example.webbanga.entity.Donhang;
import com.example.webbanga.repository.DonhangRepository;
import com.example.webbanga.service.DonhangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DonhangServiceImpl implements DonhangService {
    @Autowired
    DonhangRepository donhangRepository;

    @Override
    public List<Donhang> getDonhang(){

        return donhangRepository.findAll();
    }

}
