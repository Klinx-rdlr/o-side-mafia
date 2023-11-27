
import java.util.ArrayList;

public class Game extends Maps {
    public ArrayList<String> ProgressBar = new ArrayList<>();

    public boolean isValidInput(String option2) {
        return option2.equalsIgnoreCase("play");
    }
    public String progressTracker(){
        int index = 0;
        if(ProgressBar.isEmpty()){
            return mapList.get(index);
        }else{
            switch (ProgressBar.size()){
                case 1 -> {
                    return "Map2";
                }
                case 2 -> {
                    return "Map3";
                }
                case 3 -> {
                    return "Map4";
                }
                default -> {
                    return "null";
                }
            }
        }
    }
    public void gameInfo() {
        boolean checker = true;
        int option;
        String option2 = null;
        System.out.println("""
            =================================================================================================
            ||                                                                                              ||
            ||    Hello and Welcome to our game: O Side Bar Hunt Adventure game!                            ||
            ||    You're controlling a character who had a bit too much at the bar                          ||
            ||    Can you help them find their lost belongings and navigate the challenges of the night?    ||
            ||                                                                                              ||
            ==================================================================================================
                      \n""");

        System.out.println("Press 1 to continue...");

        while(checker) {
            try {
                option = Integer.parseInt(getInput.nextLine());
                if (option == 1) {
                    System.out.println("\nTo play, type commands like 'Go left,' 'Dance Right,' or 'Enter Room.' ");
                    System.out.println("Use single or two-word inputs to guide your character.");
                    checker = false;
                } else {
                    System.out.println("Input invalid, try again");
                }
            }catch (Exception e){
                System.out.println("Input invalid, try again");
            }
        }

        System.out.println("Press 1 to continue...");
        checker = true;
        while (checker){
            try {
                option = Integer.parseInt(getInput.nextLine());
                if (option == 1) {
                    System.out.println("\nYour main goal is to find your lost items and eventually escape the bar.");
                    System.out.println("Type commands that make sense in the context to achieve your objectives.");
                    checker = false;
                }else {
                    System.out.println("Input invalid, try again");
                }
            }catch (Exception e){
                System.out.println("Input invalid, try again");
            }
        }

        System.out.println("\nType 'Play' to begin your adventure!");
        checker = true;


            while (checker) {
                try {
                    option2 = getInput.nextLine();
                    // Add logic to break the loop when the input is valid
                    if (isValidInput(option2)) {
                        checker = false;
                    } else {
                        System.out.println("Invalid input, please try again: ");
                    }
                } catch (Exception e) {
                    System.out.println("Invalid input, please try again: ");
                }
            }





        checker = true;

        while (checker) {
            if (option2.equalsIgnoreCase("play")) {
                System.out.println("\nHey Bro! Good thing you finally woke up, check yourself dude.");
                System.out.println("Yes, you lost all of your things! Get inside the bar and search all of your stuff.");

                System.out.println("[1] Go Inside");
                System.out.println("[2] Exit");
                option = Integer.parseInt(getInput.nextLine());
                if (option == 1) {
                    clearScreen();
                    gameStart();
                    if (ProgressBar.size() == 4) {
                        System.out.println("Finally! You have collected all of your essentials! I thought you'll lose it all in the bar. Now, go home!");
                    }
                    break;
                } else if (option == 2) {
                    break;
                }
            } else {
                System.out.println("Input invalid, try again");
            }
        }
    }


    public void gameStart(){
        while(true) {
            boolean mapFinished = false;
            String mapCheck = progressTracker();
            switch (mapCheck) {
                case "Map1" -> {
                    while (true) {
                        if (Map1()) {
                            ProgressBar.add("Map1");
                            break;
                        } else {
                            System.out.println("Please Try Again");
                        }
                    }
                }
                case "Map2" -> {
                    while (true) {
                        if (Map2()) {
                            ProgressBar.add("Map2");
                            break;
                        } else {
                            System.out.println("Please Try Again");
                        }
                    }
                }
                case "Map3" -> {
                    while (true) {
                        if (Map3()) {
                            ProgressBar.add("Map3");
                            break;
                        } else {
                            System.out.println("Please Try Again");
                        }
                    }
                }
                case "Map4" -> {
                    while (true) {
                        if (Map4()) {
                            ProgressBar.add("Map4");
                            mapFinished = true;
                            break;
                        } else {
                            System.out.println("You lost, please Try Again");
                        }
                    }
                }
                case "null" -> {
                    System.out.println("You have already completed all levels, Congratulations!");
                    mapFinished = true;
                }
            }
            if(mapFinished){
                break;
            }
        }
    }

}
