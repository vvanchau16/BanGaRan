package com.example.webbanga.controller;

import com.example.webbanga.entity.Monan;
import com.example.webbanga.service.MonanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/monan")
public class MonAnController {
    @Autowired
    private MonanService monanService;

    @GetMapping()
    public List<Monan> getMonAn(){
        return monanService.getMonan();
    }
}
