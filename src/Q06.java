import java.util.*;

public class Q06 {
    public String letterCapitalize(String str) {
        // TODO:
        if(str.isEmpty()){
            return "";
        }

        String[] word = str.split(" ");
        String concat_str="";

        for(int i=0; i<word.length;i++){
            if (word[i].isEmpty()){
                word[i]=word[i];
            }
            word[i]= String.valueOf(word[i].charAt(0)).toUpperCase()
                    .concat(word[i].substring(1));
        }
        concat_str = String.join(" ",word);
        return concat_str;


    }

}
