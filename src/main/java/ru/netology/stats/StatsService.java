package ru.netology.stats;

public class StatsService {
    public long sum(long[] sales) {
        long totalSale = 0;
        for (long sale : sales) {
            totalSale += sale;
        }
        //       for (int i = 0; i < sales.length; i++) {
        //           totalSale += sales[i];
        //       }
        return totalSale;
    }

    public long average(long[] sales) {
        long totalSale = sum(sales);
        long averageSale = totalSale / 12;
        return averageSale;
    }

    public int monthMaximum(long[] sales) {
        int monthMaxSale = 0;
        for (int i = 0; i < sales.length; i++) {
           if(sales[i] >= sales[monthMaxSale]) {
               monthMaxSale = i;
           }
        }
        return monthMaxSale +1;
    }
    public int monthMinimum(long[] sales) {
        int monthMinSale = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[monthMinSale]) {
                monthMinSale = i;
            }
        }
        return monthMinSale + 1;
    }

    public  int monthsBelowAverage(long[] sales) {
        int counter = 0;
        long averageSale = average(sales);
        for (long sale : sales) {
            if (sale < averageSale) {
                counter++;
            }
        }
        return counter;
    }

    public  int monthsAboveAverage(long[] sales) {
        int counter = 0;
        long averageSale = average(sales);
        for (long sale : sales) {
            if (sale > averageSale) {
                counter++;
            }
        }
        return counter;
    }
}
