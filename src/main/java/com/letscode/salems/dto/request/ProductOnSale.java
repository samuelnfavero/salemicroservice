package com.letscode.salems.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class ProductOnSale {
    private ClientProduct product;
    private int quantity;
}
