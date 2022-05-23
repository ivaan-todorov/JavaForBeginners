package homework;

public class HW_6 {

    //1
    public static void firsTask() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }

    //2
    public static void secondTask() {
        for (int i = 9; i > -1; --i) {
            System.out.println(i);
        }
    }

    //3
    public static void thirdTask() {
        for (int i = 50; i < 56; i += 2) {
            System.out.println(i);
        }
    }

    //4
    public static void fourthTask() {
        for (int i = 300; i < 328; i++) {
            if (i % 7 == 0) {
                System.out.println(i);
            }
        }
    }

    //5
    public static void fifthTask() {
        for (double i = 12; i <= 13; i += 0.1) {
            System.out.println(i);
        }
    }

    //6
    public static void sixthTask() {
        for (int i = 216; i < 238; i += 2) {
            System.out.println(i);
        }
    }

    //7
    public static void seventhTask() {
        for (int i = 8; i < 14; i++) {
            if (i % 7 == 0) {
                System.out.println(i);
            }
        }
    }

    //8
    public static void eighthTask() {
        for (int i = Short.MIN_VALUE; i < Short.MAX_VALUE; i++) {
            if (i % 15001 == 0) {
                System.out.println(i);
            }
        }
    }

    //9
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_BLUE = "\u001B[34m";

    public static void ninthTask() {
        for (int i = -10; i < 35; i++) {
            if (i % 11 == 0 && i != 0) {
                System.out.println(ANSI_RED + i);
            } else if (i % 12 == 0 && i != 0) {
                System.out.println(ANSI_BLUE + i);
            } else if (i == 0) {
                System.out.println("\u001B[37m" + "ZERO");
            } else {
                System.out.println("\u001B[37m" + i);
            }
        }
    }

    //10
    public static void tenthTask(int start, int end, int step) {
        for(; start < end; start += step) {
            System.out.println(start);
        }
    }

    //11
    public static void eleventhTask(int l) {
        if (l > 0) {
            for (int i = 0; i < l; i += 2) {
                System.out.println(i);
            }
        } else {
            for (int i = 0; i > l; i -= 2) {
                System.out.println(i);
            }
        }
    }


    //12
    public static void twelfthTask(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println((int) Math.pow(2, i));
        }
    }

    //13 ????
//    public static void thirteenthTask() {
//        for (int i = 0; i < 10; i++) {
//            System.out.print(i);
//        }
//        for (int i = 0; i < 100; i += 11) {
//            if (i != 0) {
//                System.out.print(i);
//            } else {
//                System.out.print(i + "0");
//            }
//        }
//        for (int i = 0; i < 1000; i += 111) {
//            if (i != 0) {
//                System.out.print(i);
//            } else {
//                System.out.print(i + "00");
//            }
//        }
//        for (int i = 0; i < 10000; i += 1111) {
//            if (i != 0) {
//                System.out.print(i);
//            } else {
//                System.out.print(i + "000");
//            }
//        }
//    }

    public static void thirteenTask() {
        String result1 = "", result2 = "", result3 = "", result4 = "";
        for (int i = 0; i < 10; i++) {
            result1 += "" + i;
            result2 += "" + i + i;
            result3 += "" + i + i + i;
            result4 += "" + i + i + i + i;
        }
        String result = result1 + result2 + result3 + result4;

        System.out.println(result);
    }

    //14
    public static void fourteenthTask() {
        for (int i = 0; i < 6; i++) {
            System.out.print(i + ", ");
            if (i > 0 && i != 5) {
                System.out.print(i * -1 + ", ");
            } else if (i == 5) {
                System.out.print(i * -1);
            }
        }
    }

    //15
    //0, 3, 5, 6, 9, 10, 12, 15, 18, 20, 21, 24, 25
    public static void fifteenthTask() {
        for (int i = 0; i < 26; i++) {
            if (i % 3 == 0 || i % 5 == 0 && i != 25) {
                System.out.print(i + ", ");
            } else if (i == 25) {
                System.out.println(i);
            }
        }
    }

    //16
    public static void sixteenthTask(int n, int m, int l) {
        if (m < 0 && l > m) {
            System.out.println("нужно либо m больше, либо l меньше");
        } else if (n < l) {
            for (; n < l; n += m) {
                if (n % 2 == 0) {
                    System.out.println(n);
                }
            }
        } else {
            System.out.println("l должна быть больше");
        }
    }

    //17 ???
    public static void seventeenthTask(int n, int l) {
        for (int i = n + 1; i < l; i++) {
            System.out.println(n + 2);
            n++;
        }
    }

    //18
    public static void eighteenthTask(int l, int n) {
        for (; n < l; n++) {
            int result = n + 1;
            result = n * 2;
            System.out.println(result);

        }
    }

    //19
    public static void nineteenthTask() {
        for (int i = 10; i < 100; i++) {
            if ((i / 10) - (i % 10) < 4 && (i % 10) - (i / 10) < 4) {
                System.out.println(i);
            }
        }
    }

    //20 ???
    public static void twentiethTask(double x) {
        double y;
        if (x > 1.5) {
            y = 2.5 * (x*x*x) + 6 * (x*x) - 30;
        } else if (0 <= x && x <= 1.5) {
            y = x + 1;
        } else {
            y = x;
        }
        System.out.println(y);
    }


    public static void main(String[] args) {

        thirteenTask();
    }


}
