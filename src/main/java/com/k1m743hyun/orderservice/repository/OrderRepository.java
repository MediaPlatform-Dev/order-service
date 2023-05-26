package com.k1m743hyun.orderservice.repository;

import com.k1m743hyun.orderservice.domain.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
