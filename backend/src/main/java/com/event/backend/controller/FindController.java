package com.event.backend.controller;

import com.event.backend.dto.FindDto;
import com.event.backend.service.FindService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FindController {

    private FindService FindService;

    @Autowired
    public FindController(FindService FindService) {
        this.FindService = FindService;
    }

    FindDto findDto = new FindDto();

    @GetMapping("/brands/{brand}name = {name}")
    public String findname(@RequestParam String brand, String name) throws Exception {

//        if (FindService.findname(brand, name)) {
//
//
//        }
        return brand;
    }
}
