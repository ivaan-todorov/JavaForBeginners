public class Lesson_5 {

    public static int min(int a, int b, int c) {
        int min = Integer.MAX_VALUE;
        int[] number = {a, b, c};
        for (int i = 0; i < 3; i++) {
            if (min > number[i]) {
                min = number[i];
            }
        }

        return min;
    }

    public static int mid(int a, int b, int c) {

        return (a + b + c) / 3;
    }

    public static double difference(int a, int b, int c) {

        return (mid(a, b , c) - min(a, b, c)) * 1.0;
    }

    public static void massage(int a, int b, int c) {
        if (difference(a, b ,c) > 3.51) {
            System.out.println("Большой разброс чисел");
        } else {
            System.out.println("Маленький разброс");
        }
    }

    public static void main(String[] args) {

        int a = 5, b = 2, c = 10;


//        System.out.println(difference(a, b, c));
//        System.out.println(min(a, b, c));

        massage(a, b, c);


    }
}
