import java.util.*;

public class Q12 {
    public int[] reverseArr(int[] arr){
        // TODO:
        if(arr.length == 0){
            return new int[]{};
        }

        int arr_tail = arr[arr.length-1];
        int[] revsersArr ={arr_tail};
        int[] removeArr= reverseArr(Arrays.copyOfRange(arr,0,arr.length-1));
        int[] concatArr =new int[removeArr.length+1];

        System.arraycopy(revsersArr,0,concatArr,0,revsersArr.length);
        System.arraycopy(removeArr,0,concatArr,revsersArr.length,removeArr.length);

        return concatArr;

    }

}
