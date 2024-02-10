package com.shop.dashboard.dto.request;

import lombok.Data;

@Data
public class CategoryRequestDTO {
    private String name;
    private boolean isEnable;
    private String categoryCode;
}
