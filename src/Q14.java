import java.util.Arrays;

public class Q14 {
    public boolean superIncreasing(int[] arr) {
        // TODO:
        int sum = arr[0];
        int[] re_arr= Arrays.copyOfRange(arr,1,arr.length);
        for (int el: re_arr) {
            if(!(sum<el)){
                return false;
            }
            else{
                sum = sum+el;
            }
        }
        return true;
    }
}
