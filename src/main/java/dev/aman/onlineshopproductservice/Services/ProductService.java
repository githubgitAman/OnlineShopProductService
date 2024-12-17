package dev.aman.onlineshopproductservice.Services;

import dev.aman.onlineshopproductservice.Models.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductService {

    public Product getProductById(Long id);
    public List<Product> getAllProducts();
}
