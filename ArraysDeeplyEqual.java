import java.util.Arrays;

public class ArraysDeeplyEqual {
    public static void main(String[] args) {
        String[] strArray1 = { "abc", "cdf", "pqr" };
        String[] strArray2 = { "abc", "cdf", "pqr" };
        System.out.println("Two Arrays Deep Equals ::  " + Arrays.deepEquals(strArray1, strArray2));
    }
}
