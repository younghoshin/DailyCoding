import java.util.*;
import java.util.stream.Collectors;
public class Q24 {
    public boolean isSubsetOf(int[] base, int[] sample) {
        // TODO:
        int count=0;
        for (int e: sample) {
            for (int b: base) {
                if(e==b){
                    count++;
                    break;
                }
            }
        }
        
        return count==sample.length;
    }
}
