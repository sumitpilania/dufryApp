package com.dufry.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dufry.bean.Product;
import com.dufry.service.ProductService;

import lombok.extern.log4j.Log4j;

@RestController
@RequestMapping("/v1/product")
@Log4j
public class ProductController {
  private final ProductService productsService;

  public ProductController(ProductService productsService) {this.productsService = productsService;}


  @PostMapping
  ResponseEntity<String> createProduct(String productId, String productName, int productPrice) {
    String sku = productsService.createNewProduct(productId, productName, productPrice);
    return ResponseEntity.ok(sku);
  }
  @PutMapping
  ResponseEntity<String> updateProduct(String productId, String productName, int productPrice) {
    productsService.updateProduct(productId, productName, productPrice);
    return ResponseEntity.ok(productId);
  }
  @DeleteMapping
  ResponseEntity<String> updateProduct(String productId) {
    productsService.deleteProduct(productId);
    return ResponseEntity.ok(productId);
  }
  @GetMapping
  ResponseEntity<Product> getProduct(String productId) {
    Product product = productsService.getProduct(productId);
    return ResponseEntity.ok(product);
  }
  @GetMapping(value="/all")
  ResponseEntity<Product> getAllProduct(String productId) {
    Product product = productsService.getProduct(productId);
    return ResponseEntity.ok(product);
  }
}
