package com.k1m743hyun.orderservice.controller;

import com.k1m743hyun.orderservice.domain.dto.OrderDto;
import com.k1m743hyun.orderservice.service.OrderService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/orders")
public class OrderController {

    private final OrderService service;

    @PostMapping
    public void createOrder(@RequestBody OrderDto requestDto) {
        service.createOrder(requestDto);
    }

    @GetMapping("/{orderNum}")
    public OrderDto getOrder(@PathVariable Long orderNum) {
        return service.getOrder(orderNum);
    }

    @GetMapping
    public List<OrderDto> getOrders() {
        return service.getOrders();
    }

    @DeleteMapping
    public void cancelOrder(@RequestBody OrderDto requestDto) {
        service.cancelOrder(requestDto);
    }
}