import java.util.Arrays;

public class JavaArrayCopyExample {
    public static void main(String[] args) {
        int[] source = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("Source array = " + Arrays.toString(source));

        int[] dest = Arrays.copyOf(source, source.length);
        System.out.println("Copy First five elements of array. Result array = " + Arrays.toString(dest));
    }
}