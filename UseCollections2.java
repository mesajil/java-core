import java.util.ArrayList;
import java.util.Collections;

import classes.Student;

public class UseCollections2 {
    public static void main(String[] args) {
        // Create an ArrayList and add Student elements
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(1, "Alice", 20));
        students.add(new Student(2, "Bob", 22));
        students.add(new Student(3, "Charlie", 19));
        students.add(new Student(4, "Diana", 21));
        students.add(new Student(5, "Eve", 23));

        // Sorting
        Collections.sort(students, (s1, s2) -> {
            return Double.compare(s1.getMark(), s2.getMark());
        });

        // Print each student using a for loop
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
