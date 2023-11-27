

import java.util.ArrayList;
import java.util.Scanner;

public class Maps {
    Scanner getInput = new Scanner(System.in);
    public ArrayList<String> mapList = new ArrayList<>();
    
    Maps(){
        mapList.add("Map1");
        mapList.add("Map2");
        mapList.add("Map3");
        mapList.add("Map4");
    }
    public void gameCreators(){
        System.out.println("----------------------------------------");
        System.out.println("Dustin Wania - Project Leader");
        System.out.println("Ralph Palma - System Analyst");
        System.out.println("Kirsten Escueta - Programmer");
        System.out.println("Aster Palencia - Test Analyst");
        System.out.println("Rhode Reyes - Documentation Specialist");
        System.out.println("----------------------------------------\n\n");
    }
    public static void clearScreen() {  
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }  

    public boolean Map1(){
        // 4693
        int option;
        int drunkLevel = 0;
        int guess = 0;
        boolean firstWin = false;
        boolean secondWin = false;
        System.out.println("Okay bro, we're back in the VIP room. You might find something under these tables. Try to remember with your memory! Be aware of your drunk level!");
        System.out.println("Press 1 to continue...");
        option = Integer.parseInt(getInput.nextLine()); 

        if(option == 1){
        System.out.println("Challenge: Try to guess the combination!");
        System.out.println("Combination: 4 _ 9 _ ");
        System.out.println("\nGuess the First Number:");
        while(drunkLevel < 101){
            System.out.println("Your current drunkness level is: " + drunkLevel + " %");
            guess = getInput.nextInt();
            if(guess > 6){
                System.out.println("Lower Number!");
                drunkLevel += 25;
            }else if(guess < 6){
                System.out.println("Higher Number!");
                drunkLevel += 25;
            }else{
                System.out.println("You got the correct number!");
                drunkLevel = 0;
                firstWin = true;
                break;
            }
             
        }

        if(drunkLevel >= 100){
            System.out.println("You lost, please try again!");
        }else{
            System.out.println("\nGuess the Second Number:");
            while(drunkLevel < 101) {
                System.out.println("Your Current Drunkness Level is: " + drunkLevel + " %");
                guess = getInput.nextInt();
                if (guess > 3) {
                    System.out.println("Lower Number!");
                    drunkLevel += 25;
                } else if (guess < 3) {
                    System.out.println("Higher Number!");
                    drunkLevel += 25;
                } else {
                    System.out.println("You got the correct number!");
                    System.out.println("You answered the right combination.");
                    System.out.println("\nHey bro! I think you've found your wallet! Let's keep it up and proceed to the Dance Floor bro so we can find your other belongings.");
                    
                    secondWin = true;
                    break;
                }
                
            }

            if(drunkLevel >= 100){
                System.out.println("You lost, please try again!");
            }
            clearScreen();
        }


        
    }
        else {
            System.out.println("Don't give up on me yet bro!");
        }
       return firstWin & secondWin;
    }

    public boolean Map2(){
        boolean firstWin = false;
        boolean secondWin = false;
        boolean thirdWin = false;
        boolean fourthWin = false;
        int drunkLevel = 0;
        String guess;
        System.out.println("Bro! The Dance floor is crowded. Try to keep your balance so we can find your next item.");
        System.out.println("\n\nChallenge: Keep your balance!");
        System.out.println("For each move, you have two options: dancing or spinning.");
        System.out.println("Based on clues, select the correct direction either right or left for your chosen move.");
        System.out.println("Input Example: 'Dance Right', 'Dance Left', 'Spin Right', 'Spin Left'");

        System.out.println("\nRotate like a clock in the direction needle moves from 6 o'clock to 12 o'clock.");
        while(drunkLevel < 101){
            System.out.println("Your current drunkness level is: " + drunkLevel);
            guess = getInput.nextLine();
            if(guess.equalsIgnoreCase("Spin Right")){
                firstWin = true;
                drunkLevel -= 50;
                break;
            }else{
                System.out.println("Incorrect try again");
                drunkLevel += 25;
            }
        }

        if(firstWin && drunkLevel < 101){
            System.out.println("\nImagine facing north and turning 90 degrees counter clockwise, which way would you be facing now?");
            while(drunkLevel < 101){
                System.out.println("Your current drunkness level is: " + drunkLevel);
                guess = getInput.nextLine();
                if(guess.equalsIgnoreCase("Dance Left")){
                    secondWin = true;
                    drunkLevel -= 50;
                    break;
                }else{
                    System.out.println("Incorrect try again");
                    drunkLevel += 25;
                }
            }
        }


        if(secondWin  && drunkLevel < 101){
            System.out.println("\nMove towards the same direction as the clock's hands go when indicating 3 o'clock");
            while(drunkLevel < 101){
                System.out.println("Your current drunkness level is: " + drunkLevel);
                guess = getInput.nextLine();
                if(guess.equalsIgnoreCase("Dance Right")){
                    thirdWin = true;
                    drunkLevel -= 50;
                    break;
                }else{
                    System.out.println("Incorrect try again");
                    drunkLevel += 25;
                }
            }
        }

        if(thirdWin && drunkLevel < 101){
            System.out.println("\nTwist your body in the same direction as the needle moves from 12 o'clock to 6 o'clock on a clock face.");
            while(drunkLevel < 101){
                System.out.println("Your current drunkness level is: " + drunkLevel);
                guess = getInput.nextLine();
                if(guess.equalsIgnoreCase("Spin Left")){
                    System.out.println("Hey Bro! Good thing you kept your balance with this crowd!");
                    System.out.println("I think we've found your phone! Let's try and check the Comfort Room if there's more.");
                    fourthWin = true;
                    break;
                }else{
                    System.out.println("Incorrect try again");
                    drunkLevel += 25;
                }
            }
        }

        clearScreen();
        return fourthWin;
    }

    public boolean Map3(){
        boolean firstWin = false;
        boolean secondWin = false;
        boolean thirdWin = false;
        boolean fourthWin = false;
        int drunkLevel = 0;
        String guess;

        System.out.println("\n\nBro, I might also check the other rooms!");
        System.out.println("Go try and see if you can remember the path to the comfort room!");
        System.out.println("Input Ex: Go Right, Go Left");
        System.out.println("Note: You have no clue for this round");

        if(drunkLevel < 101){
            System.out.println("\n1st Way:");
            while(drunkLevel < 101){
                System.out.println("Your current drunkness level is: " + drunkLevel);
                guess = getInput.nextLine();
                if(guess.equalsIgnoreCase("Go Right")){
                    firstWin = true;
                    drunkLevel -= 25;
                    break;
                }else{
                    System.out.println("Incorrect try again");
                    drunkLevel += 25;
                }
            }
        }

        if(firstWin && drunkLevel < 101){
            System.out.println("\n2nd Way:");
            while(drunkLevel < 101){
                System.out.println("Your current drunkness level is: " + drunkLevel);
                guess = getInput.nextLine();
                if(guess.equalsIgnoreCase("Go Left")){
                    secondWin = true;
                    drunkLevel -= 25;
                    break;
                }else{
                    System.out.println("Incorrect try again");
                    drunkLevel += 25;
                }
            }
        }


        if(secondWin && drunkLevel < 101){
            System.out.println("\n3rd Way:");
            while(drunkLevel < 101){
                System.out.println("Your current drunkness level is: " + drunkLevel);
                guess = getInput.nextLine();
                if(guess.equalsIgnoreCase("Go Left")){
                    thirdWin = true;
                    drunkLevel -= 25;
                    break;
                }else{
                    System.out.println("Incorrect try again");
                    drunkLevel += 25;
                }
            }
        }

        if(thirdWin && drunkLevel < 101){
            System.out.println("\n4th Way:");
            while(drunkLevel < 101){
                System.out.println("Your current drunkness level is: " + drunkLevel);
                guess = getInput.nextLine();
                if(guess.equalsIgnoreCase("Go Right")){
                    fourthWin = true;
                    System.out.println("Bro! That's great you still knew the path to the comfort room, and you also found your Golden Watch!");
                    System.out.println("I have some good news for you bro! I think I found a clue for your last item, let's go to the Bartender Area");
                    clearScreen();
                    break;
                    
                }else{
                    System.out.println("Incorrect try again");
                    drunkLevel += 25;
                }
            }
        }
       
        return fourthWin;
    }

    public boolean Map4(){
        boolean firstWin = false;
        boolean secondWin = false;
        boolean thirdWin = false;
        boolean fourthWin = false;

        int drunkLevel = 0;
        String guess;
        System.out.println("We're here bro, but before that I think we might have to settle this with the bartender. You got this bro!");
        System.out.println("\n\nChallenge: Know your drink well!");
        System.out.println("Identify the correct spelling of the beers presented.");

        System.out.println("\nAl_on_o");
        while(drunkLevel < 101){
            System.out.println("Your current drunkness level is: " + drunkLevel);
                guess = getInput.nextLine();
                if(guess.equalsIgnoreCase("Alfonso")){
                    firstWin = true;
                    break;
                }else{
                    System.out.println("Incorrect try again");
                    drunkLevel += 25;
                }
        }

        if(firstWin && drunkLevel < 101){
            System.out.println("\nJa__ D__i_l_");
            while(drunkLevel < 101){
                System.out.println("Your current drunkness level is: " + drunkLevel);
                guess = getInput.nextLine();
                if(guess.equalsIgnoreCase("Jack Daniels")){
                    secondWin = true;
                    break;
                }else{
                    System.out.println("Incorrect try again");
                    drunkLevel += 25;
                }
            }
        }

        if(secondWin  && drunkLevel < 101){
            System.out.println("\nJ__e C___v_");
            while(drunkLevel < 101){
                System.out.println("Your current drunkness level is: " + drunkLevel);
                guess = getInput.nextLine();
                if(guess.equalsIgnoreCase("Jose Cuervo")){
                    thirdWin = true;
                    break;
                }else{
                    System.out.println("Incorrect try again");
                    drunkLevel += 25;
                }
            }
        }

        if(thirdWin && drunkLevel < 101){
            System.out.println("\nR__ H___e");
            while(drunkLevel < 101){
                System.out.println("Your current drunkness level is: " + drunkLevel);
                guess = getInput.nextLine();
                if(guess.equalsIgnoreCase("Red Horse")){
                    System.out.println("And we did it man!");
                    System.out.println("We have found all of your things! Good thing you're still good at this bro.");
                    System.out.println("It's time to head out bro!");
                    fourthWin = true;
                    break;
                }else{
                    System.out.println("Incorrect try again");
                    drunkLevel += 25;
                }
            }
        }


        return fourthWin;
    }
}


