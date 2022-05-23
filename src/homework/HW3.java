package homework;

import java.awt.geom.Area;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Arrays;

public class HW3 {

    public static void main (String[] args) {

        //Part 1

        byte a = 100;
        byte b = 25;
        short s = -30000;
        short t = 30000;
        int i = Integer.MIN_VALUE;
        String line = "___________________________________";
        char palka = '|';

        System.out.println("\t\t\tTask 1");

        System.out.println(line);
        System.out.println(palka + "int min          " + palka + i + "    " + palka);
        System.out.println(line);

        i = Integer.MAX_VALUE;

        System.out.println(palka + "int max          " + palka + i + "     " + palka);
        System.out.println(line);

        line = "_____________________________________________________";

        long phoneNumber = 18009998877L;
        float f = 100.101101f;
        double d = 100.101101;
        Double dd = 10.09999 + 20.099999;
        Float ff = 10.09999f + 20.099999f;

        System.out.println("\t\t\tTask 6 and 7");

        System.out.println("\n" + line);
        System.out.println(palka + "float f = " + f + "           " + palka + "значение f        " + palka);
        System.out.println(line);
        System.out.println(palka + "double d = " + d + "          " + palka + "значение d        " + palka);
        System.out.println(line);
        System.out.println(palka + "Double dd = " + dd + " " + palka + "значение dd       " + palka);
        System.out.println(line);
        System.out.println(palka + "Float ff = " + ff + "            " + palka + "значение ff       " + palka);
        System.out.println(line);

        double result = 10.0 / 3;
        double sum = f + d;
        double product = f - d;
        //деление
        double quotient = f / d;
        //остаток
        double remainder = f % d;

        //Распечатать слово HELLO точками
        System.out.println("\t\t\tTask 10");

        System.out.println(". . ... .   .    .\n"
                         + ". . .   .   .   . . \n"
                         + "... ... .   .  .   .\n"
                         + ". . .   .   .   . . \n"
                         + ". . ... ... ...  .");

        //Part 2

        Byte t1 = 0;
        Short t2 = 150;
        Byte t3 = -120;
        Float t4 = - 505.505f;
        Integer t5 = 100100;
        Long t6 = 100010001000L;
        Double t7 = 2.66666666666666;
        Double t8 = -1000000.001;
        Short t9 = 1010;

        System.out.println("\t\t\tTask 11");
        System.out.println(t1 + " " + t2 + " " + t3 + " " + t4 + " " + t5 + " "
            + t6 + " " + t7 + " " + t8 + " " + t9);



        line = "___________________________________________________________________";

        System.out.println("\t\t\t\t\t\tTask 12");
        System.out.println(line);
        System.out.println(palka + "Type    " + palka + "Size in bits" + palka + "  min               "
                + palka + "  max                 " + palka);
        System.out.println(line);
        System.out.println(palka + "byte    " + palka + Byte.SIZE + "           " + palka + Byte.MIN_VALUE
                + "                " + palka + Byte.MAX_VALUE + "                   " + palka);
        System.out.println(line);
        System.out.println(palka + "short   " + palka + Short.SIZE + "          " + palka + Short.MIN_VALUE
                + "              " + palka + Short.MAX_VALUE + "                 " + palka);
        System.out.println(line);
        System.out.println(palka + "int     " + palka + Integer.SIZE + "          " + palka + Integer.MIN_VALUE
                + "         " + palka + Integer.MAX_VALUE + "            " + palka);
        System.out.println(line);
        System.out.println(palka + "long    " + palka + Long.SIZE + "          " + palka + Long.MIN_VALUE
                + palka + Long.MAX_VALUE + "   " + palka);
        System.out.println(line);
        System.out.println(palka + "float   " + palka + Float.SIZE + "          " + palka + Float.MIN_VALUE
                + "             " + palka + Float.MAX_VALUE + "          " + palka);
        System.out.println(line);
        System.out.println(palka + "double  " + palka + Double.SIZE + "          " + palka + Double.MIN_VALUE
                + "            " + palka + Double.MAX_VALUE + palka);
        System.out.println(line);


        System.out.println("\t\t\t\tTask 13");

        Integer num1 = 30;
        Integer num2 = 30;

        System.out.println("Если num1 = num2, то результат сравнения методом .equal = " + num1.equals(num2));

        num1 = 100;
        System.out.println("Если num1 не равно num2, то результат сравнения методом .equal = " + num1.equals(num2));


        //14. Создать 2 переменные примитивного типа int - number1 and number2. Инициализаровать их
        //а) одинаковыми значениями
        //b) number1 < number2
        //c) number1 > number2
        //сравнить их подходящим методом класса Integer (посмотрите, какой метод подойдет),
        // и вывести результаты сравнения на печать в виде выражений:
        //“Если number1 = number2, то результат сравнения методом … = …”
        //“Если number1 < number2, то результат сравнения методом … = …”
        //“Если number1 > number2, то результат сравнения методом … = …”

        System.out.println("\t\t\t\tTask 14");

        int number1 = 33;
        int number2 = 33;
        System.out.println("Если number1 = number2, то результат сравнения методом compare = "
                + Integer.compare(number1, number2));

        number2 = 50;
        System.out.println("Если number1 < number2, то результат сравнения методом compare = "
                + Integer.compare(number1, number2));

        number1 = 100;
        System.out.println("Если number1 > number2, то результат сравнения методом compare = "
                + Integer.compare(number1, number2));

        //15. Создать переменную типа Float, присвоить
        // ей значение 234.9999 и распечатать значение в int

        Float Fl = 234.9999f;

        System.out.println("\t\t\t\tTask 15");
        System.out.println("int = " + Math.round(Fl));


        //16. С помощью метода sum() класса Double
        // посчитать сумму двух переменных типа double.

        double number21 = 666.666666;
        double number22 = 777.7777777;

        System.out.println("\t\t\t\tTask 16");
        System.out.println("sum of doubles = " + Double.sum(number21, number22));


        //17. С помощью метода sum() класса Integer
        // посчитать сумму двух переменных типа Float.


        Float Number11 = 1234.1234f;
        Float Number12 = 5678.5678f;

        System.out.println("\t\t\t\tTask 17");
        System.out.println("sum of Floats by Integer class = "
                + Integer.sum(Math.round(Number11), Math.round(Number12)));


        //18. Создать 2 переменные типа Short:
        //short1 = 12000
        //short2 = 12300
        //Распечатать фразу:
        //“12000 - 12300 = -300”
        //где значение -300 выведено с помощью метода класса Short, а не операцией вычисления
        //Присвоить переменной short1 значение 12500, вывести фразу:
        //“12500 - 12300 = 200”
        //где значение 200 выведено с помощью метода класса Short, а не операцией вычисления

        System.out.println("\t\t\t\tTask 18");

        Short short1 = 12000;
        Short short2 = 12300;
        System.out.println("12000 - 12300 = " + Short.compareUnsigned(short1, short2));

        short1 = 12500;
        System.out.println("12500 - 12300 = " + Short.compareUnsigned(short1, short2));


        //19. Распечатать результат doub1 - doub2
        //Используя методы ссылочного типа данных,
        // посчитать и распечатать результат str1 - str2

        String str1 = "123.56";
        String str2 = "123.55";
        Double doub1 = 123.56;
        Double doub2 = 123.55;

        System.out.println("\t\t\t\tTask 19");
        System.out.println("doub1 - doub2 = " + (doub1 - doub2));
        System.out.println("str1 - str2 = " + (Double.valueOf(str1) - Double.valueOf(str2)));


        //20. Создать переменную подходящего типа данных для хранения результатов измерения
        // температуры тела кота (значения температуры в Цельсиях).
        // Присвоить этой переменной сначала максимальное значение, затем минимальное значение.
        // Посчитать и распечатать среднее значение, округленное с помощью метода класса Math.
        // Распечатать результат среднего значения температуры тела кота.

        Float temperatureMax = 40.5f;
        Float temeratureMin = 35.2f;

        System.out.println("\t\t\t\tTask 20");
        System.out.println("middle cat temperature = " + Float.sum(temeratureMin, temperatureMax) / 2);
        System.out.println("middle cat temperature (round) = "
                + Math.round(Float.sum(temeratureMin, temperatureMax) / 2));



        //21. Создать переменную n типа Number, присвоить ей максимально возможное значение.
        //Присвоить n значение 10,
        //затем присвоить n значение 10.999999999.
        //
        //Распечатать результаты в виде выражения:
        //“Переменная n может принимать значения:
        // n =  …
        // n =  …
        // n =  …
        // Это возможно, потому что …”
        System.out.println("\t\t\t\tTask 21");

        Number n = Long.MAX_VALUE;
        System.out.println("n = " + n);

        n = 10;
        System.out.println("n = " + n);

        n = 10.999999999;
        System.out.println("n = " + n);
        System.out.println("Это возможно, потому что Number - класс котрый содержит в себе все числовые подклассы");

        //22. Создать переменную Integer numberInteger = 100.
        //Доказать, что numberInteger имеет тип Integer,
        //а numberInteger.toString() имеет тип String.

        System.out.println("\t\t\t\tTask 22");

        Integer numberInteger = 100;
        System.out.println("type of numberInteger - " + numberInteger.getClass().getSimpleName());

        System.out.println("type of numberInteger now - " + numberInteger.toString().getClass().getSimpleName());

        //23. Вывести на экран следующие выражения, используя для печати только переменные:
        //“36.6 градусов по Цельсию  = 98.6 градусов по Фаренгейту”,
        // где значение по Фаренгейту должно быть вычислено по формуле
        //“50 kilogram = … lbs,  50 lb = … kg”, где значения должны быть вычислены по формулам

        System.out.println("\t\t\t\tTask 23");

        double cels = 36.6;
        String text1 = " градусов по Цельсию  = ";
        double fareng = cels * 1.8 + 32.0;
        String text2 = " градусов по Фаренгейту";

        System.out.println(cels + text1 + fareng + text2);

        text1 = " kilogram = ";
        text2 = " lbs,  ";
        String text3 = " lb = ";
        String text4 = " kg";
        double x = 50;
        double lb = i  / 0.45359237;
        double kg = i * 2.2046223302272;

        System.out.println(x + text1 + lb + text2 + x + text3 + kg + text4);



    }

}
