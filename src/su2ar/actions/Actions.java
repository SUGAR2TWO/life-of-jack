package su2ar.actions;

import su2ar.Jack;
import su2ar.Meals;
import su2ar.Recreation;

public class Actions {

    public void smoke(Recreation recreation, Jack jack, Meals meals) throws InterruptedException {
        System.out.println("Le smoking time...");

        if (recreation.getCigs() > 0) {
            recreation.setCigs(recreation.getCigs() - 1);
            jack.setDepression(jack.getDepression() - jack.getDepression() / jack.getHappiness());
            jack.setHappiness(jack.getHappiness() - 1);
            jack.setHealth(jack.getHealth() - 2);
            umot(1, "Smoked");
        } else {
            jack.setHealth(jack.getHealth() - 1);
            jack.setDepression(jack.getDepression() + 3 * jack.getDepression() / jack.getHappiness());
            jack.setHappiness(jack.getHappiness() - 3);
            umot(1, "No cigs. Fate worse than death...");
        }

        checkJack(jack, recreation, meals);
        dying(jack);        
    }

    public void eat(Meals meals, Jack jack, Recreation recreation) throws InterruptedException {
        System.out.println("Me hungry...");

        if (meals.getCrapMeal() > 0) {
            meals.setCrapMeal(meals.getCrapMeal() - 1);
            jack.setHealth(jack.getHealth() + 1);
            jack.setDepression(jack.getDepression() + jack.getDepression() / jack.getHappiness());
            umot(1, "Not anymore...");
        } else {
            jack.setHealth(jack.getHealth() - 3);
            jack.setDepression(jack.getDepression() + 3 * jack.getDepression() / jack.getHappiness());
            jack.setHappiness(jack.getHappiness() - 3);
            umot(1, "No food :(");
        }

        checkJack(jack, recreation, meals);
        dying(jack);
    }

    public void read(Recreation recreation, Jack jack, Meals meals) throws InterruptedException {
        String message = "Done";

        System.out.println("Reads?");
        if (recreation.getBooks() > 0) {
            recreation.setBooks(recreation.getBooks() - 0.20);
            jack.setDepression(jack.getDepression() - 2 * jack.getDepression() / jack.getHappiness());
            jack.setHappiness(jack.getHappiness() + 1);
            jack.setHealth(jack.getHealth() - 1);
            umot(1, "Done");
        } else {
            jack.setHealth(jack.getHealth() - 1);
            umot(1, "No books");
        }

        checkJack(jack, recreation, meals);
        dying(jack);
    }

    public void binging(Jack jack, Recreation recreation, Meals meals) throws InterruptedException {
        System.out.println("youtube.com");
        jack.setDepression(jack.getDepression() + jack.getDepression() / jack.getHappiness());
        jack.setHappiness(jack.getHappiness() - 1);
        jack.setHealth(jack.getHealth() - 1);
        umot(1, "tired of this");
        checkJack(jack, recreation, meals);
        dying(jack);
    }

    public void checkJack(Jack jack, Recreation recreation, Meals meals) {
        System.out.print("Health left: " + jack.getHealth() + " ");
        System.out.print("Meals left: " + meals.getCrapMeal() + " ");
        System.out.print("Cigs left: " + recreation.getCigs() + " ");
        System.out.print("Books left: " + String.format("%,.2f", recreation.getBooks() * 100) + "% ");
        System.out.print("Happiness level: " + jack.getHappiness() + " ");
        System.out.println("Depression level: " + jack.getDepression() + " ");
        System.out.println();
    }

    public void dying(Jack jack) {
        if (jack.getDepression() >= 100) {
            System.out.println("Life's too much...");
            System.exit(0);
        }

        if (jack.getHealth() <= 0) {
            System.out.println("No more strength...");
            System.exit(0);
        }
    }

//the Unstoppable March Of Time
    public void umot(int t, String message) throws InterruptedException {        
        for (int i = 0; i < t; i++) {
            Thread.sleep(1000);
            System.out.println(".");
            Thread.sleep(1000);
            System.out.println(".");
            Thread.sleep(1000);
            System.out.println(message);
            System.out.println();
        }
    }

}