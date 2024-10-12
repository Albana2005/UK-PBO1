

public class Smartphone extends ProdukElektronik {
    private int kamera;

    public Smartphone(String merk, String model, int kamera) {
        super(merk, model);
        this.kamera = kamera;
    }

    public void info(boolean withCamera) {
        super.info();
        if (withCamera) {
            System.out.println("Kamera: " + kamera + " MP");
        }
    }

    @Override
    public void info() {
        super.info();
        System.out.println("Kamera: " + kamera + " MP");
    }

    public void hidupkan() {
        System.out.println("Smartphone dinyalakan.");
    }
}
