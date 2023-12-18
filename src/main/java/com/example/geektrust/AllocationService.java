package com.example.geektrust;

import java.math.BigDecimal;

public class AllocationService {

    public Allocation allocate(String input) {
        final String[] inputArr = input.split(" ");
        return new Allocation(
                BigDecimal.valueOf(Integer.parseInt(inputArr[1])),
                BigDecimal.valueOf(Integer.parseInt(inputArr[2])),
                BigDecimal.valueOf(Integer.parseInt(inputArr[3]))
        );
    }
}
