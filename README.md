# Java Array : Chapter 3 Copying Arrays in Java

## 1. Copying Arrays using Built-in System.arraycopy() Method

```java
public static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length)
```
Parameters :
* src    : the source array.
* srcPos : starting position in the source array.
* dest : the destination array.
* destPos : starting position in the destination data.
* length : the number of array elements to be copied.
Throws:
* IndexOutOfBoundsException : if copying would cause access of data outside array bounds.
* ArrayStoreException : if an element in the src array could not be stored into the dest array because of a type mismatch.
* NullPointerException - if either src or dest is null.

```java
public class ArrayCopyDemo {
    public static void main(String[] args) {
        char[] copyFrom = { 'd', 'e', 'c', 'a', 'f', 'f', 'e', 'i', 'n', 'a', 't', 'e', 'd' };
        char[] copyTo = new char[7];

        System.arraycopy(copyFrom, 2, copyTo, 0, 7);
        System.out.println(new String(copyTo));
    }
}
```

<details>
<summary>Output : </summary>

```shell
caffein
```

</details>

```java
import java.util.Arrays;

public class JavaArrayCopyExample {
    public static void main(String[] args) {
        int[] source = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("Source array = " + Arrays.toString(source));

        int[] temp = new int[5];
        System.arraycopy(source, 0, temp, 0, 5);

        System.out.println("Copy First five elements of array. Result array = " + Arrays.toString(temp));
    }
}
```

<details>
<summary>Output : </summary>

```shell
Source array = [1, 2, 3, 4, 5, 6, 7, 8, 9]
Copy First five elements of array. Result array = [1, 2, 3, 4, 5]
```

</details>

## 2. Copying Arrays Using Arrays.copyOf() Method
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

## 3. Copying Arrays using Object.clone() method
```java
import java.util.Arrays;

public class JavaArrayCopyExample {
    public static void main(String[] args) {
        int[] source = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("Source array = " + Arrays.toString(source));

        int[] dest = source.clone();
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

## 4. Copying Arrays using Arrays.copyOfRange()
```java
import java.util.Arrays;

public class JavaArrayCopyExample {
    public static void main(String[] args) {
        int[] source = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("Source array = " + Arrays.toString(source));

        int[] dest = Arrays.copyOfRange(source, source.length - 3, source.length);
        System.out.println("Copy First five elements of array. Result array = " + Arrays.toString(dest));
    }
}
```

<details>
<summary>Output : </summary>

```shell
Source array = [1, 2, 3, 4, 5, 6, 7, 8, 9]
Copy First five elements of array. Result array = [7, 8, 9]
```

</details>

---