package com.dufry.bean;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class Order {
  List<Product> products;
  String orderId;
  String customerEmail;
  LocalDateTime orderDate;
}
