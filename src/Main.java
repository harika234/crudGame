import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Hi, what is your name?");
        String name = scn.next();
        System.out.println("Hi " + name + ", which operation do you want to perform?");

        boolean continueCalculations = true;

        while (continueCalculations) {
            printOperations();

            if (scn.hasNextInt()) {
                int n1 = scn.nextInt();

                if (n1 == 0) {
                    System.out.println("GAME IS OVER. Quitting...");
                    continueCalculations = false;
                } else if (n1 >= 1 && n1 <= 4) {
                    performOperation(n1, scn);
                } else {
                    System.out.println("Option invalid, please choose between 0 to 4.");
                }
            } else {
                System.out.println("Invalid input. Enter a valid number in the range 0-4.");
                scn.next();  // Consume the invalid input
            }
        }

        scn.close();
    }

    public static void printOperations() {
        System.out.println("+ addition");
        System.out.println("- subtraction");
        System.out.println("* multiplication");
        System.out.println("/ division");
        System.out.println("Note - for addition, click 1; for subtraction, click 2; for multiplication, click 3; " +
                "for division, click 4; to exit, click 0.");
    }

    public static void performOperation(int operation, Scanner scn) {
        switch (operation) {
            case 1:
                performAddition(scn);
                break;
            case 2:
                performSubtraction(scn);
                break;
            case 3:
                performMultiplication(scn);
                break;
            case 4:
                performDivision(scn);
                break;
        }
    }
    public static void performAddition(Scanner scn) {
        System.out.println("Please enter 2 numbers for addition.");
        int add1 = scn.nextInt();
        int add2 = scn.nextInt();
        int result = add1 + add2;
        System.out.println("The result of addition is " + result);
    }

    public static void performSubtraction(Scanner scn) {
        System.out.println("Please enter 2 numbers for subtraction.");
        int sub1 = scn.nextInt();
        int sub2 = scn.nextInt();
        int result = Math.abs(sub1 - sub2);
        System.out.println("The result of subtraction is " + result);
    }

    public static void performMultiplication(Scanner scn) {
        System.out.println("Please enter 2 numbers for multiplication.");
        int mul1 = scn.nextInt();
        int mul2 = scn.nextInt();
        int result = mul1 * mul2;
        System.out.println("The result of multiplication is " + result);
    }

    public static void performDivision(Scanner scn) {
        System.out.println("Please enter 2 numbers for division.");
        int div1 = scn.nextInt();
        int div2 = scn.nextInt();
        if (div2 == 0) {
            System.out.println("The result is undefined!");
        } else {
            int result = div1 / div2;
            System.out.println("The result of division is " + result);
        }
    }
}
