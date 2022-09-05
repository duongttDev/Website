package com.code.projectbyme.service;

import com.code.projectbyme.entity.Product;
import com.code.projectbyme.model.ProductDto;
import com.code.projectbyme.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductServiceImpl implements ProductService{

    @Autowired
    ProductRepository productRepository;

    @Override
    public List<ProductDto> getProducts() {
        return productRepository.findAll().stream().map(ProductDto::toProductDto).collect(Collectors.toList());
    }
}
