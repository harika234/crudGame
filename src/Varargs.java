public class Varargs {
    public static void main(String... args) {
//        sum();
//        sum(1,2,3);
//        sum(40,-74,85);
        int[] a = {10,20,30};
        int[] b = {50,60};
        m1(a,b);
    }

//    public static void sum(int...x) {
//        int total = 0;
//        for(int x1 : x) {
//            total = total+x1;
//        }
//        System.out.println("the total sum is " + total);
//    }
    public static  void m1(int[]...x) {
        for(int[]x1 : x) {
            System.out.println(x1[0]);
        }
    }
}

// (int... x) === int[]x
// (int[]...x) === int[][]x
// varargs