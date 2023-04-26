import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Q5 q5 = new Q5();
        Q11 q11 =new Q11();
        Q22 q22 = new Q22();
        String[] output = q11.removeExtremes(new String[]{"aaaaa", "bbbbb", "ccccc", "ddddd", "eeeee"});
        System.out.println("Hello world!");
        System.out.println(q5.firstReverse("abcd"));
        System.out.println(Arrays.toString(output));
        System.out.println(Arrays.toString(q22.bubbleSort(new int[]{1,2,43,100,100,21})));
    }
}