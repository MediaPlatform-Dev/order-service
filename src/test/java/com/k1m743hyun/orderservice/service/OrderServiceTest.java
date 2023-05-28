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
    @DisplayName("createOrder 테스트")
    void createOrder() {

        // given

        // when

        // then
    }

    @Test
    @DisplayName("getOrder 테스트")
    void getOrder() {

        // given

        // when

        // then
    }

    @Test
    @DisplayName("getOrders 테스트")
    void getOrders() {

        // given

        // when

        // then
    }

    @Test
    @DisplayName("cancelOrder 테스트")
    void cancelOrder() {

        // given

        // when

        // then
    }
}