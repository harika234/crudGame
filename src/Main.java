import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Hi what is your name");
        String name = scn.next();
        System.out.println("Hi "+ name +" which operation do you perform?");
        printOperations();

        int n1 = scn.nextInt();
        while(n1 != 0) {
            if(n1 == 1){
                System.out.println("please enter 2 numbers for addition.");
                int add1 = scn.nextInt();
                int add2 = scn.nextInt();
                int result = add1+add2;
                System.out.println("hey the result of addition is - "+ result);
            }
            if(n1 == 2){
                System.out.println("please enter 2 numbers for subtraction.");
                int sub1 = scn.nextInt();
                int sub2 = scn.nextInt();
                int result = Math.abs(sub1-sub2);
                System.out.println("hey the result of subtraction is "+ result);
            }

            if(n1 == 3) {
                System.out.println("please enter 2 numbers for Multiplication.");
                int mul1 = scn.nextInt();
                int mul2 = scn.nextInt();
                int result = mul1 * mul2;
                System.out.println("hey the result of multiplication is "+ result);
            }

            if(n1 == 4) {
                System.out.println("please enter 2 numbers for division.");
                int div1 = scn.nextInt();
                int div2 = scn.nextInt();
                if(div2 == 0) {
                    System.out.println("the result is undefined!!");
                } else {
                    int result = div1 / div2;
                    System.out.println("hey the result of division  is "+ result);
                }
            }
            System.out.println("enter operation to perform");
            printOperations();
            n1 = scn.nextInt();
        }
        System.out.println("GAME IS OVER  quit...quit....quit.....");
    }

    public static void printOperations() {
        System.out.println("+ addition");
        System.out.println("- subtraction");
        System.out.println("* multiplication");
        System.out.println("/ division");
        System.out.println("Note - for addition click 1 , for subtraction click 2 , for multiplication click 3," +
                "for division click 4 , to exit click 0.....");
    }
}