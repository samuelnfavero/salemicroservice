package com.letscode.salems.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor @Getter @NoArgsConstructor
public class SaleRequest {
    List<ProductOnSale> products;
}
