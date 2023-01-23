package com.dufry.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dufry.service.OrderService;

import lombok.extern.log4j.Log4j;

@RestController
@RequestMapping("/v1/order")
@Log4j
public class OrderController {
  private final OrderService orderService;

  public OrderController(OrderService orderService) {
    this.orderService = orderService;
  }
}
