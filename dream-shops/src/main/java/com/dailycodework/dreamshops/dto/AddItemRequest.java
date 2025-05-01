package com.dailycodework.dreamshops.dto;

import lombok.Data;

@Data
public class AddItemRequest {
    private Long cartId;
    private Long productId;
    private Integer quantity;
}
