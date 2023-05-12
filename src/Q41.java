import java.beans.JavaBean;
import java.util.Arrays;

public class Q41 {
    public int binarySearch(int[] arr, int target) {
        // TODO:
       return bs_arr(arr,target,0,arr.length-1);

    }

    private int bs_arr(int[] arr, int target,int start,int end){
        if (start > end) {
            return -1;
        }
        int mid = (start+end)/2;
        if (arr[mid]==target){
            return mid;
        }
        else if (arr[mid]>target){
            return bs_arr(arr,target,start,mid-1);
        }
        else if (arr[mid]<target) {
           return bs_arr(arr,target,mid+1,end);
        }
        return -1;
    }
}
//        if (arr[arr.length/2]==target){
//            int[] newArr = new int[arr.length/2];
//            System.arraycopy(arr,0,newArr,0,newArr.length);
//            return newArr;
//        }
//        else if (arr[arr.length/2]>target){
//            int[] newArr = new int[arr.length/2];
//            System.arraycopy(arr,0,newArr,0,newArr.length);
//            bs_arr(newArr,target);
//        }
//        else if (arr[arr.length/2]<target)
//        {
//            int[] newArr = new int[arr.length/2];
//            System.arraycopy(arr,arr.length/2,newArr,0,newArr.length);
//            bs_arr(newArr,target);
//        }
