package com.k1m743hyun.orderservice.service;

import com.k1m743hyun.orderservice.domain.dto.OrderDto;
import com.k1m743hyun.orderservice.domain.mapper.OrderMapper;
import com.k1m743hyun.orderservice.repository.OrderRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class OrderService {

    private final OrderRepository orderRepository;
    private final OrderMapper orderMapper;

    @Transactional
    public void newOrder(OrderDto requestDto) {
        orderRepository.save(orderMapper.toEntity(requestDto));
    }

    public List<OrderDto> getOrders() {
        return orderRepository.findAll()
            .stream()
            .map(orderMapper::toDto)
            .toList();
    }
}
