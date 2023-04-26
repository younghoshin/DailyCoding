import java.util.*;
public class Q22 {
    public int[] bubbleSort(int[] arr) {
        int serchCount= arr.length-1;
        int min = 0, max = 0;
        // TODO:
        for (int i = 0; i <arr.length-1 ; i++) {
            int swap = 0;
            for (int j = 0; j <serchCount; j++) {
                if(arr[j]>arr[j+1]){
                    min = arr[j+1];
                    max = arr[j];
                    arr[j]=min;
                    arr[j+1]=max;
                    swap++;
                }
            }
            if(swap == 0){
                break;
            }
            serchCount--;
        }
        return arr;
    }

}
