import java.util.*;
public class Q10 {
    public String insertDash(String str) {
        // TODO:
        if(str.isEmpty()){
            return null;
        }
        String concat = ""+str.charAt(0);

        for (int i = 1; i < str.length(); i++) {
            int str_frist= Character.getNumericValue(str.charAt(i-1));
            int str_second=Character.getNumericValue(str.charAt(i));
            if (str_frist%2!= 0 &&  str_second%2!= 0){
                concat = concat + "-";

            }
            concat=concat+str.charAt(i);

        }
        return concat;
    }

}
