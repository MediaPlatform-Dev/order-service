package com.k1m743hyun.orderservice.domain.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StockDto {

    private Long stockNum;
    private String itemName;
    private Long itemPrice;
    private int stockQuantity;
}
