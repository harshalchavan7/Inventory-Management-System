package com.example.demo.controller;

import com.example.demo.model.Product;
import com.example.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/viewProducts")
    public List<Product> viewProducts() {
        return this.productService.getAllProducts();
    }

    @GetMapping("/getHello")
    public String getHello() {
        return"Hello";
    }

    @GetMapping("/getProductById/{id}")
    public Optional<Product> getProduct(@PathVariable Long id) {
        System.out.println(id);
        return this.productService.getProduct(id);
    }

    @PostMapping("/addProduct")
    public String addProduct(@RequestBody Product product) {
        this.productService.saveProduct(product);
        return "Done!";
    }

    @DeleteMapping("/deleteProduct/{id}")
    public String deleteProduct(@PathVariable Long id) {
        this.productService.deleteProduct(id);
        return "Product deleted";
    }

    @PutMapping("/updateProduct/{id}")
    public String updateProduct(@PathVariable Long id,@RequestBody Product product) {
        this.productService.updateProduct(id,product);
        return "Product updated";
    }

    @PostMapping("/sellProduct/{id}")
    public String sellProduct(@PathVariable Long id,@RequestParam int quantity) {
        productService.sellProduct(id,quantity);
        return "Product sold";
    }
}
