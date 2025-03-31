//Design a Smart University Management System in Java using class variables (static), instance variables, methods, this keyword, method overloading, inheritance, super keyword, and method overriding by implementing a Person class (with name, age, and email), a Student subclass (with studentID and course, using constructor overloading and a static counter for total students), and a Faculty subclass (with facultyID and department, using super to call the parent constructor and a static counter for total faculty), where both subclasses override the displayInfo() method, and the University class should instantiate multiple Student and Faculty objects, display their details, and print the total count of students and faculty.
// Base class: Person
class Person {
    protected String name;
    protected int age;
    protected String email;

    // Constructor
    public Person(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    // Method to display information (Overridden by subclasses)
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Email: " + email);
    }
}

// Student subclass
class Student extends Person {
    private static int studentCount = 0; // Static counter
    private int studentID;
    private String course;

    // Constructor Overloading
    public Student(String name, int age, String email, String course) {
        super(name, age, email);
        this.course = course;
        this.studentID = ++studentCount; // Auto-increment student ID
    }

    // Overriding displayInfo() method
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Student ID: " + studentID);
        System.out.println("Course: " + course);
    }

    // Static method to get total student count
    public static int getTotalStudents() {
        return studentCount;
    }
}

// Faculty subclass
class Faculty extends Person {
    private static int facultyCount = 0; // Static counter
    private int facultyID;
    private String department;

    // Constructor using super keyword
    public Faculty(String name, int age, String email, String department) {
        super(name, age, email);
        this.department = department;
        this.facultyID = ++facultyCount; // Auto-increment faculty ID
    }

    // Overriding displayInfo() method
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Faculty ID: " + facultyID);
        System.out.println("Department: " + department);
    }

    // Static method to get total faculty count
    public static int getTotalFaculty() {
        return facultyCount;
    }
}

// University class to test the system
public class Management {
    public static void main(String[] args) {
        // Creating Student objects
        Student s1 = new Student("Alice Johnson", 20, "alice@example.com", "Computer Science");
        Student s2 = new Student("Bob Smith", 22, "bob@example.com", "Mathematics");

        // Creating Faculty objects
        Faculty f1 = new Faculty("Dr. John Doe", 45, "johndoe@example.com", "Physics");
        Faculty f2 = new Faculty("Prof. Mary Lee", 50, "marylee@example.com", "Engineering");

        // Displaying details
        System.out.println("----- Student Details -----");
        s1.displayInfo();
        System.out.println();
        s2.displayInfo();
        System.out.println();

        System.out.println("----- Faculty Details -----");
        f1.displayInfo();
        System.out.println();
        f2.displayInfo();
        System.out.println();

        // Printing total count of students and faculty
        System.out.println("Total Students: " + Student.getTotalStudents());
        System.out.println("Total Faculty: " + Faculty.getTotalFaculty());
    }
}

