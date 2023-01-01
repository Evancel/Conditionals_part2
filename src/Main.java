public class Main {
    public static void main(String[] args) {
       /* task1();
        System.out.println();
        task2();
        System.out.println();
        task3();
        System.out.println();
        task4();
        System.out.println();*/
        task5();

    }

    public static void task1(){
        System.out.println("Task1");
        int clientOS = 1;
        //0 - iOS; 1 - Android
        switch(clientOS){
            case 0:
                System.out.println("Установите версию приложения для iOS по ссылке");
                break;
            case 1:
                System.out.println("Установите версию приложения для Android по ссылке");
                break;
        }
    }

    public static void task2(){
        System.out.println("Task2");
        int clientOS = 0;
        int clientDeviceYear = 2001;

        if (clientOS == 0) {
            if (clientDeviceYear<2015){
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        } else if (clientOS == 1){
            if (clientDeviceYear<2015){
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }
    }

    public static void task3(){
        System.out.println("Task3");
        int year = 2400;
        if (year%400==0){
            System.out.println(year + " это високосный год");
        } else if (year%100==0){
            System.out.println(year + " это невисокосный год");
        } else if (year%4==0){
            System.out.println(year + " это високосный год");
        } else {
            System.out.println(year + " это невисокосный год");
        }

    }

    public static void task4(){
        System.out.println("Task4");
        int deliveryDistance=-100;
        int countDays=0;

        if (deliveryDistance>0 && deliveryDistance<=20){
            countDays=countDays+1;
        } else if (deliveryDistance>20 && deliveryDistance<=60){
            countDays=countDays+2;
        } else if (deliveryDistance>60 && deliveryDistance<=100){
            countDays=countDays+3;
        } else if (deliveryDistance>100){
            System.out.println("Свыше 100км доставки нет");
            return;
        } else if(deliveryDistance<=0){
            System.out.println("Ошибка! Переменная deliveryDistance не может быть меньше или равна нулю");
            return;
        }
        System.out.println("Потребуется дней: "+countDays);
    }

    public static void task5(){
        System.out.println("Task5");
        int monthNumber = 9;

        switch(monthNumber){
            case 1:
                System.out.println("Январь принадлежт к сезону зима.");
                break;
            case 2:
                System.out.println("Февраль принадлежт к сезону зима.");
                break;
            case 3:
                System.out.println("Март принадлежт к сезону весна.");
                break;
            case 4:
                System.out.println("Апрель принадлежт к сезону весна.");
                break;
            case 5:
                System.out.println("Май принадлежт к сезону весна.");
                break;
            case 6:
                System.out.println("Июнь принадлежт к сезону лето.");
                break;
            case 7:
                System.out.println("Июль принадлежт к сезону лето.");
                break;
            case 8:
                System.out.println("Август принадлежт к сезону лето.");
                break;
            case 9:
                System.out.println("Сентябрь принадлежт к сезону осень.");
                break;
            case 10:
                System.out.println("Октябрь принадлежт к сезону осень.");
                break;
            case 11:
                System.out.println("Ноябрь принадлежт к сезону осень.");
                break;
            case 12:
                System.out.println("Декабрь принадлежт к сезону зима.");
                break;
            default:
                System.out.println("Ошибка! Неверно задано значение месяца.");
        }
    }
}