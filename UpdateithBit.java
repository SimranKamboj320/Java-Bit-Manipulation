import java.util.*;

public class UpdateithBit {

    public static int ClearithBit(int n, int i){
        int bitMask = ~(1 << i);
        return n & bitMask;
    }

    public static int SetithBit(int n, int i){
        int bitMask = (1 << i);
        return n | bitMask;
    }

    public static int UpdateithBit(int n, int i, int newBit){
        if(newBit == 0) {
            return ClearithBit(n, i);
        } else {
            return SetithBit(n, i);
        }
    }

    public static void main(String args[]){
        // Correct the call to UpdateithBit by providing the third argument for newBit
        System.out.println(UpdateithBit(10, 2, 1));  // Example: setting the 2nd bit to 1
        System.out.println(UpdateithBit(10, 2, 0));  // Example: clearing the 2nd bit
    }    
}
