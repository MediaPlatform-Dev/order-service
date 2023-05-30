package com.k1m743hyun.orderservice.client;

import com.k1m743hyun.orderservice.domain.dto.StockDto;
import java.util.List;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "stock")
public interface StockFeignClient {

    @GetMapping("/stocks")
    List<StockDto> getItems();
}
