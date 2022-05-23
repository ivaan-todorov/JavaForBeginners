package homework;

import java.util.Locale;

public class HW10 {

    public static void printArr(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void line() {
        System.out.println("__________________________________________");
    }

    //1
    /*
         Написать метод, который принимает на вход строку.
    Если строка не пустая (проверить методом из видео), то примените метод по удалению
    пробелов в начале строки и в конце строки.
    Догадаться, каким методом из видео можно проверить, были ли пробелы.
    Если пробелы были, то метод должен вернуть сообщение: “Лишние пробелы удалены”.
    Если пробелов не было, вернуть сообщение “Пробелов не было”.
    Если строка пустая, вернуть сообщение “Строка пустая”.

    Test Data:
    “    QA4Everyone   “ → “Лишние пробелы удалены”
    “QA4Everyone“ → “Пробелов не было”
    “” → “Строка пустая”
     */
    public static String firstTask(String str) {
        if (!str.isEmpty()) {
            String strNoSpace = str.trim();
            if (str.length() == strNoSpace.length()) {

                return "Пробелов не было";
            } else {

                return "Лишние пробелы удалены";
            }
        } else {

            return "Строка пустая";
        }
    }

    //2
    /*
        Написать алгоритм RemoveAlla.
    С помощью методов из видео1,  написать алгоритм, который принимает на вход строку.
    строка валидная, то метод удаляет все буквы a из строки, если таковые имеются. Метод возвращает обработанную строку.
    Test Data:
     “    QA4Everyone   “ →  “QA4Everyone“
    “panda   “ → “pnd”
     */
    public static String removeAlla(String str) {
        if (!str.isEmpty()) {
            str = str.trim();
            str = str.replace("a","");

            return str;
        } else {

            return str;
        }
    }


    //3
    /*
        Написать алгоритм RemoveAllZeros.
    С помощью методов из видео1,  написать алгоритм, который принимает на вход строку,
    состоящую из цифр. Если строка валидная, то метод удаляет все пробелы из строки, если таковые имеются.
    Метод возвращает обработанную строку, в которой нет нулей.
    Test Data:
     “   3 5 0 4 2 0 9 7 0 6 0 4 0       0 0 0 “ →  “35429764“
    “ 0000000111“ → “111”
     */
    public static String removeAllZeros(String str) {
        if (str.length() > 0) {
            str = str.replace(" ", "");
            str = str.replace("0","");

            return str;
        } else {

            return str;
        }
    }

    //4
    /*
        Написать алгоритм RemoveAllSpaces.
    С помощью методов из видео1,  написать алгоритм, который принимает на вход строку.
    Если строка валидная, то метод удаляет все пробелы из строки, если таковые имеются.
    Метод возвращает обработанную строку.
     */
    public static String removeAllSpaces(String str) {
        if (str.length() > 0) {
            str = str.replace(" ","");

            return str;
        } else {

            return str;
        }
    }


    //5
    /*
    Напишите метод, который принимает на вход строку и
    считает, сколько букв а или А содержится в строке.
     */
    public static int fifthTask(String str) {;
        int result = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.toLowerCase().charAt(i) == 'a') {
                result++;
            }
        }

        return result;
    }

    //6
    /*
    Напишите метод, который принимает на вход текст и проверяет,
    содержится ли в тексте хотя бы одно слово Java.
     */
    public static boolean containJava(String str) {

        return str.contains("Java");
    }

    //7
    /*
    Напишите метод, который принимает на вход строку, и добавляет Кавычки в начале строки,
    точку и кавычки в конце строки с помощью метода concat()
     */
    public static String addQuotes(String str) {
        str = str.trim();
        String quotes = "\"";
        str = quotes.concat(str.concat(quotes));
        return str;
    }

    //8
    /*
    Напишите метод, кторый принимает на вход название города и исправляет написание:
     */
    public static String rightCityName(String str) {
        str = str.trim().toLowerCase();
        String bigLetter = str.substring(0,1).toUpperCase();
        String firstLetStr = str.substring(1);
        str = bigLetter.concat(firstLetStr);

        return str;
    }


    //9
    /*
    Напишите метод, который принимает на вход строку и букву-параметр, и возвращает все,
    что находится между первой и последней буквой-параметром:
    */
    public static String ninthTask(String str, String letter) {

        return str.substring(str.indexOf(letter), str.lastIndexOf(letter) + 1);
    }


    //10
    /*
    Напишите метод, который принимает на вход слово, и возвращает true, если слово
    начинается и заканчивается на одинаковую букву, и false иначе
     */
    public static boolean startAndEndLetter(String str) {
        str = str.toLowerCase();

        return str.charAt(0) == str.charAt(str.length() - 1);
    }


    //11
    /*
    Напишите метод, который принимает на вход предложение и
    возвращает слова из этого предложения в виде массива слов
     */
    public static String[] eleventhTask(String str) {

        return str.split(" ");
    }


    //12
    //Написать метод, который принимает на вход предложение,
    // которое состоит из имени,
    // фамилии, отчества и возвращает массив строк:
    public static String[] fullNameToArr(String str) {
        String[] result = str.split(" ");
        result[0] = "Имя: " + result[0];
        result[1] = "Отчество: " + result[1];
        result[2] = "Фамилия: " + result[2];

        return result;
    }


    //13
    /*
    Написать метод, который возвращает сумму всех букв слова
     */
    public static String sumOfLetters(String str) {
        char[] charArr = str.toCharArray();
        int sum = 0;
        for (int i = 0; i < charArr.length; i++) {
            if (charArr[i] >= 'A' && charArr[i] <= 'Z' || charArr[i] >= 'a' && charArr[i] <= 'z') {
                sum += charArr[i];
            } else {

                return "0 (это не буквы)";
            }
        }

        return Integer.toString(sum);
    }


    //14
    /*
    Написать метод,  который принимает на вход 2 буквы и возвращает true,
    если первая буква встречается раньше второй, иначе метод возвращает false
     */
    public static boolean biggerChar(String firsLetter, String secondLetter) {
        char firsChar = firsLetter.charAt(0);
        char secondChar = secondLetter.charAt(0);
        if (firsChar < secondChar) {

            return true;
        } else {

            return false;
        }

    }



    public static void main(String[] args) {

        //1
        String test1 = "    QA4Everyone   ";
        String test2 = "QA4Everyone";
        String test3 = "";
        System.out.println(firstTask(test1));
        System.out.println(firstTask(test2));
        System.out.println(firstTask(test3));

        line();

        //2
        test1 = "    QA4Everyone   ";
        test2 = "panda   ";
        System.out.println(removeAlla(test1));
        System.out.println(removeAlla(test2));


        line();

        //3
        test1 = "   3 5 0 4 2 0 9 7 0 6 0 4 0       0 0 0 ";
        test2 = " 0000000111";
        System.out.println(removeAllZeros(test1));
        System.out.println(removeAllZeros(test2));

        line();

        //4
        //Test Data:
        // “    QA   4  Everyone   “ →  “QA4Everyone“
        //“p a     n d a   “ → “panda”
        test1 = "    QA   4  Everyone   ";
        test2 = "p a     n d a   ";
        System.out.println(removeAllSpaces(test1));
        System.out.println(removeAllSpaces(test2));


        line();

        //5
        //Test Data:
        //“Abracadabra” → 5
        //“Homenum Revelio” → 0
        test1 = "Abracadabra";
        test2 = "Homenum Revelio";
        System.out.println(fifthTask(test1));
        System.out.println(fifthTask(test2));


        line();

        //6
        test1 = "As of March 2022, Java 18 is the latest version, while Java 17, 11 and 8 are the current long-term support (LTS) versions. Oracle released the last zero-cost public update for the legacy version Java 8 LTS in January 2019 for commercial use, although it will otherwise still support Java 8 with public updates for personal use indefinitely. Other vendors have begun to offer zero-cost builds of OpenJDK 8 and 11 that are still receiving security and other upgrades";
        test2 = "As a decrepit father takes delight\n" +
                "To see his active child do deeds of youth,\n" +
                "So I, made lame by fortune’s dearest spite,\n" +
                "Take all my comfort of thy worth and truth.\n" +
                "For whether beauty, birth, or wealth, or wit,\n" +
                "Or any of these all, or all, or more,\n" +
                "Entitled in thy parts do crownèd sit,\n" +
                "I make my love engrafted to this store.\n" +
                "So then I am not lame, poor, nor despised,\n" +
                "Whilst that this shadow doth such substance give\n" +
                "That I in thy abundance am sufficed,\n" +
                "And by a part of all thy glory live.\n" +
                "Look what is best, that best I wish in thee.\n" +
                "This wish I have; then ten times happy me.";
        System.out.println(containJava(test1));
        System.out.println(containJava(test2));

        line();

        //7
        //Test Data:
        //“One” → ““One.””
        //“    TWO  “ → ““TWO.””
        test1 = "One";
        test2 = "    TWO  ";
        System.out.println(addQuotes(test1));
        System.out.println(addQuotes(test2));


        line();


        //8
        //Test Data:
        //“ташкент” → “Ташкент”
        //“ЧикаГО” → “Чикаго”
        test1 = "ташкент";
        test2 = "ЧикаГО";
        System.out.println(rightCityName(test1));
        System.out.println(rightCityName(test2));


        line();

        //9
        /*
        Напишите метод, который принимает на вход строку и букву-параметр, и возвращает все,
        что находится между первой и последней буквой-параметром:
         */
        //Test Data:
        //“Abracadabra”, “b” → “bracadab”
        //“Whippersnapper”, “p” → “ppersnapp”
        test1 = "Abracadabra";
        test2 = "Whippersnapper";
        String letter1 = "b";
        String letter2 = "p";
        System.out.println(ninthTask(test1,letter1));
        System.out.println(ninthTask(test2,letter2));


        line();

        //10
        //Test Data:
        //	“Abracadabra” → true
        //	“Whippersnapper” → false
        test1 = "Abracadabra";
        test2 = "Whippersnapper";
        System.out.println(startAndEndLetter(test1));
        System.out.println(startAndEndLetter(test2));


        line();


        //11
        //Test Data:
        //“QA for Everyone” → {“QA”, “for”, “Everyone”}
        //“Александр Сергеевич Пушкин” → {“Александр”, “Сергеевич”, “Пушкин”}
        test1 = "QA for Everyone";
        test2 = "Александр Сергеевич Пушкин";

        String[] strArr1 = eleventhTask(test1);
        String[] strArr2 = eleventhTask(test2);
        printArr(strArr1);
        printArr(strArr2);


        line();


        //12
        //Test Data:
        //“Александр Сергеевич Пушкин” →
        //{“Имя: Александр”, “Отчество: Сергеевич”, “Фамилия: Пушкин”}
        test1 = "Александр Сергеевич Пушкин";
        printArr(fullNameToArr(test1));


        line();


        //13
        //“abc” → 294
        //“ABC” → 198
        //“123” → 0 (это не буквы)
        test1 = "abc";
        test2 = "ABC";
        test3 = "123";
        System.out.println(sumOfLetters(test1));
        System.out.println(sumOfLetters(test2));
        System.out.println(sumOfLetters(test3));


        //14
        //method(“a”, “m”) → true
        //method(“m”, “l”) → false
        System.out.println(biggerChar("a", "m"));
        System.out.println(biggerChar("m", "l"));



    }

}
