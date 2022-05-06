package com.event.backend.controller;

import com.event.backend.dto.ProductDto;
import com.event.backend.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("/")
    public List brandName() throws Exception{
        List<ProductDto> list = productService.selectProductList();
        return list;
    }
}
