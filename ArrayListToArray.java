import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListToArray {
    public static void main(String[] args) {
        // ArrayList declaration and initialization
        List<String> strList = new ArrayList<>();
        strList.add("abc");
        strList.add("xyz");
        strList.add("pqr");
        strList.add("mno");

        // ArrayList to Array Conversion
        String[] strArr = new String[strList.size()];

        for (int i = 0; i < strList.size(); i++) {
            strArr[i] = strList.get(i);
        }

        // Displaying Array elements
        System.out.println(Arrays.toString(strArr));
    }
}
