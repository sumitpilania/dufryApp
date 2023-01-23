package com.dufry.bean;

import java.time.LocalDateTime;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
public class Product {
  String id;
  String name;
  int price;
  LocalDateTime createdOn;
  LocalDateTime updatedOn;
}
