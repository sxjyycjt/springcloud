package com.imooc.product.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "sp_product")
@Data
@AllArgsConstructor
public class Product {

    @Id
    private Integer id;
    private String productName;
    private Double price;

}
