

public class Laptop extends ProdukElektronik {
    private int ram;

    public Laptop(String merk, String model, int ram) {
        super(merk, model);
        this.ram = ram;
    }

    public void info(boolean withRam) {
        super.info();
        if (withRam) {
            System.out.println("RAM: " + ram + " GB");
        }
    }

    @Override
    public void info() {
        super.info();
        System.out.println("RAM: " + ram + " GB");
    }

    public void hidupkan() {
        System.out.println("Laptop dinyalakan.");
    }
}
