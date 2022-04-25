package com.letscode.salems.dto.response;

import com.letscode.salems.model.Product;
import com.letscode.salems.model.Sale;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@Getter
public class SaleResponse {

    private List<Product> products;

    private double value;

    public SaleResponse(Sale sale){
        this.products = sale.getProducts();
        this.value = sale.getValue();
    }
}
