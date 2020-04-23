package com.imooc.product.controller;

import com.imooc.product.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

/**
 * @类名 ProductController
 * @创建人 Jiang Tong
 * @创建时间 2019-12-31 15:53
 * @描述 TO
 */
@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/list")
    public List<Product> getProductList() {

        List<Product> productList = Arrays.asList(
                new Product(1,"一加8",3999.0),
                new Product(2,"一加7T",3199.0),
                new Product(3,"一加7Pro",3899.0)
        );
        return productList;
    }
    @GetMapping("/product1")
    public Product getProduct1() {
        return new Product(1,"一加8",3999.0);
    }
}
