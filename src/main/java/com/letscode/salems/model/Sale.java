package com.letscode.salems.model;

import com.letscode.salems.dto.request.ProductOnSale;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "sales")
@Getter
@Setter
@NoArgsConstructor
public class Sale {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    @OneToMany
    private List<Product> products;

    @Column
    private double value;

    public Sale(List<Product> products){
        this.products = products;
    }
}
