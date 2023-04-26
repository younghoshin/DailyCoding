import java.util.*;
public class Q9 {
    public boolean ABCheck(String str) {
        // TODO:
        str = str.toLowerCase();
       for(int i = 0; i<str.length()-5;i++) {
           if (str.charAt(i) == 'a' && str.charAt(i+4) == 'b'
                   || str.charAt(i) == 'b' && str.charAt(str.length() - 4) == 'a') {
               return true;
           }
       }
       return false;
    }
}
