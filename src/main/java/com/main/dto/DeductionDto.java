package com.main.dto;

import java.math.BigDecimal;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DeductionDto {
    private Long id;
    private String name;
    private String description;
    private BigDecimal price;
    private Date dateCreated;
    
}