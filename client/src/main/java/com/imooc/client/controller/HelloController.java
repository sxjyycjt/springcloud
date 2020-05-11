package com.imooc.client.controller;

import com.imooc.client.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/client")
public class HelloController {

    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private DiscoveryClient discoveryClient;


    @GetMapping("/hello/{name}")
    public String sayHello(@PathVariable String name){
        return "Hello " + name;
    }

    @GetMapping("/productList")
    public List<Product> getProductList(){
        //根据服务ID获取实例，一个serviceId可以有多个实例，所以返回的是一个集合
        List<ServiceInstance> instances = discoveryClient.getInstances("product");
        ServiceInstance serviceInstance = instances.get(0);
        String url = "http://"+serviceInstance.getHost()+":"+serviceInstance.getPort()+"/product/list/";
        List<Product> productList = restTemplate.getForObject(url, List.class);
        return productList;
    }

    @GetMapping("/product")
    public Product getProduct(){
        //根据服务ID获取实例，一个serviceId可以有多个实例，所以返回的是一个集合
        List<ServiceInstance> instances = discoveryClient.getInstances("product");
        ServiceInstance serviceInstance = instances.get(0);
        String url = "http://"+serviceInstance.getHost()+":"+serviceInstance.getPort()+"/product/product1/";
        Product product = restTemplate.getForObject(url, Product.class);
        return product;
    }



}
