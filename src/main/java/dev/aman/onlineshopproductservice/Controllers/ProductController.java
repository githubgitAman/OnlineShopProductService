package dev.aman.onlineshopproductservice.Controllers;

import dev.aman.onlineshopproductservice.Models.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {


    @GetMapping("/{id}")
    public Product getProductById(@PathVariable("id") Long id) {
        return null;
    }
    @GetMapping
    public List<Product> getAllProducts() {
        return null;
    }
}
