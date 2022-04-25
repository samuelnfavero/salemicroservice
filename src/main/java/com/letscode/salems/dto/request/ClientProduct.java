package com.letscode.salems.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ClientProduct {
    private Long id;
    private String name;
    private double price;
    private int stockQuantity;
}
