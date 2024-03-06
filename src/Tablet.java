public class Tablet {
    private int screenSize;
    private int memory;
    private boolean stylusIncluded;

    public Tablet(int screenSize, int memory, boolean stylusIncluded) {
        this.screenSize = screenSize;
        this.memory = memory;
        this.stylusIncluded = stylusIncluded;
    }

    public int getScreenSize() {
        return screenSize;
    }

    public int getMemory() {
        return memory;
    }

    public boolean isStylusIncluded() {
        return stylusIncluded;
    }

    public void installOperatingSystem() {
        System.out.println("installing OS...");
    }
}
