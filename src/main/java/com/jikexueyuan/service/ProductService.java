package com.jikexueyuan.service;

import com.jikexueyuan.model.Product;

/**
 * Created by caochenghua on 2017/4/23.
 */
public interface ProductService {
    Product add(Product product);
    Product get(long id);
}
