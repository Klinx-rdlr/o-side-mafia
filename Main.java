

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Game game = new Game();
        Scanner getInput = new Scanner(System.in);

        while(true) {
            int option;
            System.out.println("Welcome to O Side Bar Hunt Adventure Game");
            System.out.println("[1] HOW TO PLAY");
            System.out.println("[2] CREDITS");
            System.out.println("[3] EXIT");
            option = Integer.parseInt(getInput.nextLine());

            switch (option){
                case 1 -> game.gameInfo();
                case 2 -> game.gameCreators();
                default -> {
                    System.out.println("Thank you!");
                    break;
                }
            }

        }
    }
}
