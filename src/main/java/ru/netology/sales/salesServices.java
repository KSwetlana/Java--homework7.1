package ru.netology.sales;

public class salesServices {
    public int getSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++)
            sum += arr[i];
        //  sum = sum+arr[i];

        return sum;
    }

    public double averageValue(int[] arr) {
        return (double) getSum(arr) / arr.length;


    }

    public int getMinMonth(int[] arr) {
        int minMonth = 0;
        int month = 0;
        for (int sale : arr) {
            if (sale <= arr[minMonth]) {

                minMonth = month;
            }

            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }


    public int getMaxMonth(int[] arr) {
        int maxMonth = 0;
        int month = 0;
        for (int sale : arr) {

            if (sale >= arr[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return maxMonth + 1;
    }

    public int getLowerThanAverage(int[] arr) {
        int average = (int) averageValue(arr);
        int counter = 0;
        for (int value : arr) {
            if (value < average) {
                counter++;
            }

        }
        return counter;
    }

    public int getGreaterThanAverage(int[] arr) {
        int average = (int) averageValue(arr);
        int counter = 0;
        for (int value : arr) {
            if (value > average) {
                counter++;

            }
        }
        return counter;
    }

}



