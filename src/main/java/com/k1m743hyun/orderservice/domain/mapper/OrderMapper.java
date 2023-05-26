package com.k1m743hyun.orderservice.domain.mapper;

import com.k1m743hyun.orderservice.domain.dto.OrderDto;
import com.k1m743hyun.orderservice.domain.entity.Order;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface OrderMapper {

    Order toEntity(OrderDto dto);

    OrderDto toDto(Order entity);
}
