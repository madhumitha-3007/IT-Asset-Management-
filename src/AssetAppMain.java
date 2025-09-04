// File: AssetAppMain.java
public class AssetAppMain {
    public static void main(String[] args) {
        AssetService service = new AssetService();

        // Register Employees
        Employee e1 = new Employee("E101", "Alice", "alice@company.com", "IT");
        Employee e2 = new Employee("E102", "Bob", "bob@company.com", "HR");
        service.registerEmployee(e1);
        service.registerEmployee(e2);

        // Register Assets
        Asset a1 = new Laptop("L001", "Dell XPS", 16, "Intel i7");
        Asset a2 = new Phone("P001", "iPhone 14", "iOS", 128);
        Asset a3 = new Monitor("M001", "Samsung", 27);

        service.registerAsset(a1);
        service.registerAsset(a2);
        service.registerAsset(a3);

        // Assign Assets
        service.assignAsset("L001", "E101");
        service.assignAsset("P001", e2);

        // Return Asset
        service.returnAsset("L001", "Good");

        // Retire Asset
        service.retireAsset("M001");

        // Audit Report
        service.auditReport();
    }
}
