public class ArrayBasics {
    public static void main(String[] args) {
        int[] anArray;      // Declares an array of integers

        anArray = new int[10];  // Allocates memory for 10 integers

        anArray[0] = 100;   // Initialize first element
        anArray[1] = 200;   // Initialize second element
        anArray[2] = 300;
        anArray[3] = 400;
        anArray[4] = 500;
        anArray[5] = 600;
        anArray[6] = 700;
        anArray[7] = 800;
        anArray[8] = 900;
        anArray[9] = 1000;

        for (int i = 0; i < anArray.length; i++) {
            System.out.println("Element at index " + i + ": " + anArray[i]);
        }
    }
}