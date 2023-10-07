import java.util.ArrayList;

public class ArrayToArrayList {
    public static void main(String[] args) {
        Integer[] anArrayOfIntegers = { 1,2,3,4,5,6 };

        // ArrayList declaration
        final ArrayList<Integer> intList = new ArrayList<>();

        for (int i = 0; i < anArrayOfIntegers.length; i++) {
            intList.add(anArrayOfIntegers[i]);
        }

        // Display all list
        intList.forEach(element -> System.out.println(" " + element));
    }
}
