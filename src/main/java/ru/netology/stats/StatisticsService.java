package ru.netology.stats;

public class StatisticsService {
    public long findMax(long[] incomes) {
        long currentMax = 0;
        for (long income : incomes) {
            if (currentMax < income) {
                currentMax = income;
            }
        }
        return currentMax;
    }
}
