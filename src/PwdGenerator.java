import  java.util.Scanner;
public class PwdGenerator {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Please enter your name ??");
        String name = scn.next();

        System.out.println("Hi " + name );
        System.out.println("how many random passwords do you want ??");

        int n = scn.nextInt();
        System.out.println("how much length do you want for each password??");
        int len = scn.nextInt();

        String[] randomPasswords = new String[n];

        for(int i = 0;i < n;i++) {
            String randomPwd = "";
            for(int j = 0;j < len;j++) {
                // generating password
                randomPwd= randomPwd+randomCharacter();
            }
            randomPasswords[i] = randomPwd;
        }

        printPwd(randomPasswords);

    }

    public  static void printPwd(String[] arr) {
        for(int i = 0;i < arr.length;i++) {
            System.out.println(arr[i]);
        }
    }

    // 0-9  ==> 48-57 in ASCII
    // A-Z == >  65-90 in ASCII
    // a-z ==> 97-122 in ASCII


    public static char randomCharacter() {

//        int rand = (int) Math.random()*62;
        int rand = (int) (Math.random() * 62);

        if(rand<=9) {
            // number(0-9) --->> 48-57 in ASCII
            int ascii =  rand+=48; // 57-9 = 48
            return (char)(ascii);
        }
        else if(rand<=35){
            // uppercase(10-35) --->> 65-90 in ASCII
            int ascii = rand+55; // 90-35 = 55
            return (char)(ascii);
        }
        else{
            // lowercase (36-61)  --->>  97-122 in ASCII
            int ascii = rand + 61;
            return  (char) (ascii);
        }
    }

}
