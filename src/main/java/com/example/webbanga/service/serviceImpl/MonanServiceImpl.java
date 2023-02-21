package com.example.webbanga.service.serviceImpl;

import com.example.webbanga.entity.Monan;
import com.example.webbanga.repository.MonanRepository;
import com.example.webbanga.service.MonanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MonanServiceImpl implements MonanService {
    @Autowired
    MonanRepository monanRepository;
    @Override
    public List<Monan> getMonan(){
        return monanRepository.findAll();
    }
}
