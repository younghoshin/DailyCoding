import java.util.Arrays;

public class Q49 {
    public int LIS(int[] arr) {
        // TODO: 오름차순을 가지는 배열중에 가장 긴 길이를 가지는 배열의 길이를 리턴

        int[] newArr = new int[arr.length];
        //자기자신의 길이는 1이므로 배열의 모든 요소는 기본적으로 1을가진다.
        newArr=Arrays.stream(newArr).map(m->1).toArray();

        //두번째 배열부터 검색하면됨 i번째까지 검색함.
        for (int i = 1; i <newArr.length ; i++) {

            //j번째가 가지는 배열의 길이를 검색함 만약 j번째가 i번쨰 보다 작다면 오름 차순이 성립하기 때문에 이후에 현재 i가 가지는 길이가
            //현재의 j번째+1(i가 j보다 크기때문에 오름차순에 +1해야되기때문)보다 작다면 i가 가지는 길이가 갱신되야하기 때문에 갱신함
            //즉 각 j번쨰가 가지는 배열의 길이 값은 j까지의 오름차순을 가지는 배열의 가장 큰 값을 가지기 때문에 가능함
            for (int j = 0; j <i; j++) {
                if (arr[i]>arr[j] && newArr[i]<newArr[j]+1){
                    newArr[i]=newArr[j]+1;
                }
            }
        }

        return Arrays.stream(newArr).max().orElse(0);

    }
}
