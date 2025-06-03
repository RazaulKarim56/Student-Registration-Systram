public class Course {
    private String courseCode;
    private String courseName;
    private String startDate;
    private String endDate;

    public Course() {}

    public void setCourse(String courseCode) { this.courseCode = courseCode; }
    public String getCourse() { return courseCode; }

    public void setCourseName(String courseName) { this.courseName = courseName; }
    public String getCourseName() { return courseName; }

    public void setStartDate(String startDate) { this.startDate = startDate; }
    public String getStartDate() { return startDate; }

    public void setEndDate(String endDate) { this.endDate = endDate; }
    public String getEndDate() { return endDate; }
}