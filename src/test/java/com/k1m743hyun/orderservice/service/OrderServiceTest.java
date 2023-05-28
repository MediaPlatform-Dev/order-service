package com.k1m743hyun.orderservice.service;

import com.k1m743hyun.orderservice.domain.mapper.OrderMapper;
import com.k1m743hyun.orderservice.repository.OrderRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class OrderServiceTest {

    @InjectMocks
    OrderService service;

    @Mock
    OrderRepository repository;

    @Mock
    OrderMapper mapper;

    @Test
    @DisplayName("")
    void createOrder() {

        // given

        // when

        // then
    }

    @Test
    @DisplayName("")
    void getOrder() {

        // given

        // when

        // then
    }

    @Test
    @DisplayName("")
    void getOrders() {

        // given

        // when

        // then
    }

    @Test
    @DisplayName("")
    void cancelOrder() {

        // given

        // when

        // then
    }
}