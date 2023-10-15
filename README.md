# Java Array : Chapter 2 Two Dimensional Array in Java

## Two Dimensional Array Simple Example
```java
public class MultiDimArrayDemo {
    public static void main(String[] args) {
        String[][] names = {
            {"Mr. ", "Mrs. ", "Ms. "},
            {"Smith", "Jones"}
        };

        // Mr. Smith
        System.out.println(
            names[0][0] +
            names[1][0]
        );

        // Ms. Jones
        System.out.println(
            names[0][2] +
            names[1][1]
        );

        System.out.println("Size : " + names.length);
    }
}
```

<details>
<summary>Output : </summary>

```shell
Mr. Smith
Ms. Jones
Size : 2
```

</details>

## Java Two Dimensional Array of primitive type
```java
// an array of int arrays of 2 row and 3 columns
int[][] twoDimArray = new int[2][3];
for (int i = 0; i < twoDimArray.length; i++) {
    for (int j = 0; j < twoDimArray[i].length; j++) {
        twoDimArray[i][j] = j;
        System.out.print(twoDimArray[i][j] + " ");
    }
    System.out.println("");
}
```

<details>
<summary>Output : </summary>

```shell
0 1 2 
0 1 2
```

</details>

## Java Two Dimensional Array of Objects
```java
// an array of String arrays of 3 rows and 4 columns
String[][] arrStr = new String[3][4];
for (int i = 0; i < arrStr.length; i++) {
    for (int j = 0; j < arrStr[i].length; j++) {
        arrStr[i][j] = "Str" + j;
        System.out.print(arrStr[i][j] + " ");
    }
    System.out.println("");
}
```

<details>
<summary>Output : </summary>

```shell
Str0 Str1 Str2 Str3 
Str0 Str1 Str2 Str3 
Str0 Str1 Str2 Str3
```

</details>

## Shortcut Syntax to Create and Initialize a Two Dimensional Array
```java
// creating and initializing two dimensional int array with shortcut
// syntax
int[][] arrInt = { { 1, 2, 3 }, { 3, 4, 5 } };
for (int i = 0; i < arrInt.length; i++) {
        for (int j = 0; j < arrInt[i].length; j++) {
        System.out.print(arrInt[i][j] + " ");
    }
    System.out.println("");
}
```

## Complete Two Dimensional Array Source Code Example

```java
public class TwoDimentionalArray {
    public static void main(String[] args) {

        // an array of int arrays of 2 row and 3 columns
        int[][] twoDimArray = new int[2][3];
        for (int i = 0; i < twoDimArray.length; i++) {
            for (int j = 0; j < twoDimArray[i].length; j++) {
                twoDimArray[i][j] = j;
                System.out.print(twoDimArray[i][j] + " ");
            }
            System.out.println("");
        }

        // an array of String arrays of 3 rows and 4 columns
        String[][] arrStr = new String[3][4];
        for (int i = 0; i < arrStr.length; i++) {
            for (int j = 0; j < arrStr[i].length; j++) {
                arrStr[i][j] = "Str" + j;
                System.out.print(arrStr[i][j] + " ");
            }
            System.out.println("");
        }

        // creating and initializing two dimensional int array with shortcut
        // syntax
        int[][] arrInt = { { 1, 2, 3 }, { 3, 4, 5 } };
        for (int i = 0; i < arrInt.length; i++) {
            for (int j = 0; j < arrInt[i].length; j++) {
                System.out.print(arrInt[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
```

<details>
<summary>Output : </summary>

```shell
0 1 2 
0 1 2
Str0 Str1 Str2 Str3
Str0 Str1 Str2 Str3
Str0 Str1 Str2 Str3
1 2 3
3 4 5
```

</details>

---

## Exercise

### Sum

```shell
Input: accounts = [ [7, 1, 3], [2, 8, 7], [1, 9, 5] ]
Output: 17
```

<details>
<summary>Solution 1 : </summary>

```shell
package Exercise;
// int maximumWealth(int[][] accounts)
// Input: accounts = [ [7, 1, 3], [2, 8, 7], [1, 9, 5] ]
// Output: 17

public class Solution {
    public static int maximumWealth(int[][] accounts){
        int maxWealthSoFar = 0;

        for (int[] customer : accounts) {
            int currentCustomerWealth = 0;

            for (int bank : customer) {
                currentCustomerWealth += bank;
            }

            maxWealthSoFar = Math.max(maxWealthSoFar, currentCustomerWealth);
        }

        return maxWealthSoFar;        
    }

    public static void main(String[] args) {
        int[][] accounts = {
            {7, 1, 3},
            {2, 8, 7},
            {1, 9, 5}
        };

        int maxWealth = maximumWealth(accounts);
        System.out.println("Maximum wealth: " + maxWealth);
    }
}
```

---