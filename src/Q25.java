import java.util.*;

public class Q25 {
    public long power(int base, int exponent) {
        // 금지된 문자열은 주석까지 확인합니다.
        // TODO:

        if (exponent == 0){
            return 1;
        }

        int half = exponent/2;
        long temp = power(base,half);
        long result = (temp*temp)%94906249;

        if (exponent%2!=0){
            return (base*result)%94906249;
        }
        else{
            return result;
        }



    }
}
