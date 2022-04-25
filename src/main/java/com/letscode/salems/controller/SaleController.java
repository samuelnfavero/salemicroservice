package com.letscode.salems.controller;

import com.letscode.salems.dto.request.ProductOnSale;
import com.letscode.salems.dto.request.SaleRequest;
import com.letscode.salems.dto.response.SaleResponse;
import com.letscode.salems.enums.SaleStatusEnum;
import com.letscode.salems.service.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sale")
public class SaleController {

    @Autowired
    SaleService saleService;

    @PostMapping
    public SaleResponse create(@RequestBody SaleRequest saleRequest){
        return saleService.create(saleRequest);
    }



}
