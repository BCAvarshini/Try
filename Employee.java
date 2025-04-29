
public class Employee {

    //Fields(attributes)
    String name;
    int id;
    double salary;
    String location;

    //Constructor
    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.location = "India"; // Default location
    }

    //Method to display employee details
    public void displayInfo() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Salary: ₹" + salary);
        System.out.println("Location: " + location);
    }

    //Main method
    public static void main(String[] args) {
        //Creating an object of Employee class
        Employee emp1 = new Employee("Varshini", 101, 50000.0);

        //Calling method to display employee details
        emp1.displayInfo();

    }
}
