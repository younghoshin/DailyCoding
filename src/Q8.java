import java.util.*;
public class Q8 {
    public String convertDoubleSpaceToSingle(String str) {
        // TODO:
//        String[] word = str.split("  ");
//        return String.join(" ",word);
        String n_str = "";
        for (int i = 0; i < str.length(); i++) {
            if (i<str.length()-1&&str.charAt(i) == ' ' && str.charAt(i) == str.charAt(i + 1)) {
                i++;
            }
                n_str = n_str.concat(String.valueOf(str.charAt(i)));
        }
        return n_str;
    }
}
