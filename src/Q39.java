import java.util.*;
public class Q39 {
    public static void main(String[] args) {
        int[] arr = {4, 10, 3, 5, 1};

        // 최소 힙으로 만들 배열을 복사합니다.
        int[] heap = new int[arr.length + 1];
        System.arraycopy(arr, 0, heap, 1, arr.length);

        // 최소 힙을 구현합니다.
        for (int i = 2; i <= arr.length; i++) {
            int child = i;
            while (child > 1) {
                int parent = child / 2;
                if (heap[child] < heap[parent]) {
                    int temp = heap[parent];
                    heap[parent] = heap[child];
                    heap[child] = temp;
                }
                child = parent;
            }
        }

        // 최소 힙에서 값을 하나씩 꺼내어 출력합니다.
        for (int i = 1; i <= arr.length; i++) {
            System.out.print(heap[i] + " ");
        }
    }
}
