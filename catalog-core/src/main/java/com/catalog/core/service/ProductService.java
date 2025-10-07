package com.catalog.core.service;

import com.catalog.persistence.mapper.ext.ProductExtMapper;
import com.catalog.persistence.model.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    private final ProductExtMapper productExtMapper;

    public ProductService(ProductExtMapper productExtMapper) {
        this.productExtMapper = productExtMapper;
    }

    public List<Product> getAllProducts() {
        return productExtMapper.selectList(null);
    }
}
