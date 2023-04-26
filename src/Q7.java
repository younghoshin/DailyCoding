import java.util.*;
import java.util.stream.Collectors;

public class Q7 {
    public HashMap<String, String> convertListToHashMap(String[][] arr) {
        // TODO:
        if(arr.length == 0){
            return new HashMap<>();
        }
        HashMap<String, String> hashMap = new HashMap<>();

        for(int i = 0; i < arr.length; i++) {
            if(arr[i].length != 0) {
                if(hashMap.containsKey(arr[i][0])) {
                    continue;
                }
                hashMap.put(arr[i][0], arr[i][1]);
            }
        }
        return hashMap;
    }
}
