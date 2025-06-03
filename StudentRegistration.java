import java.util.*;

public class StudentRegistration {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Alice");
        student.setEmail("alice@example.com");
        student.setPassword("1234");
        student.setStdID(101);

        Registration reg = new Registration();
        reg.login(student.getEmail(), student.getPassword());

        Course course1 = new Course();
        course1.setCourse("CSE101");
        course1.setCourseName("Introduction to Programming");
        course1.setStartDate("2025-01-01");
        course1.setEndDate("2025-04-30");

        Course course2 = new Course();
        course2.setCourse("MAT102");
        course2.setCourseName("Calculus I");
        course2.setStartDate("2025-01-01");
        course2.setEndDate("2025-04-30");

        reg.addCourse(course1);
        reg.addCourse(course2);

        reg.viewRegisteredCourse();
        reg.dropCourse("MAT102");
        reg.viewRegisteredCourse();
    }
}