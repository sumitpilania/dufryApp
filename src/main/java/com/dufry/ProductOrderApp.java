package com.dufry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(
    scanBasePackages = {"com.dufry"})
public class ProductOrderApp {
  public static void main(String[] args) {
    SpringApplication.run(ProductOrderApp.class, args);
  }
}
