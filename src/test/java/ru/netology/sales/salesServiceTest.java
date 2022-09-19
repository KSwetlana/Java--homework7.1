package ru.netology.sales;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class salesServiceTest {
    salesServices services = new salesServices();
    int arr[] = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @Test
    void calculateGetSum() {
        int actual = services.getSum(arr);
        int expected = 180;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void calculateAverageValue() {
        double actual = services.averageValue(arr);
        int expected = 15;
        Assertions.assertEquals(expected, actual);

    }

    @Test
    void calculateGetMinMonth() {
        int actual = services.getMinMonth(arr);
        int expected = 9;
        Assertions.assertEquals(expected, actual);

    }

    @Test
    void calculateGetMaxMonth() {
        int actual = services.getMaxMonth(arr);
        int expected = 8;
        Assertions.assertEquals(expected, actual);

    }

    @Test
    void calculateGetLowerThanAverage() {
        int actual = services.getLowerThanAverage(arr);
        int expected = 5;
        Assertions.assertEquals(expected, actual);

    }

    @Test
    void calculateGetGreaterThanAverage() {
        int actual = services.getGreaterThanAverage(arr);
        int expected = 5;
        Assertions.assertEquals(expected, actual);

    }
}
