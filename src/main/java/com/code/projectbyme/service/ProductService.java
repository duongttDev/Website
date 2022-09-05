package com.code.projectbyme.service;

import com.code.projectbyme.entity.Product;
import com.code.projectbyme.model.ProductDto;

import java.util.List;

public interface ProductService {

    List<ProductDto> getProducts();

}
