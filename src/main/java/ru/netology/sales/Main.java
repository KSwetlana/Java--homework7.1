package ru.netology.sales;

public class Main {
    public static void main(String[] args) {

        salesServices service = new salesServices();
        int arr[] = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int resalt = service.getSum(arr);
        double resaltaVerage = service.averageValue(arr);
        int MinMonth = service.getMinMonth(arr);
        int MaxMonth = service.getMaxMonth(arr);
        int getLowerThanAverage = service.getLowerThanAverage(arr);
        int getGreaterThanAverage = service.getGreaterThanAverage(arr);


        System.out.println("Сумма:" + resalt);
        System.out.println("Среднее знаечние:" + resaltaVerage);
        System.out.println("Минимальный месяц : " + MinMonth);
        System.out.println("Максимальный месяц : " + MaxMonth);
        System.out.println("Количество месяцев продажи ниже среднего :" + getLowerThanAverage);
        System.out.println("Количество месяцев продажи выше среднего :" + getGreaterThanAverage);
    }


}

