// java is pass by value not pass by reference

import javax.swing.plaf.IconUIResource;

public class Animal {
    int eyes;
    String name = "cat";
    public static void main(String[] args) {
        int a = 4;
        a++;
        System.out.println(a);
        int b = 4;
        if(a == b) {
            System.out.println("both same");
        }
        System.out.println(a);
    }

    public static int countIncrement(int countcopy){
        return ++countcopy;
    }
}
