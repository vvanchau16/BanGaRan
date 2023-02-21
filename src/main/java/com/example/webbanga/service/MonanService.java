package com.example.webbanga.service;

import com.example.webbanga.entity.Monan;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface MonanService {
    List<Monan> getMonan();
}
