package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @org.junit.jupiter.api.Test
    void shouldCalculateSum() {
        StatsService result  = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int methodResult = result.calculateSum(sales);
        int excepted = 180;
        assertEquals(excepted, methodResult);
    }

    @org.junit.jupiter.api.Test
    void shouldCalculateAvg() {
        StatsService result  = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int methodResult = result.calculateAvg(sales);
        int excepted = 15;
        assertEquals(excepted, methodResult);

    }

    @org.junit.jupiter.api.Test
    void shouldMaxSales() {
        StatsService result  = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int methodResult = result.maxSales(sales);
        int excepted = 8;
        assertEquals(excepted, methodResult);
    }

    @org.junit.jupiter.api.Test
    void shouldMinSales() {
        StatsService result  = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int methodResult = result.minSales(sales);
        int excepted = 9;
        assertEquals(excepted, methodResult);
    }

    @org.junit.jupiter.api.Test
    void shouldMinSalesAvg() {
        StatsService result  = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int methodResult = result.minSalesAvg(sales);
        int excepted = 5;
        assertEquals(excepted, methodResult );
    }

    @org.junit.jupiter.api.Test
    void shouldMaxSalesAvg() {
        StatsService result  = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int methodResult = result.minSalesAvg(sales);
        int excepted = 5;
        assertEquals(excepted, methodResult );
    }
}
