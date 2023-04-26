import java.util.*;
public class Q16 {
    public boolean isIsogram(String str) {
        // TODO:
        if(str.isEmpty()){
            return  true;
        }
        String isogram = str.toUpperCase();
        for (int i = 0; i <isogram.length(); i++) {
            for (int j = i+1; j <isogram.length(); j++) {
                if(isogram.charAt(i)==isogram.charAt(j)){
                    return false;
                }
            }
        }
        return true;

    }
}
