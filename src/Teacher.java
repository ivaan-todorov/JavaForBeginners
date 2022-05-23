public class Teacher {

    public static void main(String[] args) {

        String design = "=================================================";

        String firstName = "Мария Ивановна";
        String lastName = "Смирнова";
        int age = 35;
        String subject = "русский";

        System.out.println(design + "\n" + firstName + "\n" + lastName + "\n" + "Возраст: " + age + "\n" + "Предмет: " + subject + "\n" + design);

        String firstName2 = "Иван Петрович";
        String lastName2 = "Серебряков";
        int age2 = 55;
        String subject2 = "математика";

        System.out.println(design + "\n" + firstName2 + "\n" + lastName2 + "\n" + "Возраст: " + age2 + "\n" + "Предмет: " + subject2 + "\n" + design);


        int yob = 1990;
        System.out.println("Если человек родился в " + yob + " году, то его возраст - разница между 2020 и " + yob);


    }
}
