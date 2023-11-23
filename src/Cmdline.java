public class Cmdline {
    public static void main(String[] args) {

        String[] argh = {"x","y","z"};
        args = argh;

        for(String s : args) {
            System.out.println(s);
        }
    }
}
