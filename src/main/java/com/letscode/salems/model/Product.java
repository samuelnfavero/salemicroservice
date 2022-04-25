package com.letscode.salems.model;

import com.letscode.salems.dto.request.ClientProduct;
import com.letscode.salems.dto.request.ProductOnSale;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.UUID;


@Entity
@Table(name = "product")
@Getter
@NoArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    @Column
    private String name;
    @Column
    private double price;

    @Column
    private int quantity;

    public Product(ProductOnSale productOnSale){
        ClientProduct productClient = productOnSale.getProduct();
        this.name = productClient.getName();
        this.price = productClient.getPrice();
        this.quantity = productOnSale.getQuantity();
    }
}
