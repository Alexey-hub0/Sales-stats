package ru.netology.stats;
public class StatsService {
    public int minSales(int[] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }

        return minMonth + 1;
    }

    public int sumOfAllSales(int[] sales) {
        int sum = 0;

        for (int i = 0; i < sales.length; i++) {
            sum += sales[i];
        }

        return sum;
    }
    public int maxSales(int[] sales) {
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }

        return maxMonth + 1;
    }
    public int averageSales(int[] sales) {
        int sum = 0;

        for (int i = 0; i < sales.length; i++) {
            sum += sales[i];
        }

        return sum / sales.length;
    }
    public int belowAverageSales(int[] sales) {
        int months =0;
        int average = averageSales(sales);
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < average){
                months ++;
            }
        }

        return months ;
    }
    public int aboveAverageSales(int[] sales) {
        int months =0;
        int average = averageSales(sales);
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > average){
                months ++;
            }
        }

        return months ;
    }
}
