// File: Laptop.java
public class Laptop extends Asset {
    private int ramSize; // GB
    private String processor;

    public Laptop(String assetId, String model, int ramSize, String processor) {
        super(assetId, "Laptop", model);
        this.ramSize = ramSize;
        this.processor = processor;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("  Specs: " + ramSize + "GB RAM, Processor: " + processor);
    }

    @Override
    public double depreciation() {
        return 0.15; // 15% yearly depreciation
    }
}
