# Java Array : Chapter 4 Convert Array to ArrayList

## 1. Conversion using Arrays.asList()
The Arrays class of the java.util package contains several static methods that we can use to fill, sort, search, etc in arrays. This class also contains a static factory that allows arrays to be viewed as lists.

```java
import java.util.Arrays;
import java.util.List;

public class ArrayToArrayList {
    public static void main(String[] args) {
        String[] anArrayOfString = { "Agra", "Mysore", "Chandigarh", "Bhopal" };

        List<String> strList = Arrays.asList(anArrayOfString);

        System.out.println("Original ArrayList from Arrays.asList()");

        /* Display array list */
        strList.forEach(str -> System.out.println(" " + str));

        // change the array element and see the effect is propogated to list
        // also.
        anArrayOfString[0] = "Dehli";

        System.out.println("\nChange in array effect on ArrayList");

        /* Display array list */
        strList.forEach(str -> System.out.println(" " + str));
    }
}
```

<details>
<summary>Output : </summary>

```shell
 Agra
 Mysore
 Chandigarh
 Bhopal

Change in array effect on ArrayList
 Dehli
 Mysore
 Chandigarh
 Bhopal
```

</details>

```java
import java.util.Arrays;
import java.util.List;

public class ArrayToArrayList {
    public static void main(String[] args) {
        Integer anArrayOfIntegers[] = { 1, 2, 3, 4, 5, 6 };

        List<Integer> intList = Arrays.asList(anArrayOfIntegers);

        // Display array list
        intList.forEach(str -> System.out.println(" " + str));
    }
}
```

<details>
<summary>Output : </summary>

```shell
 1
 2
 3
 4
 5
 6
```

</details>


## 2. Collections.addAll method

```java
import java.util.ArrayList;
import java.util.Collections;

public class ArrayToArrayList {
    public static void main(String[] args) {
        // Array Declaretion and initialization
        final String[] array = { "abc", "xyz", "pqr", "XYZ" };

        // ArrayList declaration
        final ArrayList<String> arrayList = new ArrayList<>();

        // Conversion
        Collections.addAll(arrayList, array);

        // Adding new elements to the converted List
        arrayList.add("String1");
        arrayList.add("String2");

        // Display array list
        arrayList.forEach(element -> System.out.println(" " + element));
    }
}
```

<details>
<summary>Output : </summary>

```shell
 abc
 xyz
 pqr
 XYZ
 String1
 String2
```

</details>

```java
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayToArrayList {
    public static void main(String[] args) {
        Integer[] anArrayOfIntegers = { 1,2,3,4,5,6 };

        List<Integer> intList = new ArrayList<>();

        Collections.addAll(intList, anArrayOfIntegers);

        // Display array list
        intList.forEach(element -> System.out.println(" " + element));
    }
}
```

<details>
<summary>Output : </summary>

```shell
 1
 2
 3
 4
 5
 6
```

</details>

## 3. Conversion Manually

```java
import java.util.ArrayList;

public class ArrayToArrayList {
    public static void main(String[] args) {
        // Array Declaration and initialization
        final String[] array = { "abc", "xyz", "pqr", "XYZ" };

        // ArrayList declaration
        final ArrayList<String> arrayList = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            arrayList.add(array[i]);
        }

        // Display array list
        arrayList.forEach(element -> System.out.println(" " + element));
    }
}
```

<details>
<summary>Output : </summary>

```shell
abc
xyz
pqr
XYZ
```

</details>

```java

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
```

<details>
<summary>Output : </summary>

```shell
 1
 2
 3
 4
 5
 6
```

</details>

---