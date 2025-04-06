import java.util.ArrayList;
import java.util.List;

import classes.Student;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Alice", 85.5));
        students.add(new Student(2, "Bob", 90.0));
        students.add(new Student(3, "Charlie", 78.0));

        for (Student student : students) {
            System.out.println("ID: " + student.getId() + ", Name: " + student.getName() + ", Mark: " + student.getMark());
        }
    }
}
