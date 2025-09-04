// File: AssetService.java
import java.util.*;

public class AssetService {
    private List<Asset> assets = new ArrayList<>();
    private List<Employee> employees = new ArrayList<>();
    private List<Assignment> assignments = new ArrayList<>();

    public void registerAsset(Asset asset) {
        assets.add(asset);
        System.out.println("Asset registered: " + asset.getAssetId());
    }

    public void registerEmployee(Employee emp) {
        employees.add(emp);
        System.out.println("Employee registered: " + emp.getName());
    }

    // Overloaded assignAsset methods
    public void assignAsset(String assetId, String empId) {
        Asset asset = findAsset(assetId);
        Employee emp = findEmployee(empId);
        if (asset != null && emp != null && asset.getStatus().equals("IN_STOCK")) {
            asset.setAssignedTo(emp);
            asset.setStatus("ASSIGNED");
            Assignment a = new Assignment("A" + (assignments.size() + 1), asset, emp, java.time.LocalDate.now());
            assignments.add(a);
            System.out.println("Asset " + assetId + " assigned to " + emp.getName());
        }
    }

    public void assignAsset(String assetId, Employee emp) {
        assignAsset(assetId, emp.getEmpId());
    }

    public void returnAsset(String assetId, String condition) {
        for (Assignment a : assignments) {
            if (a.getAsset().getAssetId().equals(assetId) && a.getAsset().getStatus().equals("ASSIGNED")) {
                a.endAssignment(java.time.LocalDate.now(), condition);
                System.out.println("Asset " + assetId + " returned.");
                break;
            }
        }
    }

    public void retireAsset(String assetId) {
        Asset asset = findAsset(assetId);
        if (asset != null) {
            asset.setStatus("RETIRED");
            System.out.println("Asset " + assetId + " retired.");
        }
    }

    public void auditReport() {
        System.out.println("---- Audit Report ----");
        for (Asset a : assets) {
            a.display();
        }
    }

    private Asset findAsset(String id) {
        for (Asset a : assets) if (a.getAssetId().equals(id)) return a;
        return null;
    }

    private Employee findEmployee(String id) {
        for (Employee e : employees) if (e.getEmpId().equals(id)) return e;
        return null;
    }
}
