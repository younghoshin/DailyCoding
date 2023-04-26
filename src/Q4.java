import java.util.*;
public class Q4 {
    public String firstCharacter(String str) {
        // TODO:
        String first_concat="";
        StringTokenizer st = new StringTokenizer(str," ");
        while(st.hasMoreTokens()){
            first_concat = first_concat.concat(String.valueOf(st.nextToken().charAt(0)));
        }
        return first_concat;
    }
}
