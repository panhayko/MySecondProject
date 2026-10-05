class Student {
    String name;
    int age;

    void displayInfo() {
        System.out.println("Student Name: " + name + ", Age: " + age);
    }
}

public class OOPExample {
    public static void main(String[] args) {
        
        Student student1 = new Student();
        student1.name = "Aung Aung";
        student1.age = 20;

        student1.displayInfo();
    }
}