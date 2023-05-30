package com.k1m743hyun.orderservice.service;

import com.k1m743hyun.orderservice.client.StockFeignClient;
import com.k1m743hyun.orderservice.domain.dto.OrderDto;
import com.k1m743hyun.orderservice.domain.dto.StockDto;
import com.k1m743hyun.orderservice.domain.entity.Order;
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
    private final StockFeignClient feignClient;

    @Transactional
    public void createOrder(OrderDto dto) {
        repository.save(mapper.toEntity(dto));
    }

    public OrderDto getOrder(Long id) {

        Order entity = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Couldn't find id: " + id));
        return mapper.toDto(entity);
    }

    public List<OrderDto> getOrders() {
        return repository.findAll()
            .stream()
            .map(mapper::toDto)
            .toList();
    }

    @Transactional
    public void cancelOrder(OrderDto dto) {
        repository.delete(mapper.toEntity(dto));
    }

    public List<StockDto> getItems() {
        return feignClient.getItems();
    }
}
