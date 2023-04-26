import java.util.ArrayList;

public class Q18 {
    public int numberSearch(String str) {
        // TODO:
        double sum = 0;
        int searchLen = str.length();
        ArrayList<Character> el = new ArrayList<>();
        for (int i = 0; i <str.length(); i++) {
            el.add(str.charAt(i));
        }

        for (char st : el) {
            if (st>=48&&st<=57) {
                sum = sum+(st-'0');
                searchLen--;
            }
            else if(st==' '){
                searchLen--;
            }
        }

        double res = sum/searchLen;
        return (int) Math.round((res*10)/10);


    }
}
