import java.util.Comparator;

public class Pc implements Comparable <Pc>, Comparator<Pc> {
    @Override
    public int compareTo(Pc o) {
        return 0;
    }

    //instance variables
    private int id;
    private String cpu;
    private String ram;
    private String storage;
    private String lcdMaker;
    private boolean hasGpu;

    //constructors
    Pc() {
        this.id = 0;
        this.cpu = "";
        this.ram = "";
        this.storage = "";
        this.lcdMaker = "";
        this.hasGpu = false;
    }

    public Pc(int id, String cpu, String ram, String storage, String lcdMaker, boolean hasGpu) {
        this.id = id;
        this.cpu = cpu;
        this.ram = ram;
        this.storage = storage;
        this.lcdMaker = lcdMaker;
        this.hasGpu = hasGpu;
    }
    Pc(Pc p){
        this.id = p.id;
        this.cpu = p.cpu;
        this.ram = p.ram;
        this.storage = p.storage;
        this.lcdMaker = p.lcdMaker;
        this.hasGpu = p.hasGpu;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getStorage() {
        return storage;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }

    public String getLcdMaker() {
        return lcdMaker;
    }

    public void setLcdMaker(String lcdMaker) {
        this.lcdMaker = lcdMaker;
    }

    public boolean getGpu() {
        return hasGpu;
    }

    public void setGpu(boolean hasGpu) {
        this.hasGpu = hasGpu;
    }


    //methods
    @Override
    public String toString() {
        return String.format("Id: %d\nCPU: %s\nRAM: %s\nStorage: %s\nLCD Maker: %s\nGPU: %b\n", id, cpu, ram, storage, lcdMaker, hasGpu);
        //returns a formatted String
    }

    @Override
    public Object clone() {

        Pc clone = new Pc();
        return clone;
    }


    @Override
    public int compare(Pc pc1, Pc pc2) {
        int flag = 0;
        if(pc1.getId()< pc2.getId()){
            return 1;
        }
        if(pc1.getId()> pc2.getId()){
            return -1;
        }
        return flag;
    }

    @Override
    public boolean equals(Object o){
        Pc p = (Pc)o;
        if (p == null) return false;

        return this.id == p.id && this.cpu.equals(p.cpu) && this.ram.equals(p.ram) && this.storage.equals(p.storage)
                && this.lcdMaker.equals(p.lcdMaker) && this.hasGpu == p.hasGpu;
    }
}

