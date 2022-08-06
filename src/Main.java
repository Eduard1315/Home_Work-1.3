import javax.swing.*;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");

        //Task1
        int clienOS = 1;
        if (clienOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке ");
        } else {
            System.out.println("Установите версию приложения для iOS по ссылке ");
        }

        //Task2
        int productionYear = 2015;
        int deviceYear = 2014;

        if (deviceYear < productionYear) {
            System.out.print ("Установите облегчённую версию приложения для ");
        } else {
            System.out.print("Установите версию приложения для ");
        }
        if (clienOS != 1) {
            System.out.println("Android по ссылке ");
        } else {
            System.out.println("iOS по ссылке ");
        }

        //Task3
        int a = 2021;
        if (a / 100 == 0 && a / 400 == 0)
            System.out.println("год високосный ");

        else if (a / 4 == 0 && a / 100 > 0)
            System.out.println("год високосный ");

        else if (a / 100 == 0)
            System.out.println("год не високосный ");

        else
            System.out.println("год не високосный ");

        //Task4
        int deliveryDistance = 95;
        int deliveryDays = 1;
        int interval = 40;
        int startInterval = 20;
        if (deliveryDistance <= startInterval){
            deliveryDays = 1;
        } else {
            deliveryDays = deliveryDays + (int)
                    Math.ceil((deliveryDistance - startInterval) / (double) interval);
        }
        System.out.println("Потребуется дней: " + deliveryDays);

        //Задача5
        int monthNumber = 11;
        switch (monthNumber) {
            case 1:
                System.out.println("Январь - Зима");
                break;
            case 2:
                System.out.println("Февраль - Зима");
                break;
            case 3:
                System.out.println("Март - Весна");
                break;
            case 4:
                System.out.println("Апрель - Весна");
                break;
            case 5:
                System.out.println("Май - Весна");
                break;
            case 6:
                System.out.println("Июнь - Лето");
                break;
            case 7:
                System.out.println("Июль - Лето");
                break;
            case 8:
                System.out.println("Август - Лето");
                break;
            case 9:
                System.out.println("Сентябрь - Осень");
                break;
            case 10:
                System.out.println("Октябрь - Осень");
                break;
            case 11:
                System.out.println("Ноябрь - Осень");
                break;
            case 12:
                System.out.println("Декабрь - Зима");
                break;
            default:
                System.out.println("Такого месяца не существует");

        }

        }
    }





