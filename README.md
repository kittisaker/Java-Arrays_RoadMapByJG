# Java Array : Chapter 1 Java Array Basics Guide

## Declaring a Variable to Refer to an Array
* An array's type is written as type[], where type is the data type of the contained elements; the brackets are special symbols indicating that this variable holds an array. The size of the array is not part of its type (which is why the brackets are empty).
* A variable like from above program anArray is variable, the declaration does not actually create an array; it simply tells the compiler that this variable will hold an array of the specified type.

Few more examples for declaring an Array.
```java
byte[] anArrayOfBytes;
short[] anArrayOfShorts;
long[] anArrayOfLongs;
float[] anArrayOfFloats;
double[] anArrayOfDoubles;
boolean[] anArrayOfBooleans;
char[] anArrayOfChars;
String[] anArrayOfStrings;
Employee[] anArrayOfEmployees;
Student[] anArrayOfStudent;
Object[] anArrayOfObjects;

// You can also place the brackets after the array's name:
float anArrayOfFloats[];
```

## Creating an Array
One way to create an array is with the new operator.
```java
// Ex. : create an array of integers
int[] anArray = new int[10];
```

## Initializing Array with Elements

### Initialize Integer Array Example
```java
// Ex. : initialize primitive one dimensional array
int[] anArray = new int[5];

anArray[0] = 10; // initialize first element
anArray[1] = 20; // initialize second element
```

### Initialize String Array Example
```java
// Ex. : initialize Object one dimensional array
String[] anArrayOfStrings = new String[5];
anArrayOfStrings[0] = "abc"; // initialize first element
anArrayOfStrings[1] = "xyz"; // initialize second element
```

### Initialize Employee Array Example

```java
Employee[] anArrayOfEmployees = new Employee[2];
anArrayOfEmployees[0] = new Employee(10, "ramesh");
anArrayOfEmployees[1] = new Employee(11, "john");

class Employee {
        private int id;
        private String name;

        public int getId() {
                return id;
        }

        public void setId(int id) {
                this.id = id;
        }

        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }

        public Employee(int id, String name) {
                super();
                this.id = id;
                this.name = name;
        }
}
```

## Accessing an Array

### Accessing Integer Array Example
```java
// initialize primitive one dimensional array
int[] anArray = new int[3];

anArray[0] = 10; // initialize first element
anArray[1] = 20; // initialize second element
anArray[2] = 30; 

// Each array element is accessed by its numerical index:
System.out.println("Element 1 at index 0: " + anArray[0]);
System.out.println("Element 2 at index 1: " + anArray[1]);
System.out.println("Element 3 at index 2: " + anArray[2]);
```

<details>
<summary>Output : </summary>

```shell
Element 1 at index 0: 10
Element 2 at index 1: 20
Element 3 at index 2: 30
```

</details>

### Accessing String Array Example
```java
// initialize Object one dimensional array
String[] anArrayOfStrings = new String[3];
anArrayOfStrings[0] = "abc"; // initialize first element
anArrayOfStrings[1] = "xyz"; // initialize second element
anArrayOfStrings[2] = "name";

// Each array element is accessed by its numerical index:
System.out.println("Element 1 at index 0: " + anArrayOfStrings[0]);
System.out.println("Element 2 at index 1: " + anArrayOfStrings[1]);
System.out.println("Element 3 at index 2: " + anArrayOfStrings[2]);
```

<details>
<summary>Output : </summary>

```shell
Element 1 at index 0: abc
Element 2 at index 1: xyz
Element 3 at index 2: name
```

</details>

### Accessing Employee Array Example
```java
Employee[] anArrayOfEmployees = new Employee[2];
anArrayOfEmployees[0] = new Employee(10, "ramesh");
anArrayOfEmployees[1] = new Employee(11, "john");

// Each array element is accessed by its numerical index:
System.out.println("Element 1 at index 0: " + anArrayOfEmployees[0].getName());
System.out.println("Element 2 at index 1: " + anArrayOfEmployees[1].getName());

class Employee {
    private int id;
    private String name;

    public int getId() {
            return id;
    }

    public void setId(int id) {
            this.id = id;
    }

    public String getName() {
            return name;
    }

    public void setName(String name) {
            this.name = name;
    }

    public Employee(int id, String name) {
            super();
            this.id = id;
            this.name = name;
    }
}
```

<details>
<summary>Output : </summary>

```shell
Element 1 at index 0: ramesh
Element 2 at index 1: john
```

</details>

## Shortcut Syntax to Create and Initialize an Array
```java
// shortcut syntax to create and initialize an array
int[] array = { 100, 200, 300, 400, 500, 600, 700, 800, 900, 1000 };
// Each array element is accessed by its numerical index:
System.out.println("Element 1 at index 0: " + array[0]);
System.out.println("Element 2 at index 1: " + array[1]);
System.out.println("Element 3 at index 2: " + array[2]);
```

<details>
<summary>Output : </summary>

```shell
Element 1 at index 0: 100
Element 2 at index 1: 200
Element 3 at index 2: 300
```

</details>

```java
// shortcut syntax to create and initialize an array
String[] arrayOfStrings = {"abc", "xyz", "name", "address", "id"};
// Each array element is accessed by its numerical index:
System.out.println("Element 1 at index 0: " + arrayOfStrings[0]);
System.out.println("Element 2 at index 1: " + arrayOfStrings[1]);
System.out.println("Element 3 at index 2: " + arrayOfStrings[2]);
```

<details>
<summary>Output : </summary>

```shell
Element 1 at index 0: abc
Element 2 at index 1: xyz
Element 3 at index 2: name
```

</details>

```java
// shortcut syntax to create and initialize an array
Employee[] employees = {new Employee(10, "ramesh"),new Employee(11, "john")};
// Each array element is accessed by its numerical index:
System.out.println("Element 1 at index 0: " + employees[0].getName());
System.out.println("Element 2 at index 1: " + employees[1].getName());
```

<details>
<summary>Output : </summary>

```shell
Element 1 at index 0: ramesh
Element 2 at index 1: john
```

</details>

## Complete Array Basics Source Code Example

```java
public class Employee {
    private int id;
    private String name;
    
    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
```

```java
public class JavaArrayDemonstration {
    public static void main(String[] args) {

        Employee[] anArrayOfEmployees = new Employee[2];
        anArrayOfEmployees[0] = new Employee(10, "kope");
        anArrayOfEmployees[1] = new Employee(11, "Mei");
        // Each array element is accessed by its numerical index:
        System.out.println("Element 1 at index 0: " + anArrayOfEmployees[0].getName());
        System.out.println("Element 2 at index 1: " + anArrayOfEmployees[1].getName());

        // shortcut syntax to create and initialize an array
        Employee[] employees = {new Employee(12, "A"), new Employee(13, "B")};
        // Each array element is accessed by its numerical index:
        System.out.println("Element 1 at index 0: " + employees[0].getName());
        System.out.println("Element 2 at index 1: " + employees[1].getName());
    }
}
```

<details>
<summary>Output : </summary>

```shell
Element 1 at index 0: kope
Element 2 at index 1: Mei
Element 1 at index 0: A
Element 2 at index 1: B
```

</details>

---

## Exercise

### Sum

```shell
runningSum[i] = sum(nums[0]...nums[i]);
Input: nums = [3, 1, 2, 10, 1]
Output: [3, 4, 6, 16, 17]
```

<details>
<summary>Solution 1 : </summary>

```shell
package Exercise;
// runningSum[i] = sum(nums[0]...nums[i]);
// Input: nums = [3, 1, 2, 10, 1]
// Output: [3, 4, 6, 16, 17]
public class Solution {
    public static int[] runningSum(int[] nums){
        int[] results = new int[nums.length];
        results[0] = nums[0];

        for (int i = 1; i < results.length; i++) {
            results[i] = nums[i] + results[i-1];
        }

        return results;
    }

    public static void main(String[] args) {
        int[] nums = {3, 1, 2, 10, 1};

        int[] answers = runningSum(nums);


        for (int i = 0; i < answers.length; i++) {
            System.out.print(answers[i] + " ");
        }
    }
}
```

</details>

<details>
<summary>Solution 2 : </summary>

```shell
package Exercise;
// runningSum[i] = sum(nums[0]...nums[i]);
// Input: nums = [3, 1, 2, 10, 1]
// Output: [3, 4, 6, 16, 17]
public class Solution {
    public static int[] runningSum(int[] nums){
        for (int i = 1; i < nums.length; i++) {
            nums[i] = nums[i] + nums[i - 1];
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {3, 1, 2, 10, 1};

        int[] answers = runningSum(nums);

        for (int i = 0; i < answers.length; i++) {
            System.out.print(answers[i] + " ");
        }
    }
}
```

</details>

---