package com.event.backend.service;

import com.event.backend.dto.ProductDto;

import java.util.List;

public interface ProductService {
    List<ProductDto> selectProductList() throws Exception;
}
