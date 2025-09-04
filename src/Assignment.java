// File: Assignment.java
import java.time.LocalDate;

public class Assignment {
    private String assignmentId;
    private Asset asset;
    private Employee employee;
    private LocalDate startDate;
    private LocalDate endDate;
    private String condition;

    public Assignment(String assignmentId, Asset asset, Employee employee, LocalDate startDate) {
        this.assignmentId = assignmentId;
        this.asset = asset;
        this.employee = employee;
        this.startDate = startDate;
        this.condition = "Good";
    }

    // Getters
    public String getAssignmentId() { return assignmentId; }
    public Asset getAsset() { return asset; }
    public Employee getEmployee() { return employee; }

    public void endAssignment(LocalDate endDate, String condition) {
        this.endDate = endDate;
        this.condition = condition;
        asset.setStatus("RETURNED");
        asset.setAssignedTo(null);
    }

    public void display() {
        System.out.println("Assignment ID: " + assignmentId + ", Asset: " + asset.getAssetId() +
                           ", Employee: " + employee.getName() + ", Start: " + startDate +
                           (endDate != null ? ", End: " + endDate + ", Condition: " + condition : ""));
    }
}
