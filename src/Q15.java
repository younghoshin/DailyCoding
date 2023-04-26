import java.util.*;
public class Q15 {
    public Integer modulo(int num1, int num2) {
//        if(num2 == 0 ){
//            return null;
//        }
//        int modul = 0;
//        if(num1 == 0){
//            return num1;
//        }
//        else if(num1<num2){
//            return num1;
//        }
//        else {
//            modul=modulo(num1-num2,num2);
//        }
//            return modul;
        if(num2 == 0){
            return null;
        }
        while (num1>=num2){
            num1=num1-num2;
        }
        return num1;
    }
}
