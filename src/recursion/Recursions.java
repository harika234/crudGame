package recursion;

public class Recursions {
    public static void main(String[] args) {
        int n = 4;
        Recursions recursions = new Recursions();
        int sum = recursions.func(n);
        System.out.println(sum);

    }
    public int func(int n) {
        if(n == 1) return 1;
        return func(n-1)*n;
    }
}
