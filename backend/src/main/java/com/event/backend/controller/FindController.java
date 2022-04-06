package com.event.backend.controller;

import com.event.backend.dto.FindDto;
import com.event.backend.service.FindService;
import com.event.backend.repository.FindRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FindController {
    private FindService findService;
//
    @Autowired
    public FindController(FindService FindService) {
        this.findService = FindService;
    }
//    private FindRepository findRepository;
//    public FindController(FindRepository findRepository){
//    this.findRepository = findRepository;
//}
//
    FindDto findDto = new FindDto();
// http://localhost:8080/?brand="MINISTOP"&event="1+1"&name="코"
    @GetMapping()
    public void findname(@RequestParam(value = "brand") String brand,
                         @RequestParam(value = "event") String event) throws Exception {
        if (findService.findname(brand,event)){
            System.out.println("connection");
        }
        else
            System.out.println("NO connection");
    }
}
