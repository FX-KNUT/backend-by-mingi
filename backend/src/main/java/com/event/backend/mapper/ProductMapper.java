package com.event.backend.mapper;

import com.event.backend.dto.ProductDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ProductMapper {
    List<ProductDto> selectProductList() throws Exception;
}
