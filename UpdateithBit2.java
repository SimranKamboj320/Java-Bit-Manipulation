import java.util.*;

public class UpdateithBit2 {

    public static int ClearithBit(int n, int i){
        int bitMask = ~(1 << i);
        return n & bitMask;
    }

    public static int UpdateithBit2(int n, int i, int newBit){
        n = ClearithBit(n, i);
        int BitMask = newBit<<i;
        return n | BitMask;
    }

    public static void main(String args[]){
        // Correct the call to UpdateithBit by providing the third argument for newBit
        System.out.println(UpdateithBit2(10, 2, 1));  // Example: setting the 2nd bit to 1
        System.out.println(UpdateithBit2(10, 2, 0));  // Example: clearing the 2nd bit
    }    
}
