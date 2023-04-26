import java.util.Arrays;
public class Q21 {
    public int largestProductOfThree(int[] arr) {
        // TODO:
        Arrays.sort(arr);
        int max = 0;
        int max2 = 0;

        max = arr[0]*arr[1]*arr[arr.length-1];
        max2 = arr[arr.length-3]*arr[arr.length-2]*arr[arr.length-1];

        return Math.max(max,max2);

    }
}
