import java.util.*;

public class Q11 {
    public String[] removeExtremes(String[] arr) {
        // TODO:
        if(arr.length==0){
            return null;
        }
        int longs= Arrays.stream(arr)
                .mapToInt(String::length)
                .max().orElse(0);
        int sorter= Arrays.stream(arr)
                .mapToInt(String::length)
                .min().orElse(0);

        
        // for (String value : arr) {
        //     if (longs <= value.length()) {
        //         longs = value.length();
        //     } else if (sorter >= value.length()) {
        //         sorter = value.length();
        //     }
        // }


        int long_idx=0;
        int sorter_idx=0;
        String[] result = new String[0];

        for (int i =0; i< arr.length;i++) {
            if (arr[i].length()==longs) {
                long_idx=i;
            }
            if (arr[i].length()==sorter) {
                sorter_idx=i;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if(i!=long_idx&&i!=sorter_idx){
                result = Arrays.copyOf(result, result.length + 1);
                result[result.length - 1] = arr[i];
            }
        }


        return result;
    }
}
