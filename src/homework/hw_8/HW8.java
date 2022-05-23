package homework.hw_8;

import homework.Utils;

import java.util.*;

public class HW8 {

    static Integer xInt = 0;
    static Double d = 1.0;
    static String str1 = "Hello Ivan!";

    //7
    static int[] arrInt(int number1, int number2, int number3, int number4, int number5) {
        Utils.task(7);
        int[] result = new int[] {number1, number2, number3, number4, number5};

        return result;
    }

    //8
    static double[] arrDouble(double number1, double number2, double number3, double number4, double number5) {
        Utils.task(8);
        double[] result = new double[] {number1, number2, number3, number4, number5};

        return result;
    }


    //9
    static String[] arrString(String str1, String str2, String str3, String str4, String str5) {
        Utils.task(9);
        String[] result = new String[] {str1, str2, str3, str4, str5};

        return result;
    }

    //10
    static double[] arrMultiplyInt(int[] arrInt) {
        Utils.task(10);
        double[] result = new double[arrInt.length];
        for (int i = 0; i < arrInt.length; i++) {
            result[i] = arrInt[i] * 2.5;
        }

        return result;
    }

    //11
    static int countOfEvenInt(int[] arrInt) {
        Utils.task(11);
        int result = 0;
        for (int i = 0; i < arrInt.length; i++) {
            if (arrInt[i] % 2 == 0 && arrInt[i] != 0) {
                result++;
            }
        }

        return result;
    }

    //12
    static int[] arrOfOddInt(int[] arrInt) {
        Utils.task(12);
        int count = 0;
        for (int i = 0; i < arrInt.length; i++) {
            if (arrInt[i] % 2 != 0) {
                count++;
            }
        }

        int[] result = new int[count];
        for (int i = 0, k = 0; i < arrInt.length; i++) {
            if (arrInt[i] % 2 != 0) {
                result[k] = arrInt[i];
                k++;
            }
        }

        return result;
    }

    //13
    static boolean[] arrBoolBigger10(int[] arrInt) {
        Utils.task(13);
        boolean[] result = new boolean[arrInt.length];
        for (int i = 0; i < arrInt.length; i++) {
            if (arrInt[i] > 10) {
                result[i] = true;
            } else {
                result[i] = false;
            }
        }

        return result;
    }

    //14
    static String makerStr(String[] arrStr) {
        Utils.task(14);
        String result = "";
        for (int i = 0; i < arrStr.length; i++) {
            result += arrStr + " ";
        }

        return result;
    }

    //15
    static int sumOf2HalfArr(int[] arrInt) {
        Utils.task(15);
        int result = 0;
        for (int i = arrInt.length / 2; i < arrInt.length; i++) {
            result += arrInt[i];
        }

        return result;
    }

    //16
    static int[] arrMultiplicationTable(int x) {
        Utils.task(16);
        int[] result = new int[11];
        if (x > 9 || x < 1) {
            System.out.println("Введите число от 1 до 10 исключительно");
            return result;
        }
        for (int i = 0; i < 11; i++) {
            result[i] = x * i;
        }

        return result;
    }

    //17
    static int[] arrOddOrEven(int[] arrInt) {
        Utils.task(17);
        int count = 0;
        int odd = 0;
        int even = 0;

        for (int i = 0; i < arrInt.length; i++) {
            if (arrInt[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        if (odd > even) {
            count = odd;
        } else {
            count = even;
        }
        int[] result = new int[count];

        if (odd > even) {
            for (int i = 0; i < result.length; i++) {
                if (arrInt[i] % 2 != 0) {
                    result[i] = arrInt[i];
                }
            }
        } else if (odd < even){
            for (int i = 0; i < result.length; i++) {
                if (arrInt[i] % 2 == 0) {
                    result[i] = arrInt[i];
                }
            }
        } else {
            System.out.println("Одинаковое количество чётных и нечётных");
            return null;
        }

        return result;
    }

    //18
    static int[] arrRandom(int length) {
        Utils.task(18);
        int[] result = new int[length];
        for (int i = 0; i < length; i++) {
            result[i] = (int)(Math.random() * 99) + 1;
        }

        return result;
    }

    //19
    static String[] arrByLengthRandom(int l, int d) {
        Utils.task(19);
        String[] result = new String[l];
        String random = "";
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < d; j++) {
                random += (int)(Math.random() * 9) + 1;
            }
            result[i] = random;
            random = "";
        }

        return result;
    }

    //20
    static int[] arrTwoDigitNumbers(int[] arrInt) {
        Utils.task(20);

        int count = 0;
        for (int i = 0; i < arrInt.length; i++) {
            if (arrInt[i] / 10 < 10 && arrInt[i] / 10 >= 0) {
                count++;
            }
        }
        int[] result = new int[count];
        for (int i = 0, k = 0; i < arrInt.length; i++) {
            if (arrInt[i] / 10 < 10 && arrInt[i] / 10 >= 0) {
                result[k] = arrInt[i];
                k++;
            }
        }

        return result;
    }

    //21
    static int[] arrNumberDifference(int[] arrInt) {
        int[] result = new int[arrInt.length];
        for (int i = 0; i < arrInt.length; i++) {
            result[i] = ((int)(arrInt[i] / 10)) - (arrInt[i] % 10);
        }

        return result;
    }

    //22
    static String[] phoneNumber(int[] arr) {
        String[] result = new String[2];
        String phone = arr[0]+"("+arr[1]+arr[2]+arr[3]+")"+arr[4]+arr[5]+arr[6]+"-"+arr[7]+arr[8]+"-"+arr[9]+arr[10];
        result[0] = phone;
        if (arr[0] == 1) {
            result[1] = "USA";
        } else if (arr[0] == 7) {
            result[1] = "russia";
        } else if (arr[0] == 3 && arr[1] == 8 && arr[2] == 0) {
            result[1] = "Ukraine";
        } else {
            result[1] = "unknown";
        }

        return result;
    }



    //return Arrays.stream(arr).distinct().toArray();

    //23
    static int[] arrUniq(int[] arr) {

        int end = arr.length;

        //Arrays.sort(arr);
        for (int i = 0; i < end; i++) {
            for (int j = i + 1; j < end; j++) {
                if (arr[i] == arr[j]) {
                    int shiftLeft = j;
                    for (int k = j + 1; k < end; k++, shiftLeft++) {
                        arr[shiftLeft] = arr[k];
                    }
                    j--;
                    end--;
                }
            }
        }

        int[] result = new int[end];
        for (int i = 0; i < result.length; i++) {
            result[i] = arr[i];
        }

        return result;
    }


    //24
    static String countOfUniqAndNotUniqNumbersInArr(int[] arr) {
        int uniq = 0;
        int notUniq = 0;
        String result = null;

        for (int i = 0; i < arr.length; i++) {
            for (int j = arr.length - 1; j > i; j--) {
                if (arr[i] == arr[j]) {
                    notUniq++;
                }
            }
        }
        uniq = arr.length - notUniq;
        result = "Неуникальных чисел: " + notUniq + ", уникальных: " + uniq;

        return result;
    }

    //25
    static int[] arrFromIndexToIndex(int[] arr, int firstIndex, int secondIndex) {
        int[] result = new int[secondIndex - firstIndex + 1];
        for (int i = firstIndex, k = 0; i <= secondIndex; i++, k++) {
            result[k] = arr[i];
        }

        return result;
    }

    //26
    static int[] twoArraysToOneUniq(int[] arr1, int[] arr2) {
        arr1 = arrUniq(arr1);
        arr2 = arrUniq(arr2);
        int[] result = new int[arr1.length + arr2.length];

        for (int i = 0; i < arr1.length; i++) {
            result[i] = arr1[i];
        }
        for (int i = arr1.length, k = 0; i < result.length; i++, k++) {
            result[i] = arr2[k];
        }

        return arrUniq(result);
    }


    public static void main(String[] args) {

        //6
        Utils.task(6);

        System.out.println("HW8                 " + "|HW8_1               " + "|areEquals?");
        Utils.line();
        System.out.println("Integer xInt = 0    " + "|Integer xInt_1 = 0  " + "|" + HW8_1.xInt_1.equals(xInt));
        Utils.line();
        System.out.println("Double d = 1.0      " + "Double d_1 = 1.0     " + "|" + HW8_1.d_1.equals(d));
        Utils.line();
        System.out.println("str1 = Hello Ivan!  " + "str1_1 = Hello Ivan! " + "|" + HW8_1.str1_1.equals(str1));
        Utils.line();


        int[] arr1 = {1, 2, 3, 1, 3, 2, 55};
        int[] arr2 = {4, 5, 6, 5, 1, 2};

        int[] arr = twoArraysToOneUniq(arr1, arr2);


        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }



    }

}
