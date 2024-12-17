package dev.aman.onlineshopproductservice.Models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Product {
    private long id;
    private String title;
    private String category;
    private String description;
    private double price;
}
