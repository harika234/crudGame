import java.util.Scanner;

public class Numbergame {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

//         THEORY - actually there are 2 ways to generate random numbers with in specified range
//        1) using random class -> create a object for that class to use (rand.nextInt(max - min + 1) + min);
//        2) use  (Math.random() * ((max - min) + 1);

//        double a = (double)Math.random();
//        System.out.println(a);
//        System.out.println("Random doubles: " + Math.random());

        int min = 1;
        int max = 100;

        int a = min + (int)(Math.random() * ((max - min) + 1));
        System.out.println(a);
        int chances = 10;
        int guess = 1;
        int remainingchances = 0;
        System.out.println("Your Name Please ....!");
        String name = scn.next();
        System.out.println("WELCOME "+ name + " lets play a game excited??? ok then guess a random number i will check with mine");
        while(guess<=10){
            int input = scn.nextInt();

            if(input == a) {

                System.out.println("Hey "+ name + " YOU WON IT KUDOOS");
//                System.out.println("hey do u want to play again" );
                remainingchances = chances-guess;
//                System.out.println("You still have " + remainingchances + "remaining chances WELL DONE!!!" );
                break;

            }
            else{

                remainingchances = chances-guess;
                if(input < a) {
                    System.out.println("your guess number is less than mine..Still have "+ remainingchances +"chances");
                    System.out.println("PLEASE TRY AGAIN");
                    input = scn.nextInt();
                }
                if(input > a) {
                    System.out.println("your guess number is greater than mine...think once again!!");
                    System.out.println("still have " + remainingchances+" chances no worries TRY AGAIN");
                    input = scn.nextInt();
                }
            }
            guess++;
        }
        if(remainingchances == 0) {
            System.out.println("you lost the game");
        }
        else{
            System.out.println("game over");
        }
    }
}
