# Java Array : Chapter 6 java.util.Arrays Class API Guide

## java.util.Arrays Class APIs or Methods
java.util.Arrays class provides lot's of methods but in this guide, we cover frequently used and important Arrays class methods.

### 1. Convert Array to List
* static List asList(T... a) : Returns a fixed-size list backed by the specified array.
```java
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
```

<details>
<summary>Output : </summary>

```shell
 Agra
 Mysore
 Chandigarh
 Bhopal
```

</details>

### 2. Searching an Array
Arrays class provides many overloaded search() methods to search the specified array for the specified object using the binary search algorithm.
* static int binarySearch(byte[] a, byte key) : Searches the specified array of bytes for the specified value using the binary search algorithm.
* static int binarySearch(char[] a, char key) : Searches the specified array of chars for the specified value using the binary search algorithm.
* static int binarySearch(double[] a, double key) : Searches the specified array of doubles for the specified value using the binary search algorithm.
* static int binarySearch(float[] a, float key) : Searches the specified array of floats for the specified value using the binary search algorithm.
* static int binarySearch(int[] a, int key) : Searches the specified array of ints for the specified value using the binary search algorithm.
* static int binarySearch(long[] a, long key) : Searches the specified array of longs for the specified value using the binary search algorithm.
* static int binarySearch(Object[] a, Object key) : Searches the specified array for the specified object using the binary search algorithm.
* static int binarySearch(short[] a, short key) : Searches the specified array of shorts for the specified value using the binary search algorithm.
* static int binarySearch(T[] a, T key, Comparator<? super T> c) : Searches the specified array for the specified object using the binary search algorithm.

```java
import java.util.Arrays;

public class ArraysJavaUtilClass {
    public static void main(String[] args) {
        // Searches the specified array for the specified String using the binary search algorithm.
        final String key = "abc";
        String[] strArray = { "abc", "cdf", "pqr" };
        int index = Arrays.binarySearch(strArray, key);
        System.out.println(" String key found at index : " + index);

        // Searches the specified array of ints for the specified value using the binary search algorithm.
        int[] intArray = { 1, 2, 3, 4 };
        index = Arrays.binarySearch(intArray, 3);
        System.out.println(" String key found at index : " + index);

        // Searches the specified array of bytes for the specified value using the binary search algorithm.
        byte k =1;
        byte[] byteArray = { 1, 2, 3, 4, 5 };
        System.out.println(" String key found at index : " + Arrays.binarySearch(byteArray, k));

        // Searches the specified array of chars for the specified value using the binary search algorithm.
        char charKey = 'a';
        char[] charArray = { 'a', 'b', 'c' };
        System.out.println(" String key found at index : " + Arrays.binarySearch(charArray, charKey));

        // Searches the specified array of doubles for the specified value using the binary search algorithm.
        double[] doubleArray = { 0.1, 0.2, 0.3 };
        System.out.println(" String key found at index : " + Arrays.binarySearch(doubleArray, 0.2));

        // Searches the specified array of longs for the specified value using the binary search algorithm.
        long[] longArray = { 1, 2, 3, 4, 5 };
        System.out.println(" String key found at index : " + Arrays.binarySearch(longArray, 1));

        // Searches the specified array of floats for the specified value using the binary search algorithm
        float[] floatArray = { 1, 2, 3, 4, 5 };
        System.out.println(" String key found at index : " + Arrays.binarySearch(floatArray, 2));
    }
}
```

<details>
<summary>Output : </summary>

```shell
 String key found at index : 0
 String key found at index : 2
 String key found at index : 0
 String key found at index : 0
 String key found at index : 1
 String key found at index : 0
 String key found at index : 1
```

</details>


### 3. Copies an Array
* static int[] copyOf(int[] original, int newLength) : Copies the specified array, truncating or padding with zeros (if necessary) so the copy has the specified length.

```java
import java.util.Arrays;

public class JavaArrayCopyExample {
    public static void main(String[] args) {
        int[] source = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("Source array = " + Arrays.toString(source));

        int[] dest = Arrays.copyOf(source, source.length);
        System.out.println("Copy First five elements of array. Result array = " + Arrays.toString(dest));
    }
}
```

<details>
<summary>Output : </summary>

```shell
Source array = [1, 2, 3, 4, 5, 6, 7, 8, 9]
Copy First five elements of array. Result array = [1, 2, 3, 4, 5, 6, 7, 8, 9]
```

</details>

### 4. Check Two Arrays are Deeply equal
* static boolean deepEquals(Object[] a1, Object[] a2) : Returns true if the two specified arrays are deeply equal to one another.

```java
import java.util.Arrays;

public class ArraysDeeplyEqual {
    public static void main(String[] args) {
        String[] strArray1 = { "abc", "cdf", "pqr" };
        String[] strArray2 = { "abc", "cdf", "pqr" };
        System.out.println("Two Arrays Deep Equals ::  " + Arrays.deepEquals(strArray1, strArray2));
    }
}
```

<details>
<summary>Output : </summary>

```shell
Two Arrays Deep Equals ::  true
```

</details>

### 5. Filling values in an Array
* static void fill(int[] a, int val) : Assigns the specified int value to each element of the specified array of ints.

```java
import java.util.Arrays;

public class ArraysJavaUtilClass {
    public static void main(String[] args) {
        // Assigns the specified int value to each element of the specified array of ints.
        int[] fillArray = new int[5];

        System.out.printf("fillArray (before): %s\n", Arrays.toString(fillArray));
        Arrays.fill(fillArray, 1);
        System.out.printf("fillArray (after): %s", Arrays.toString(fillArray));
    }
}
```

<details>
<summary>Output : </summary>

```shell
fillArray (before): [0, 0, 0, 0, 0]
fillArray (after): [1, 1, 1, 1, 1]
```

</details>

### 6. Sorting an Array
* static void sort(byte[] a) : Sorts the specified array into ascending numerical order.
* static void sort(byte[] a, int fromIndex, int toIndex) : Sorts the specified range of the array into ascending order.
* static void sort(char[] a) : Sorts the specified array into ascending numerical order.
* static void sort(char[] a, int fromIndex, int toIndex) : Sorts the specified range of the array into ascending order.
* static void sort(double[] a) : Sorts the specified array into ascending numerical order.
* static void sort(double[] a, int fromIndex, int toIndex) : Sorts the specified range of the array into ascending order.
* static void sort(float[] a) : Sorts the specified array into ascending numerical order.
* static void sort(float[] a, int fromIndex, int toIndex) : Sorts the specified range of the array into ascending order.
* static void sort(int[] a) : Sorts the specified array into ascending numerical order.
* static void sort(int[] a, int fromIndex, int toIndex) : Sorts the specified range of the array into ascending order.
* static void sort(long[] a) : Sorts the specified array into ascending numerical order.
* static void sort(long[] a, int fromIndex, int toIndex) : Sorts the specified range of the array into ascending order.
* static void sort(Object[] a) : Sorts the specified array of objects into ascending order, according to the natural ordering of its elements.
* static void sort(Object[] a, int fromIndex, int toIndex) : Sorts the specified range of the specified array of objects into ascending order, according to the natural ordering of its elements.
* static void sort(short[] a) : Sorts the specified array into ascending numerical order.
* static void sort(short[] a, int fromIndex, int toIndex) : Sorts the specified range of the array into ascending order.
* static void sort(T[] a, Comparator<? super T> c) : Sorts the specified array of objects according to the order induced by the specified comparator.
* static void sort(T[] a, int fromIndex, int toIndex, Comparator<? super T> c) : Sorts the specified range of the specified array of objects according to the order induced by the specified comparator.

```java
import java.util.Arrays;

public class ArraysJavaUtilClass {
    public static void main(String[] args) {
        // Sorts the specified array into ascending numerical order.
        int[] intArray = { 3, 1, 2, 4 };
        System.out.println("Original Array : " + Arrays.toString(intArray));
        Arrays.sort(intArray);
        System.out.println("Sorted Array : " + Arrays.toString(intArray));
    }
}
```

<details>
<summary>Output : </summary>

```shell
Original Array : [3, 1, 2, 4]
Sorted Array : [1, 2, 3, 4]
```

</details>

### Sorting String Example
```java
import java.util.Arrays;

public class ArraysJavaUtilClass {
    public static void main(String[] args) {
        String[] strArray = { "cdf", "abc", "pqr" };
        System.out.println("Original Array : " + Arrays.toString(strArray));
        Arrays.sort(strArray);
        System.out.println("Sorted Array : " + Arrays.toString(strArray));
    }
}
```

<details>
<summary>Output : </summary>

```shell
Original Array : [cdf, abc, pqr]
Sorted Array : [abc, cdf, pqr]
```

</details>

### Sorting Dates Example
```java
import java.time.LocalDate;
import java.util.Arrays;

public class ArraysJavaUtilClass {
    public static void main(String[] args) {
        LocalDate[] dates = { LocalDate.now(), LocalDate.of(2017, 12, 12) };
        System.out.println("Original Array : " + Arrays.toString(dates));
        Arrays.sort(dates);
        System.out.println("Sorted Array : " + Arrays.toString(dates));
    }
}
```

<details>
<summary>Output : </summary>

```shell
Original Array : [2023-10-08, 2017-12-12]
Sorted Array : [2017-12-12, 2023-10-08]
```

</details>

### 7. String Representation of an Array
* static String toString(boolean[] a) : Returns a string representation of the contents of the specified array.
* static String toString(byte[] a) : Returns a string representation of the contents of the specified array.
* static String toString(char[] a) : Returns a string representation of the contents of the specified array.
* static String toString(double[] a) : Returns a string representation of the contents of the specified array.
* static String toString(float[] a) : Returns a string representation of the contents of the specified array.
* static String toString(int[] a) : Returns a string representation of the contents of the specified array.
* static String toString(long[] a) : Returns a string representation of the contents of the specified array.
* static String toString(Object[] a) : Returns a string representation of the contents of the specified array.
* static String toString(short[] a) : Returns a string representation of the contents of the specified array.

```java
import java.util.Arrays;

public class ArraysJavaUtilClass {
    public static void main(String[] args) {
        // Sorts the specified array into ascending numerical order.
        int[] intArray = { 3, 1, 2, 4 };
        System.out.println(" int Array toString : " + Arrays.toString(intArray));
    }
}
```

<details>
<summary>Output : </summary>

```shell
 int Array toString : [3, 1, 2, 4]
```

</details>

---