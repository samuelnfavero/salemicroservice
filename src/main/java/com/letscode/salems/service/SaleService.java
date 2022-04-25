package com.letscode.salems.service;

import com.letscode.salems.dto.request.ProductOnSale;
import com.letscode.salems.dto.request.SaleRequest;
import com.letscode.salems.dto.response.SaleResponse;

import java.util.List;

public interface SaleService {

    SaleResponse create(SaleRequest saleRequest);
}
