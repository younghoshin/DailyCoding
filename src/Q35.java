import java.util.Arrays;

public class Q35 {
    public static void main(String[] args) {
        quickSort(new int[]{9,7,8,1,4,5,6,2,3});

    }
    public static void quickSort(int[] arr) {
        // TODO:
        int start = 0;
        int end = arr.length-1;

        sort(arr, start, end);
        System.out.println(Arrays.toString(arr));
    }

    private static int[] sort(int[] arr, int start, int end){
        int part = partition(arr,start,end);
        if (start<part-1) arr = sort(arr,start,part-1);
        if (end>part) arr = sort(arr,part,end);

        return arr;

    }
    private static int partition(int[] arr, int start, int end){
        int pivot = arr[(start + end) / 2];
        while (start<=end){
            while(arr[start]<pivot) start++;
            while(arr[end]>pivot) end--;
            if (start <= end) {
                int temp = arr[start];
                arr[start]=arr[end];
                arr[end]=temp;
                start++;
                end--;
            }
        }
        return start;
    }


}

