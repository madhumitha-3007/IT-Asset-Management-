// File: Employee.java
public class Employee {
    private String empId;
    private String name;
    private String email;
    private String department;

    public Employee(String empId, String name, String email, String department) {
        this.empId = empId;
        this.name = name;
        this.email = email;
        this.department = department;
    }

    // Getters
    public String getEmpId() { return empId; }
    public String getName() { return name; }
    public String getEmail() { return email; }
    public String getDepartment() { return department; }

    public void display() {
        System.out.println("Employee ID: " + empId + ", Name: " + name +
                           ", Email: " + email + ", Dept: " + department);
    }
}
