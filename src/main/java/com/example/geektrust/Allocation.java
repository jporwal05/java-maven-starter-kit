package com.example.geektrust;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class Allocation {
    private final BigDecimal equity;
    private final BigDecimal debt;
    private final BigDecimal gold;
}
