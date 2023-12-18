package com.example.geektrust;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AllocationServiceTest {

    private AllocationService allocationService;

    @BeforeEach
    void setup() {
        allocationService = new AllocationService();
    }

    @Test
    void shouldAllocateFunds() {
        // Arrange
        final String input = "ALLOCATE 6000 3000 1000";
        // Act
        Allocation allocation = allocationService.allocate(input);
        // Assert
        assertEquals(BigDecimal.valueOf(6000), allocation.getEquity());
        assertEquals(BigDecimal.valueOf(3000), allocation.getDebt());
        assertEquals(BigDecimal.valueOf(1000), allocation.getGold());
    }
}
