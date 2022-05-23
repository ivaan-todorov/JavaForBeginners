package homework;

public class HW2 {

    public static void main(String[] args) {

        int k = 10;
        int l = 5;
        int m = 187;

        System.out.println(l^2);

        System.out.println(k + "\n" + l + "\n" + m);
        System.out.println(k + " " + l + " " + m);
        System.out.println(k + ", " + l + ", " + m);
        System.out.println("k = " + k + "; l = " + l + "; m = " + m);
        System.out.println("Sum of k and l = " + (k + l) + "; k * m = " + (k * m)
                + "; \nРазность переменных l и m = " + (l - m));
        System.out.println("Результат деления k на l = " + k / l + ", а остаток от деления = " + k % l);
        System.out.println("Результат деления k на m = " + k / m + ", а остаток от деления = " + k % m);
        System.out.println("Результат деления l на m = " + l / m + ", а остаток от деления = " + l % m);
        System.out.println("Результат деления m на k = " + m / k + ", а остаток от деления = " + m % k);


        int apple = 40;
        int student = 6;

        System.out.println("Если " + apple + " яблок поделить \nна " + student
                + " учеников, то каждый ученик получит по " + apple / student + " яблок(a), \nи "
                + apple % student + " яблок(а) останется учителю.");

        System.out.println("Если " + 100 + " яблок поделить \nна " + 21
                + " учеников, то каждый ученик получит по " + (100 / 21) + " яблок(a), \nи "
                + (100 % 21) + " яблок(а) останется учителю.");



        System.out.println("sumKLM++ = " + (k + l + m++));
        System.out.println("sumKLM-- = " + (k + l + m--));
        System.out.println("Разность m++ и sumLKM = " + (m++ - (k + l + m)));

        System.out.println("Число 48 - кратное 8, 48 % 8 = " + (48 % 8));
        System.out.println("А числа 47 и 49 - нечетные, = " + 1 + " остаток");


        double x = 2;
        double y = 3;
        int a = k;
        int b = l;
        int c = m;
        double d = y - x;

        double root22 = (x * 2.0) * (x * 2);
        double root23 = (3 + 4 * x / 5.0) - ((10.0 * (y - 5) * (a + b + c)) / x)
                + 9 * (4.0 / x + (9.0 + x) / y);
        double root24 = ((5 * x + 7 * y) / (8 * x + 10 * y)) / ((3 * x - y)/(x + y));
        String line = "__________________________________________";
        String palka = "|";

        System.out.println(line);
        System.out.println(palka + "task              " + palka + "result              " + palka);
        System.out.println(line);
        System.out.println(palka + 22 + "                " + palka + root22 + "                " + palka);
        System.out.println(line);
        System.out.println(palka + 23 + "                " + palka + root23 + "              " + palka);
        System.out.println(line);
        System.out.println(palka + 24 + "                " + palka + root24 + "  " + palka);
        System.out.println(line);

        double root25 = ((5 * x + 7 * y) / (8 * x + 10 * y) / (3 * x - y) / (x + y))
                / (a + b + c / d + (a + b) / (c + d) + a * b);

        System.out.println("25 = " + root25);


    }
}
