package su2ar;

import java.util.Scanner;

public class App {

    public static int days;    

    public static void main(String[] args) throws Exception {
        Day day = new Day();
        Jack jack = new Jack();
        Meals meals = new Meals();
        Recreation recreation = new Recreation();

        Scanner scanner = new Scanner(System.in);

        System.out.println("What number of days it lasts?");
        days = scanner.nextInt();

        System.out.println("How's jack this morning?");
        Thread.sleep(2000);

        System.out.println("How many meals left? (>= 0)");
        meals.setCrapMeal(scanner.nextInt());

        System.out.println("How many cigarettes? (>= 0)");
        recreation.setCigs(scanner.nextInt());

        System.out.println("Any books? (>= 0)");
        recreation.setBooks(scanner.nextDouble());

        System.out.println("What level of depression is Jack on? (0-100)");
        jack.setDepression(scanner.nextInt());

        System.out.println("What level of happiness is Jack on? (0-100");
        jack.setHappiness(scanner.nextInt());

        System.out.println("What about his health? (0-100)");
        jack.setHealth(scanner.nextInt());

        for (int i = 0; i < days; i++) {
            day.start(jack, meals, recreation);
        }
    }
}
