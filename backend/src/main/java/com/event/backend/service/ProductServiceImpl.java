package com.event.backend.service;

import com.event.backend.dto.ProductDto;
import com.event.backend.mapper.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService{
    @Autowired
    private ProductMapper productMapper;

    @Override
    public List<ProductDto> selectProductList() throws Exception {
        return productMapper.selectProductList();
    }
}
