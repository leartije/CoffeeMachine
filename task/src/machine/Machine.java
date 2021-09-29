package machine;

import java.util.Locale;
import java.util.Scanner;

public class Machine {


    private int water;
    private int milk;
    private int coffeeBeans;
    private int disposableCups;
    private int money;
    private final Scanner scanner;

    public Machine() {
        this.water = 400;
        this.milk = 540;
        this.coffeeBeans = 120;
        this.disposableCups = 9;
        this.money = 550;
        this.scanner = new Scanner(System.in);
    }

    private void status() {
        System.out.println("The coffee machine has: \n" +
                this.water + " ml of water \n" +
                this.milk + " ml of milk \n" +
                this.coffeeBeans + " g of coffee beans \n" +
                this.disposableCups + " disposable cups \n" +
                "$" + this.money + " of money \n");
    }

    public void run() {
        boolean exit = false;
        while (!exit) {
            System.out.println("Write action (buy, fill, take, remaining, exit): ");
            String action = scanner.nextLine().toLowerCase();
            switch (action) {
                case "buy":
                    buy();
                    break;
                case "fill":
                    fill();
                    break;
                case "take":
                    take();
                    break;
                case "exit":
                    exit = true;
                    break;
                case "remaining":
                    status();
                    break;
                default:
                    System.out.println("Wrong input!");
                    break;
            }
        }

    }

    private void buy() {
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: ");
        String option = scanner.nextLine().toLowerCase(Locale.ROOT);
        switch (option) {
            case "1":
                buyCoffee(250, 0, 16, 4);
                break;
            case "2":
                buyCoffee(350, 75, 20, 7);
                break;
            case "3":
                buyCoffee(200, 100, 12, 6);
                break;
            case "back":
                break;
            default:
                System.out.println("Wrong input");
                buy();
                break;
        }

    }

    private void buyCoffee(int water, int milk, int coffeeBeans, int money) {
        int count = 0;
        if (this.water - water < 0) {
            System.out.println("Sorry, not enough water!");
            count++;
        }
        if (this.milk - milk < 0) {
            System.out.println("Sorry, not enough milk");
            count++;
        }
        if (this.coffeeBeans - coffeeBeans < 0) {
            System.out.println("Sorry, not enough coffee beans");
            count++;
        }
        if (this.disposableCups - 1 < 0) {
            System.out.println("Sorry, not enough disposable cups");
            count++;
        }
        this.money += money;

        if (count == 0) {
            System.out.println("I have enough resources, making you a coffee!");
            this.water -= water;
            this.milk -= milk;
            this.coffeeBeans -= coffeeBeans;
            this.disposableCups -= 1;
        }

        System.out.println();
    }


    private void fill() {
        System.out.println("Write how many ml of water you want to add: ");
        this.water += scanner.nextInt();
        scanner.nextLine();
        System.out.println("Write how many ml of milk you want to add: ");
        this.milk += scanner.nextInt();
        scanner.nextLine();
        System.out.println("Write how many grams of coffee beans you want to add:");
        this.coffeeBeans += scanner.nextInt();
        scanner.nextLine();
        System.out.println("Write how many disposable cups of coffee you want to add: ");
        this.disposableCups += scanner.nextInt();
        scanner.nextLine();

        System.out.println();

    }

    private void take() {
        System.out.println("I give you $" + this.money);
        this.money = 0;
        System.out.println();
    }


}
