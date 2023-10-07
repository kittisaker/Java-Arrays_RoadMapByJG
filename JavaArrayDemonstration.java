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
