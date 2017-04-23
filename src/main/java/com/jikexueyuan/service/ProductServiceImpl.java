package com.jikexueyuan.service;

import com.jikexueyuan.model.Product;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by caochenghua on 2017/4/23.
 */

@Service
public class ProductServiceImpl implements ProductService {


    private Map<Long, Product> products=new HashMap<Long, Product>();
    private AtomicLong generator=new AtomicLong();

//    public ProductServiceImpl(Map<Long, Product> products) {
//        this.products = products;
//    }
    public ProductServiceImpl() {
        Product product=new Product();
        product.setName("曹城华");
        product.setDescription("规格严格，功夫到家");
        product.setPrice(666);
        add(product);
    }

    @Override
    public Product add(Product product) {
        long newId=generator.incrementAndGet();
        product.setId(newId);
        products.put(newId,product);
        return product;
    }

    @Override
    public Product get(long id) {
        return products.get(id);
    }
}
