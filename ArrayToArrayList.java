import java.util.Arrays;
import java.util.List;

public class ArrayToArrayList {
    public static void main(String[] args) {
        String anArrayOfStrings[] = { "Agra", "Mysore", "Chandigarh", "Bhopal" };

        List<String> strList = Arrays.asList(anArrayOfStrings);

        // Display array list
        strList.forEach(str -> System.out.println(" " + str));
    }
}
