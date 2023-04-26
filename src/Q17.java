import java.util.*;

public class Q17 {
    public String computeSquareRoot(int num) {
        // TODO:
        double basecount = 1;
        double count = 1;
        String result="";
        while(count > 0.0001) {
            while (basecount * basecount < num) {
                basecount = basecount + count;
            }
//              Math.floor(basecount * basecount*100)/100
            if (Math.round(basecount * basecount*100)/100.0 == num) {
                result = String.format("%.2f", basecount);
                break;
            } else {
                basecount = basecount - count;
                count *= 0.1;
            }
        }
        return result;
    }
}
