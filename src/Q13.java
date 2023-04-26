import java.util.*;
public class Q13 {
    public String readVertically(String[] arr) {
        // TODO:
        int max = Arrays.stream(arr)
                .mapToInt(String::length)
                .max()
                .orElse(0);
        char concat_cat=' ';
        String Vertically="";
        for (int i = 0; i <max; i++) {
            for (String el: arr) {
                if(el.length()>i) {
                    concat_cat = el.charAt(i);
                    Vertically = Vertically+concat_cat;
                }
            }
        }
        return Vertically;
    }
}
