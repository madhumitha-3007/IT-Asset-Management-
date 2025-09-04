// File: Asset.java
public class Asset {
    private String assetId;
    private String type;
    private String model;
    private String status; // IN_STOCK, ASSIGNED, RETURNED, RETIRED
    private Employee assignedTo;

    public Asset(String assetId, String type, String model) {
        this.assetId = assetId;
        this.type = type;
        this.model = model;
        this.status = "IN_STOCK";
        this.assignedTo = null;
    }

    // Getters and Setters
    public String getAssetId() { return assetId; }
    public String getType() { return type; }
    public String getModel() { return model; }
    public String getStatus() { return status; }
    public Employee getAssignedTo() { return assignedTo; }

    public void setStatus(String status) { this.status = status; }
    public void setAssignedTo(Employee emp) { this.assignedTo = emp; }

    // Methods
    public void display() {
        System.out.println("Asset ID: " + assetId + ", Type: " + type +
                           ", Model: " + model + ", Status: " + status +
                           (assignedTo != null ? ", Assigned To: " + assignedTo.getName() : ""));
    }

    public double depreciation() {
        return 0.0; // base implementation
    }
}
