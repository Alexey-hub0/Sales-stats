package ru.netology.stats;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class StatsServiceTest {

    @Test
    void SumOfAllSalesTest() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int actual = service.sumOfAllSales(sales);
        int expected = 180;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void MaxSalesTest() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int actual = service.maxSales(sales);
        int expected = 8;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void MinSalesTest() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int actual = service.minSales(sales);
        int expected = 9;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void AverageSalesTest() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int actual = service.averageSales(sales);
        int expected = 15;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void BelowAverageSalesTest() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int actual = service.belowAverageSales(sales);
        int expected = 5;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void AboveAverageSalesTest() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int actual = service.aboveAverageSales(sales);
        int expected = 5;

        Assertions.assertEquals(expected, actual);
    }

}

