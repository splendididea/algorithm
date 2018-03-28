package level2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class TryHelloWorld {

    public int getMinSum(int[] A, int[] B) {
        int aMax = Arrays.stream(A).max().getAsInt();
        int aMin = Arrays.stream(A).min().getAsInt();
        int bMax = Arrays.stream(B).max().getAsInt();
        int bMin = Arrays.stream(B).min().getAsInt();
        return aMax * bMin + aMin * bMax;
    }

    public static void main(String[] args) {
        TryHelloWorld th = new TryHelloWorld();
        int[] A = {1, 2};
        int[] B = {3, 4};
        System.out.println( th.getMinSum(A, B) );
    }

}
