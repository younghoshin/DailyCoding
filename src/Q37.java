import java.util.*;
public class Q37 {
    public int[] radixSort(int[] arr) {
        // TODO:
        int maxDigit = String.valueOf(Arrays.stream(arr).max().getAsInt()).length();

        // 10개의 버킷을 만듭니다.
        List<Integer>[] buckets = new ArrayList[10];
        for (int i = 0; i < 10; i++) {
            buckets[i] = new ArrayList<>();
        }

        for (int digit = 0; digit < maxDigit; digit++) {
            for (int num : arr) {
                // 자리수를 추출합니다.
                int digitVal = num / (int) Math.pow(10, digit) % 10;
                // 해당 자리수의 버킷에 데이터를 추가합니다.
                buckets[digitVal].add(num);
            }

            // 버킷에 있는 데이터를 순서대로 다시 배열합니다.
            int index = 0;
            for (List<Integer> bucket : buckets) {
                for (int num : bucket) {
                    arr[index++] = num;
                }
                bucket.clear();
            }
        }
        return arr;
    }
}
