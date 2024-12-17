package dev.aman.onlineshopproductservice.Services;

import dev.aman.onlineshopproductservice.Models.Product;

import java.util.List;

public class SelfProductService implements ProductService {
    @Override
    public Product getProductById(Long id) {
        return null;
    }

    @Override
    public List<Product> getAllProducts() {
        return List.of();
    }
}
