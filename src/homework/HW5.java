package homework;

import java.util.Arrays;

public class HW5 {

    //1
    public static String verifyEquals(int expectedResult,int actualResult) {
        if (expectedResult == actualResult) {
            return "Pass";
        } else {
            return "Fail";
        }
    }


    //2
    public static void day(int number) {
        String result;

        if (number < 1 || number > 7) {
            result = "to large or to little number";
        }

        if (number == 1) {
            result = "Sunday";
        } else if (number == 2) {
            result = "Monday";
        } else if (number == 3) {
            result = "Tuesday";
        } else if (number == 4) {
            result = "Wednesday";
        } else if (number == 5) {
            result = "Thursday";
        } else if (number == 6) {
            result = "Friday";
        } else if (number == 7) {
            result = "Saturday";
        } else {
            result = "to large or to little number";
        }

        System.out.println(result);
    }

    //3
    public static void largestOf3(int x, int y, int z) {
        int max;
        if (x > y) {
            max = x;
        } else {
            max = y;
        }

        if (max < z) {
            max = z;
        }
        System.out.println(max);
    }


    //4
    public static void smallestOf3(int a, int b, int c) {
        System.out.println(Math.min(c, Math.min(a, b)));
    }

    //5
    public static void averageCatTemperature(double a, double b, double c, double d, double x) {
        double average = (a + b + c + d + x) / 5;
        System.out.println(average);
    }

    //6
    public static String money(double x) {
        String money = (int)Math.floor(x) + " грн " + (int)(100 * (x - Math.floor(x))) + " коп";
        return money;
    }

    //7
    public static String kilogram(double x) {
        String kilogram = (int)Math.floor(x) + " кг " + (int)(100 * (x - Math.floor(x))) + " г";
        return kilogram;
    }

    //8
    public static String shopping(double quantityOfGoods, double priceOf1) {
        Double shopping = quantityOfGoods * priceOf1;
        return money(shopping);
    }



    //9
    public static void check(String typeOfProduct, double price, double quantityOfGoods) {
        System.out.println(typeOfProduct);
        System.out.println("Цена за 1 кг             " + money(price));
        System.out.println("Количество товара        " + kilogram(quantityOfGoods));
        System.out.println("_____________________________________________");
        System.out.println("Сумма к оплате           " + shopping(quantityOfGoods, price));
    }

    //10
    public static double salary(double hoursInDay, double priceOfOneHour) {
        return hoursInDay * 31 * priceOfOneHour;
    }

    //11
    public static void cardOfSalary(String nameOfEmployee, double hoursInDay, double priceOfOneHour) {
        System.out.println(nameOfEmployee + "\t\t\t" + money(salary(hoursInDay, priceOfOneHour)));
    }

    //12
    public static void arrows(int x) {
        if (x < 0) {
            System.out.println("x is negative");
        } else {
            if (x > 0) {
                System.out.println("x is positive");
            } else {
                System.out.println("x is zero");
            }
        }
    }


    //13
    public static int luckyNumber(int yob) {
        int result = 0;
        if (yob < 1900) {
            System.out.println("Это не твой год рождения");
        }else {
            while (yob > 0) {
                long l = yob % 10;
                result += l;
                yob /= 10;
            }
        }
        int temp = result;
        result = 0;
        while (temp > 0) {
            long l = temp % 10;
            result += l;
            temp /= 10;
        }
        temp = result;
        result = 0;
        while (temp > 0) {
            long l = temp % 10;
            result += l;
            temp /= 10;
        }

        return result;
    }

    //14
    public static void medianMinusAverageOf3(int a, int b, int c) {
        int average = (a + b + c) / 3;
        int median;
        if (a > b && a < c || a < b && a > c) {
            median = a;
        } else if (b > a && b < c || b < a && b > c) {
            median = b;
        } else {
            median = c;
        }

        int result = average - median;
        if (result > 2) {
            System.out.println("Среднее значение " + average + " отличается от медианы " + median + " на " + result);
        } else {
            System.out.println("Среднее значение = " + average + ", медиана = " + median);
        }
    }

    //15
    public static String roundingForBuyer(double x) {
        return (int)Math.floor(x) + "грн" + "00 коп";
    }

    //16
    public static double equation(int a, int b, int c) {
        double result = Math.sqrt(((a * b + c) * Math.pow(a, b))) / Math.PI;
        return Math.ceil(result);
    }

    //17????????????

    //18
    public static void degree(int x) {
        double random = Math.random();
        int result = (int)Math.round(Math.pow(random, x));
        if (x < 0 || x > 10) {
            System.out.println("Число должно быть от 0 до 10");
        } else {
            System.out.println("Число " + random + " в степени " + x + " = " + result);
        }
    }

    //19
    public static int randomFrom1To99() {
        return (int)(Math.random() * 100) + 1;
    }

    //20
    public static boolean isLeapYear(int year) {
        if (year >= 0) {
            if (year % 4 == 0) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }


    public static void main(String[] args) {

//        day(4);
//        largestOf3(50, -33, 191);
//        smallestOf3(12, 643, 3245);
//        averageCatTemperature(35.43, 54.12, 27.6, 456.7, 36);
//        money(5.75);
//
//        check("Яблоки", 50.13, 3.40);
//        System.out.println("____________________________________________");
//
//        System.out.println("Март 2022");
//        cardOfSalary("Смирнова Мария Ивановна", 7, 1000);
//        cardOfSalary("Серебряков Иван Петрович", 8, 16007.375);
//
//        System.out.println(luckyNumber(1999));
//
//        int a = 3;
//        int b = 4;
//        int c = 20;
//
//        System.out.println(equation(a, b, c));


//        degree(1);

//        System.out.println(randomFrom1To99());
//        System.out.println(randomFrom1To99());
//        System.out.println(randomFrom1To99());
//        System.out.println(randomFrom1To99());
//        System.out.println(randomFrom1To99());
//        System.out.println(randomFrom1To99());


        System.out.println(isLeapYear(1992));


    }
}
