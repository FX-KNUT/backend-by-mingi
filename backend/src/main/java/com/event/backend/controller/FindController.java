package com.event.backend.controller;

import com.event.backend.service.FindService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FindController {

    private FindService findService;
    public FindController(FindService FindService) {
        this.findService = FindService;
    }

    @GetMapping("find")
    public void findbrand(@RequestParam String brand) throws Exception {
        List itemList = findService.findbrand(brand);
        System.out.println(brand + "\n");
        for (Object o : itemList) {
            System.out.println(o.toString());
        }
    }
    @GetMapping("find")
    public void findevent(@RequestParam String brand,
                         @RequestParam String event) throws Exception {
        List itemList = findService.findevent(brand, event);
        System.out.println(brand + "\n" + event);
        for (Object o : itemList) {
            System.out.println(o.toString());
        }
    }
    @GetMapping("find")
    public void findevent(@RequestParam String brand,
                          @RequestParam String event,
                          @RequestParam String name ) throws Exception {
        List itemList = findService.findname(brand, event, name);
        System.out.println(brand + "\n" + event + "\n" + name);
        for (Object o : itemList) {
            System.out.println(o.toString());
        }
    }
}
