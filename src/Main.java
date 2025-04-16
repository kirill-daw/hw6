public class Main {
    public static void main(String[] args) {

        System.out.println("Task 1: ");
        for (byte i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        System.out.println("Task 2: ");
        for (byte i = 10; i >= 1; i--) {
            System.out.println(i);
        }

        System.out.println("Task 3: ");
        for (byte i = 0; i < 17; i += 2) {
            System.out.println(i);
        }

        System.out.println("Task 4: ");
        for (byte i = 10; i >= -10; i--) {
            System.out.println(i);
        }

        System.out.println("Task 5: ");
        for (short i = 1904; i <= 2096; i += 4) {
            System.out.println(i + " год является високосным.");
        }

        System.out.println("Task 6: ");
        for (byte i = 7; i < 100; i += 7) {
            System.out.println(i);
        }

        System.out.println("Task 7: ");
        for (short i = 1; i <= 512; i *= 2) {
            System.out.println(i);
        }

        System.out.println("Task 8: ");
        int capital = 0;
        int income = 29000;
        for (byte i = 1; i <= 12; i++) {
            capital += income;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + capital + " рублей.");
        }

        System.out.println("Task 9: ");
        float capital1 = 0f;
        for (byte i = 1; i <= 12; i++) {
            capital1 += (capital1 * 0.12) / 12;
            capital1 += income;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + capital1 + " рублей.");
        }

        System.out.println("Task 10: ");
        byte number = 2;
        for (byte i = 1; i <= 10; i += 1) {
            int result = number * i;
            System.out.println(number + "*" + i + "=" + result);
        }
    }
}