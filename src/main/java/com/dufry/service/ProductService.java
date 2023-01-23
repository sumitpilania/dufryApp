package com.dufry.service;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

import com.dufry.bean.Product;

@Service
public class ProductService {

  public String createNewProduct(String productId, String productName, int productPrice) {
    Product product = Product.builder()
        .id(productId)
        .name(productName).price(productPrice).createdOn(LocalDateTime.now()).build();
    return product.getId();
  }

  public void updateProduct(String productId, String productName, int productPrice) {
    //repository.getProduct(productId).update(productName, productPrice);
  }

  public void deleteProduct(String productId) {

  }

  public Product getProduct(String productId) {
    //repository.getProduct(productId).update(productName, productPrice);
    Product product = Product.builder()
        .id("1")
        .name("one").price(100).createdOn(LocalDateTime.now()).build();
    return product;
  }
}
