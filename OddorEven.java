import java.util.*;

public class OddorEven {
    public static void OddorEven(int n){
        int bitMask = 1;
        if((n & bitMask)==0) {
            System.out.println("Even number");
        }else{
            System.out.println("Odd number");
        }
    }

    public static void main(String args[]){
        OddorEven(3);
        OddorEven(4);
        OddorEven(7);
    }
}