import java.util.*;

public class ClearlastBits {
    public static int ClearlastBits(int n, int i){
        int bitMask = (~0)<<i;
        return n & bitMask;
    }

    public static void main(String args[]){
        System.out.println(ClearlastBits(15, 2));
    }    
}