import java.util.*;

public class Registration {
    private Student student;
    private List<Course> registeredCourses = new ArrayList<>();

    public Registration() {}

    public void login(String email, String password) {
        System.out.println("Logged in as: " + email);
    }

    public void displayCourses(List<Course> courses) {
        for (Course c : courses) {
            System.out.println(c.getCourse() + " - " + c.getCourseName());
        }
    }

    public void addCourse(Course course) {
        registeredCourses.add(course);
        System.out.println("Course added: " + course.getCourseName());
    }

    public void dropCourse(String courseCode) {
        registeredCourses.removeIf(c -> c.getCourse().equals(courseCode));
        System.out.println("Course dropped: " + courseCode);
    }

    public void viewRegisteredCourse() {
        for (Course c : registeredCourses) {
            System.out.println("Registered: " + c.getCourseName());
        }
    }

    public void createNewCourse(String code, String name, String start, String end) {
        Course c = new Course();
        c.setCourse(code);
        c.setCourseName(name);
        c.setStartDate(start);
        c.setEndDate(end);
        System.out.println("New course created: " + name);
    }

    public void modifyCourse(Course course, String newName) {
        course.setCourseName(newName);
        System.out.println("Course name changed to: " + newName);
    }

    public void removeCourse(String courseCode) {
        dropCourse(courseCode);
    }
}