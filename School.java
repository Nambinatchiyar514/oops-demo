// ABSTRACTION
abstract class Person {
    // ENCAPSULATION
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getters & Setters → Encapsulation
    public String getName() { 
        return name; 
        }
    public int getAge() {
         return age; 
         }

    // Abstract method → Abstraction
    abstract void displayInfo();

    // Method OVERLOADING
    public void greet() {
        System.out.println(name + " hello ");
    }

    public void greet(String place) {
        System.out.println(name + "  hello " );
    }
}

// INHERITANCE
class Student extends Person {
    private String grade;

    public Student(String name, int age, String grade) {
        super(name, age); // Call parent constructor
        this.grade = grade;
    }

    // Method OVERRIDING → Polymorphism
    @Override
    void displayInfo() {
        System.out.println("Student: " + getName() + ", Age: " + getAge() + ", Grade: " + grade);
    }
}

// INHERITANCE
class Teacher extends Person {
    private String subject;

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    // Method OVERRIDING → Polymorphism
    @Override
    void displayInfo() {
        System.out.println("Teacher: " + getName() + ", Age: " + getAge() + ", Subject: " + subject);
    }
}

// MAIN CLASS
class SchoolApp {
    public static void main(String[] args) {
        // UPCASTING → Polymorphism
        Person s = new Student("nandhini", 15, "10th Grade");
        Person t = new Teacher("laks", 30, "Maths");

        s.displayInfo(); // Calls Student version
        t.displayInfo(); // Calls Teacher version

        // Method OVERLOADING
        s.greet("school");
        t.greet("School");
    }
}
