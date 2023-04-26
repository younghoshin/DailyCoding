import java.util.*;

public class Q19 {
    public String decryptCaesarCipher(String str, int secret) {
        // TODO:
        String cipher = "";
        for (int i = 0; i <str.length(); i++) {
            char at = str.charAt(i);
            if (at != ' ') {
                at = (char) (at-secret);
                if(at>=97 && at<=122){
                    cipher = cipher+at;
                }
                else{
                    at= (char) (123-(97-at));
                    cipher = cipher+at;
                }
            }
            else{
                cipher = cipher+at;
            }
        }
        return cipher;

    }
}
