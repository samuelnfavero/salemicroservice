package com.letscode.salems.service.impl;

import com.letscode.salems.dto.request.ProductOnSale;
import com.letscode.salems.dto.request.SaleRequest;
import com.letscode.salems.dto.response.SaleResponse;
import com.letscode.salems.model.Product;
import com.letscode.salems.model.Sale;
import com.letscode.salems.repository.ProductRespository;
import com.letscode.salems.repository.SaleRepository;
import com.letscode.salems.service.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SaleServiceImpl implements SaleService {

    @Autowired
    SaleRepository saleRepository;
    @Autowired
    ProductRespository productRespository;
    @Override
    public SaleResponse create(SaleRequest saleRequest) {
        var productsOnSale = saleRequest.getProducts();
        List<Product> products = productsOnSale.stream()
                .map(Product::new)
                .collect(Collectors.toList());
        List<Product> savedProducts = productRespository.saveAll(products);
        Sale sale = new Sale(savedProducts);
        sale.setValue(finalValueCalculator(savedProducts));
        saleRepository.save(sale);

        return new SaleResponse(sale);
    }

    private double finalValueCalculator(List<Product> products){
        return products.stream()
                .reduce((double) 0, (acc, product) -> acc + eachProductValue(product), Double::sum );
    }

    private double eachProductValue(Product product) {
        return product.getPrice() * product.getQuantity();
    }

}
