import java.util.*;
public class Q20 {
    public String compressString(String str) {
        // TODO:
        if (str.isEmpty()) return "";
        char check = str.charAt(0);
        int count = 0;
        String compressStr = "";

        for (int i = 0; i <str.length() ; i++) {
            char firstChar = str.charAt(i);
            if (firstChar == check){
                count++;
            }
            else if(count >=3){
                compressStr =compressStr+count+check;
                count = 1;
                check = firstChar;
            }
            else if(count < 3){
                for (int j = 0; j < count ; j++) {
                    compressStr = compressStr + check;
                }
                count = 1;
                check = firstChar;

            }

            if(i == str.length()-1){
                if(count < 3) {
                    for (int j = 0; j < count; j++) {
                        compressStr = compressStr + check;
                    }
                }
                else {
                    compressStr =compressStr+count+check;
                }
            }
        }

        return compressStr;

    }
}
