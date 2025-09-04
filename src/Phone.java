// File: Phone.java
public class Phone extends Asset {
    private String os;
    private int storage;

    public Phone(String assetId, String model, String os, int storage) {
        super(assetId, "Phone", model);
        this.os = os;
        this.storage = storage;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("  Specs: " + os + ", Storage: " + storage + "GB");
    }

    @Override
    public double depreciation() {
        return 0.25; // 25% yearly depreciation
    }
}
