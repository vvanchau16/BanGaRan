package com.example.webbanga.service;

import com.example.webbanga.entity.Danhmuc;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DanhmucService {
    List<Danhmuc> getDanhmuc();
}
