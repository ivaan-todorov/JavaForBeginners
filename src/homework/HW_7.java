package homework;

public class HW_7 {

    public static void task(int number) {
        System.out.println("\t\t\tTask " + number);
        System.out.println("_______________________________________");
    }

    public static void soutArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }



    //21
    public static void midMinMax(int[] arr) {
        double mid = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
            mid += arr[i];
        }
        mid = mid / arr.length;
        System.out.println("mid = " + mid);
        System.out.println("min = " + min);
        System.out.println("max = " + max);
    }

    //18
    public static int arr18(int[] arr) {
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            result += arr[i];
        }

        return result / arr.length;
    }

    public static void main(String[] args) {

        //1
        task(1);
        String[] catsNames = new String[] {"Соня", "Клеопатра", "Цунами", "Забияка", "Матильда", "Масяня", "Царапка"};

        //2
        task(2);
        catsNames[1] = "Черныш";
        catsNames[4] = "Рыжик";

        //3
        task(3);
        String[] catsColors = new String[] {"Черный", "Рыжий", "Белый", "Розовый", "Серый", "Фиолетовый", "Серый"};

        //4
        task(4);
        int[] catsAges = new int[] {1, 2, 2, 5, 4, 3, 7};

        //5
        task(5);
        boolean[] isCatRed = new boolean[] {false, true, false, false, true, false, false};

        //6
        /*
        имя кота в коробке с номером 6
        имена котов из коробок с четными индексами
        имена котов из коробок, чьи индексы кратны 4
        цвет котов из коробок с нечетными индексами
        цвет котов из коробок, чьи индексы кратны 3
        */
        task(6);

        System.out.println(catsNames[6]);

        for (int i = 0; i < catsNames.length; i += 2) {
            System.out.print(catsNames[i] + ", ");

            if (i % 4 == 0) {
                System.out.println("\n" + catsNames[i] + " ");
            }
        }

        for (int i = 1; i < catsNames.length; i += 2) {
            System.out.print(catsNames[i] + ", ");
        }

        for (int i = 0; i < catsColors.length; i += 3) {
            System.out.println(catsColors[i]);
        }

        //7
        //Распечатать “Накорми кота!” для всех серых котов
        task(7);
        for (int i = 0; i < catsColors.length; i++) {
            if (catsColors[i].equals("Серый")) {
                System.out.println("Накорми " + i + 1 + " кота!");
            }
        }

        //8
        task(8);
        for (int i = 0; i < catsAges.length; i++) {
            if (catsAges[i] == 2) {
                System.out.println("Отнеси кота на прививку!");
            }
        }


        //9
        task(9);
        System.out.println("Имя - " + catsNames[6]);
        System.out.println("Возраст  - " + catsAges[6]);
        System.out.println("Цвет - " + catsColors[6]);


        //10
        task(10);
        for (int i = 0; i < catsNames.length; i++) {
            if (catsAges[i] > 2) {
                System.out.println(catsNames[i]);
            }
        }


        //11
        task(11);
        for (int i = 0; i < isCatRed.length; i++) {
            if (isCatRed[i] && catsNames[i].equals("Рыжик")) {
                System.out.println("Накорми кота!");
            }
        }


        //12
        //Распечатать средний возраст котов из массива catsAges
        task(12);
        int mid = 0;
        for (int i = 0; i < catsAges.length; i++) {
            mid += catsAges[i];
        }
        System.out.println(mid / catsAges.length);


        //13
        //Распечатать возраст самого молодого кота
        task(13);
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < catsAges.length; i++) {
            if (min > catsAges[i]) {
                min = catsAges[i];
            }
        }
        System.out.println(min);

        //14
        //Распечатать возраст самого старого кота
        task(14);
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < catsAges.length; i++) {
            if (max > catsAges[i]) {
                max = catsAges[i];
            }
        }
        System.out.println(max);


        //15
        //Распечатать количество серых котов
        task(15);

        int countGrey = 0;
        for (int i = 0; i < catsColors.length; i++) {
            if (catsColors[i].equals("Серый")) {
                countGrey++;
            }
        }
        System.out.println(countGrey);


        //16
        //Распечатать имя кота, если кот находится в коробке
        // с четным индексом и его возраст не больше 3 лет
        task(16);

        for (int i = 0; i < catsNames.length; i++) {
            if (i % 2 == 0 && catsAges[i] < 4) {
                System.out.println(catsNames[i]);
            }
        }


        //17
        //Создать массив четных положительных чисел, значения которых
        //не больше 10. (заполняем значения с помощью цикла for)
        task(17);

        int[] arr17 = new int[5];

        for (int i = 0, k = 0; i < 10; i += 2, k++) {
            arr17[k] = i;
        }


        //18
        //Написать метод, который принимает на вход массив int, и возвращает среднее значение.
        // Проверить работу метода тестом, если параметр - массив catsAges
        task(18);

        int[] arrTest = {2, 13, 3, 10, 2};
        System.out.println(arr18(arrTest));


        //19
        //Создать массив нечетных отрицательных чисел в промежутке от -1000 до -900
        task(19);

        int[] arr19 = new int[50];
        for (int i = -999, k = 0; i < -900; i += 2, k++) {
            arr19[k] = i;
        }

        //20
        //Создать массив из 10 случайных положительных целых чисел
        task(20);

        int[] arrRandom = new int[10];

        for (int i = 0; i < arrRandom.length; i++) {
            int random = (int) (Math.random() * Integer.MAX_VALUE) + 1;
            arrRandom[i] = random;
        }


        //21
        //Создать метод, который принимает на вход массив int,  и
        // возвращает минимальное значение,
        // максимальное значение и среднее значение всех чисел массива.
        // Проверить работу метода на массиве из задания 20.
        task(21);

        midMinMax(arrRandom);

        //22
        //Создать массив четных чисел и массив нечетных
        //чисел из элементов массива из задания 20
        task(22);

        int countEven = 0;
        int countOdd = 0;
        for (int i = 0; i < arrRandom.length; i++) {
            if (arrRandom[i] % 2 == 0) {
                countEven++;
            } else {
                countOdd++;
            }
        }
        int[] arrEven = new int[countEven];
        int[] arrOdd = new int[countOdd];
        for (int i = 0 , k = 0, l = 0; i < arrRandom.length; i++) {
            if (arrRandom[i] % 2 == 0) {
                arrEven[k] = arrRandom[i];
                k++;
            } else {
                arrOdd[l] = arrRandom[i];
                l++;
            }
        }
        soutArr(arrEven);
        System.out.println("__________________");
        soutArr(arrOdd);


        //23
        task(23);

        String[][] cats2D = {{"Мурзик", "Черныш", "Мурка", "Васька", "Рыжик", "Дымка", "Патрик", "Зорро"},
                {"2", "3", "4", "1", "5", "6", "9", "10"}, {"Grey", "Black", "Grey", "Brown", "Red", "Grey",
                "Red", "Grey"}};

        for (int i = 0; i < 8; i += 2) {
            System.out.println(cats2D[0][i] + " - " + cats2D[1][i] + " years, " + cats2D[2][i] + " colour");
        }

        //24
        //Создать двумерный массив целых случайных чисел от 1 до 10 размерности 4*8.
        task(24);

        int[][] arrRandom2D = new int[4][8];

        for (int i = 0; i < arrRandom2D.length; i++) {
            for (int j = 0; j < arrRandom2D[i].length; j++) {
                int random = (int) (Math.random() * 10) + 1;
                arrRandom2D[i][j] = random;
            }
        }


        //25
        //Вывести сумму всех четных чисел массива из задания 24.
        task(25);

        for (int i = 0; i < arrRandom2D.length; i++) {
            for (int j = 0; j < arrRandom2D[i].length; j++) {
                if (arrRandom2D[i][j] % 2 == 0) {
                    System.out.println(arrRandom2D[i][j]);
                }
            }
        }



    }
}
