# Java Array : Chapter 5 Convert ArrayList to Array

## 1. Conversion using toArray() method
toArray() method returns an array containing all of the elements in this list in proper sequence (from first to the last element); the runtime type of the returned array is that of the specified array. 
If the list fits in the specified array, it is returned therein. Otherwise, a new array is allocated with the runtime type of the specified array and the size of this list.

```java
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListToArray {
    public static void main(String[] args) {
        List<String> strList = new ArrayList<>();
        strList.add("abc");
        strList.add("xyz");
        strList.add("pqr");
        strList.add("mno");

        String[] strArr = null;

        strArr = strList.toArray(new String[strList.size()]);

        System.out.println(Arrays.toString(strArr));
    }
}
```

<details>
<summary>Output : </summary>

```shell
[abc, xyz, pqr, mno]
```

</details>

## 2. The manual way of Conversion using ArrayList get() method
```java
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
```

<details>
<summary>Output : </summary>

```shell
[abc, xyz, pqr, mno]
```

</details>

---