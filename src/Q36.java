public class Q36 {
    public int[] insertionSort(int[] arr) {
       for(int i =1; i<arr.length;i++){
           for (int j = i; j > 0; j--) {
               if (arr[j-1]>arr[j]){
                   int swap=arr[j-1];
                   arr[j-1]=arr[j];
                   arr[j]=swap;
               }
           }
       }
       return arr;
    }
}
