package com.mywebsite.ecommerce.services;

import com.mywebsite.ecommerce.dto.ProductDTO;
import com.mywebsite.ecommerce.entities.Product;
import com.mywebsite.ecommerce.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    @Transactional(readOnly = true)
    public ProductDTO findById(Long id) {
        Product product = repository.findById(id).get();
        return new ProductDTO(product);
    }
}
