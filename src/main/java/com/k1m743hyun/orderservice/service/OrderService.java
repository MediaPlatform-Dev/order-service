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

    private final OrderRepository repository;
    private final OrderMapper mapper;

    @Transactional
    public void newOrder(OrderDto dto) {
        repository.save(mapper.toEntity(dto));
    }

    public List<OrderDto> getOrders() {
        return repository.findAll()
            .stream()
            .map(mapper::toDto)
            .toList();
    }

    public void cancelOrder(OrderDto dto) {
        repository.delete(mapper.toEntity(dto));
    }
}
