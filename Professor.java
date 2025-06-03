public class Professor extends UserS {
    private int staffID;
    private float salary;
    private String department;

    public Professor() {}

    public void setStaffID(int staffID) { this.staffID = staffID; }
    public int getStaffID() { return staffID; }

    public void setSalary(float salary) { this.salary = salary; }
    public float getSalary() { return salary; }

    public void setDepartment(String department) { this.department = department; }
    public String getDepartment() { return department; }
}