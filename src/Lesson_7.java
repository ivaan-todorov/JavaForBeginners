public class Lesson_7 {

    public static void main(String[] args) {
        String[] catsName = new String[]{"Рыжик", null, null, "Рыжик"};

        for (int i = 0; i < 4; i++) {
            if (catsName[i] == "Рыжик") {
                System.out.println(catsName[i]);
            }
        }
    }


}
