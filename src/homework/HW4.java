package homework;

public class HW4 {

    public static void main(String[] args) {

        task(3);

        System.out.println("2 == 2 && 7 == 7");
        System.out.println("!(15 < 3)");
        System.out.println("\"Сосна\" == \"Дуб\" || \"Вишня\" == \"Клён\"");
        System.out.println("!(\"Клён\" == \"Дуб\"");
        System.out.println("!(15 < 3) && (10 > 20)");
        System.out.println("\"Глаза даны, чтобы видеть\" && \"Под третьим этажом находится второй этаж\"");
        System.out.println("6 / 2 == 3 || 7 * 5 == 20");


        task(4);

        System.out.println("minute == 70 || clock == time");
        System.out.println("!(28 > 7) && !(300 / 5 == 60)");
        System.out.println("TV == electro && glass == tree");
        if (!((300 < 100))) {
            System.out.println("Жажду можно утолить водой");
        }
        if (75 < 81) {
            System.out.println("88 = 88");
        }

        task(5);

        System.out.println("ageAndrey > ageSveta");
        System.out.println("ageNatasha > ageSveta");
        System.out.println("shelf == books");
        System.out.println("table == directory");
        System.out.println("people / 2 < girls");
        System.out.println("people % girls = boys");


        task(6);

        int age = 0;
        if (age > 15) {
            System.out.println("u can get driving licenses");
        }


        task(7);

        boolean petyaInBus = false;
        boolean petyaReadBook = true;
        boolean petyaLookWindow = false;

        if (petyaInBus == false && petyaReadBook == true || petyaLookWindow == false) {
            System.out.println("Петя не едет в автобусе, но при этом читает книгу или не смотрит в окно");
        }



        task(10);

        int x = 5;

        if (x % 2 == 0) {
            x *= 2;
        } else {
            x *= x;
        }

        System.out.println(x);

        task(19);
        //Напишите тест, который валидирует (проверит правильность работы)
        //ваш код из задания №10. Тестовые данные - 2, 5, 0.

        int expectedResult = 25;

        if (x == expectedResult) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }






        task(11);

        age = 17;
        String result1;
        String result2;
        String result3;

        if (age > 17) {
            result1 = "Голосовать можно";
        } else {
            result1 = "Голосовать можно с 18 лет";
        }

        if (age > 15) {
            result2 = "Машину можно водить";
        } else {
            result2 = "Машину можно водить с 16 лет";
        }

        if (age > 4) {
            result3 = "В школу можно идти";
        } else {
            result3 = "В школу можно идти с 5 лет";
        }

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);

        task(20);

        String expectResult1 = "Голосовать можно";
        String expectResult2 = "Машину можно водить";
        String expectResult3 = "В школу можно идти";

        if (expectResult1.equals(result1)) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }

        if (expectResult2.equals(result2)) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }

        if (expectResult3.equals(result3)) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }

        task(12);

        int grade = 3;

        if (grade == 5) {
            System.out.println("выдать похвальную грамоту и перевести в следующий класс");
        } else if (grade == 4) {
            System.out.println("перевести в следующий класс");
        } else if (grade == 3) {
            System.out.println("дать задание на лето и перевести в следующий класс");
        } else if (grade == 2) {
            System.out.println("вызвать родителей и оставить в текущем классе на второй год");
        } else {
            System.out.println("либо вундеркинд либо в спецшколу");
        }


        task(13);

        int a = 12;
        int b = 13;
        int result = 0;

        if (a % 3 == 0 && b % 3 == 0) {
            result = a * b;

        } else if (a % 5 == 0 && b % 5 == 0) {
            result = a - b;
        } else if (a % 2 == 0 && b % 2 == 0) {
            result = a * b;
            if (result < 0) {
                result *= -1;
            }
        } else {
            System.out.println("программа выводит на печать ошибку о невозможности произвести действия.");
        }
        System.out.println(result);


        task(14);

        double k = 777;
        double l = 555;
        double m = 111;

        KandL(k, l, m);

        task(15);

        int apple = 40;
        int student = 6;

        apples(apple, student);

        int apple2 = 100;
        int student2 = 21;

        apples(apple2, student2);

        task(16);

        apple = 42;
        student = 42;

        apples(apple, student);

        apple = 55;
        student = 5;

        apples(apple, student);

        apple = 1;
        student = 2;

        apples(apple, student);


        task(17);

        double cels = 23;

        temreture(cels);


        task(18);

        int i = 2;
        tabl(i);
        tabl(12);



        task(21);

        short y = 20000;
        digits(y);







    }


    public static void task(int number) {

        System.out.println("\t\tTask №" + number);

    }


    public static void KandL(double k, double l, double m) {
        double divisionKL = k / l;
        double remainderKL = k % l;
        double divisionKM = k / m;
        double remainderKM = k % m;
        double divisionLM = l / m;
        double remainderLM = l % m;
        double divisionMK = m / k;
        double remainderMK = m % k;


        System.out.println("Результат деления k на l = " + divisionKL + ", а остаток от деления  = " + remainderKL);
        System.out.println("Результат деления k на m = " + divisionKM + ", а остаток от деления  = " + remainderKM);
        System.out.println("Результат деления l на m = " + divisionLM + ", а остаток от деления  = " + remainderLM);
        System.out.println("Результат деления m на k = " + divisionMK + ", а остаток от деления  = " + remainderMK);



    }


    public static void apples(int apple, int student) {

        int division = apple / student;
        int remainder = apple % student;

        if (apple == 42 && student == 42) {
            System.out.println("Если " + apple + " яблока поделить на " + student
                    + " ученика, то каждый ученик\nполучит по " + division + " яблоку, и "
                    + remainder + " яблок останется учителю.");
        } else if (apple == 55 && student == 5) {
            System.out.println("Если " + apple + " яблок поделить на " + student
                    + " учеников, то каждый ученик\nполучит по " + division + " яблок, и "
                    + remainder + " яблок останется учителю.");
        } else if (apple == 1 && student == 2) {
            System.out.println("Если " + apple + " яблоко поделить на " + student
                    + " ученика, то каждый ученик\nполучит по " + division + " яблок, и "
                    + remainder + " яблоко останется учителю.");
        } else {
            System.out.println("Если " + apple + " яблок(а) поделить на " + student
                    + " ученика, то каждый ученик\nполучит по " + division + " яблок(a), и "
                    + remainder + " яблок(a) останется учителю.");
        }
    }


    public static void temreture(double cels) {

        double fareng = cels * 1.8 + 32.0;

        System.out.println("tempreture: " + cels + " c and " + fareng + " f");
    }

    public static void tabl(int i) {
        String line = "_________________________________";
        char palka = '|';

        System.out.println(line);
        System.out.println(palka + "int min         " + palka + Integer.MIN_VALUE + "\t" + palka);
        System.out.println(line);
        System.out.println(palka + "int max         " + palka + Integer.MAX_VALUE + " \t" + palka);
        System.out.println(line);
        System.out.println(palka + "i^2             " + palka + (i * i) + "\t\t\t" + palka);
        System.out.println(line);

    }

    public static void digits(short x) {

        String result = "";
        if (x < 10 && x > -10) {
            result = "It’s a one-digit number.";
        } else if (x < 100 && x > -100) {
            result = "It’s a two-digit number.";
        } else if (x < 1000 && x > -1000) {
            result = "It’s a three-digit number.";
        } else if (x < 10000 && x > -10000) {
            result = "It’s a four-digit number.";
        } else if (x < Short.MAX_VALUE && x > Short.MIN_VALUE) {
            result = "It’s a five-digit number.";
        }

        System.out.println(result);
    }

    //    public static final String ANSI_RESET = "\u001B[0m";
    //    public static final String ANSI_BLACK = "\u001B[30m";
    //    public static final String ANSI_RED = "\u001B[31m";
    //    public static final String ANSI_GREEN = "\u001B[32m";
    //    public static final String ANSI_YELLOW = "\u001B[33m";
    //    public static final String ANSI_BLUE = "\u001B[34m";
    //    public static final String ANSI_PURPLE = "\u001B[35m";
    //    public static final String ANSI_CYAN = "\u001B[36m";
    //    public static final String ANSI_WHITE = "\u001B[37m";


}
