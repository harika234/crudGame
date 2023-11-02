import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Hi what is your name");
        String s1 = scn.next();
        System.out.println("Hi "+s1+" which operation do you perform?");
        System.out.println("+ addition");
        System.out.println("-Subtraction");
        System.out.println("* multiplication");
        System.out.println("/ Division");
        System.out.println("Note - for addition click 1 , for subtraction click 2 , for multiplication click 3," +
                "for division click 4 , to exit click 0.....");

        int n1 = scn.nextInt();
        while(n1!=0) {
            if(n1 == 1){
                System.out.println("please enter 2 numbers for addition.");
                int add1 = scn.nextInt();
                int add2 = scn.nextInt();

                System.out.println("hey the result of addition is - "+ add1+add2);
            }
            if(n1 == 2){
                System.out.println("please enter 2 numbers for subtraction.");
                int sub1 = scn.nextInt();
                int sub2 = scn.nextInt();
                int result = Math.abs(sub1-sub2);
                System.out.println("hey the result of subtraction is "+ result);
            }

            if(n1 == 3) {
                int result = 0;
                System.out.println("please enter 2 numbers for Multiplication.");
                int mul1 = scn.nextInt();
                int mul2 = scn.nextInt();
                if(mul1==0 || mul2==0) {
                    result = 0;
                }
                else{
                    result = mul2*mul1;
                }
                System.out.println("hey the result of addition is - "+ result);
            }

            if(n1 == 4) {
                System.out.println("please enter 2 numbers for division.");
                int div1 = scn.nextInt();
                int div2 = scn.nextInt();
                int result  = 0;
                if(div1>0 && div2>0) {
                    result = div1/div2;
                    System.out.println("hey the result of division  is - "+ result);
                }
                if(div1 == 0) {
                    result = 0;
                    System.out.println("hey the result of division  is - "+ result);
                }
                if(div2 == 0) {
                    System.out.println("the result is undefined!!");
                }

            }
            System.out.println("enter operation to perform");
            n1 = scn.nextInt();
        }
        System.out.println("GAME IS OVER  quit...quit....quit.....");
    }
}