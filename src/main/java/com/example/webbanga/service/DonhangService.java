package com.example.webbanga.service;

import com.example.webbanga.entity.Donhang;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DonhangService {
    List<Donhang> getDonhang();
}
