import java.util.*;
public class Q42 {
    public int getItemFromTwoSortedArrays(int[] arr1, int[] arr2, int k) {
        // 필드 변수를 사용하면 테스트가 정상적으로 작동하지 않습니다.
        // 메서드 내부에서 값을 저장하고 활용해주세요.
        // TODO:
        int[] concatArr= new int[arr1.length+arr2.length];
        System.arraycopy(arr1,0,concatArr,0,arr1.length);
        System.arraycopy(arr2,0,concatArr,arr1.length-1,arr1.length);
        Arrays.sort(concatArr);
        int start = 0;
        int end = concatArr.length-1;
        while (start>end){
            int mid = (start+end)/2;
            if (concatArr[mid]==k){
                return mid;
            }
            else if (concatArr[mid]>k){
                end = mid -1;
            }
            else {
                start = mid+1;
            }
        }
        return -1;
    }
//    private int bs_arr(int[] arr, int target,int start,int end){
//        if (start > end) {
//            return -1;
//        }
//        int mid = (start+end)/2;
//        if (arr[mid]==target){
//            return mid;
//        }
//        else if (arr[mid]>target){
//            return bs_arr(arr,target,start,mid-1);
//        }
//        else {
//            return bs_arr(arr,target,mid+1,end);
//        }
//    }

}
