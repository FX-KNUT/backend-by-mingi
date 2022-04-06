package com.event.backend.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
public class FindDto {
    private String brand;
    private String event;
    private String name;
    private String price;
    private String img;

    public FindDto(String brand, String event, String name , String price, String img ) {
        this.brand = brand;
        this.event = event;
        this.name = name;
        this.price = price;
        this.img = img;
    }
}



