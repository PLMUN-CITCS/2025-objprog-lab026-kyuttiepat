// Define the Student class
class Student {
    // Private instance variables (attributes)
    private String name;
    private int id;
    private double gpa;

    // Static variable to track the total number of students
    private static int studentCount = 0;

    // Constructor to initialize the name, id, and GPA
    public Student(String name, int id, double gpa) {
        this.name = name;
        this.id = id;
        this.gpa = gpa;
        studentCount++;  // Increment the student count whenever a new object is created
    }

    // Instance method to display student information
    public void displayStudentInfo() {
        System.out.println("Student ID: " + id + ", Name: " + name + ", GPA: " + gpa);
    }

    // Static method to display the total number of students created
    public static void displayStudentCount() {
        System.out.println("Total students: " + studentCount);
    }
}

// Main class to demonstrate the functionality
public class StudentDemo {
    public static void main(String[] args) {
        // Create three Student objects with different names, IDs, and GPAs
        Student student1 = new Student("Alice", 101, 3.8);
        Student student2 = new Student("Bob", 102, 3.5);
        Student student3 = new Student("Charlie", 103, 3.9);

        // Call the instance method displayStudentInfo() on each object
        student1.displayStudentInfo();
        student2.displayStudentInfo();
        student3.displayStudentInfo();

        // Call the static method displayStudentCount() using the class name
        Student.displayStudentCount();
    }
}
