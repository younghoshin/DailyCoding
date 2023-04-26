import java.util.*;

public class Q28 {
    public boolean balancedBrackets(String str) {
        // TODO:

        List<String> strStack = new ArrayList<>();
//        strStack.add(String.valueOf(str.charAt(0)));
        for (int i = 0; i <str.length() ; i++) {
            if (strStack.isEmpty()){
                strStack.add(String.valueOf(str.charAt(i)));
            }
            else {
                String checkStack = strStack.get(strStack.size() - 1);
                if (checkStack.equals("(") && str.charAt(i) == ')') {
                    strStack.remove(strStack.size() - 1);
                } else if (checkStack.equals("[") && str.charAt(i) == ']') {
                    strStack.remove(strStack.size() - 1);
                } else if (checkStack.equals("{") && str.charAt(i) == '}') {
                    strStack.remove(strStack.size() - 1);
                } else {
                    strStack.add(String.valueOf(str.charAt(i)));
                }
            }
        }

        return strStack.size()==0;


    }
}
