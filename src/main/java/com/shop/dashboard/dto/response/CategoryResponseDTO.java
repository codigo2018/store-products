package com.shop.dashboard.dto.response;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CategoryResponseDTO {
    private String name;
    private boolean isEnable;
    private String categoryCode;
}
