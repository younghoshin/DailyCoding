import java.lang.reflect.Array;
import java.util.Arrays;

public class Q30 {
    public int rotatedArraySearch(int[] rotated, int target) {
        // TODO:
        int serch= (rotated.length)/2;
        if (rotated[serch]==target){
            return serch;
        }
        else if(rotated[serch]<target){
            int[] arrs =Arrays.copyOfRange(rotated,0,serch);
            rotatedArraySearch(arrs,target);
        }
        else{
            int[] arrs =Arrays.copyOfRange(rotated,serch,serch+serch/2);
            rotatedArraySearch(arrs,target);
        }

        return -1;



//        while (true){
//            if (rotated[serch]==target){
//                return serch;
//            }
//            else if(rotated[serch]>target){
//                serch =  serch/2;
//            }
//            else{
//                serch = serch+serch/2;
//            }
//        }
    }
}
