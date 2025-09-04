// File: Monitor.java
public class Monitor extends Asset {
    private int size; // inches

    public Monitor(String assetId, String model, int size) {
        super(assetId, "Monitor", model);
        this.size = size;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("  Specs: " + size + " inch display");
    }

    @Override
    public double depreciation() {
        return 0.10; // 10% yearly depreciation
    }
}
