

public class Tablet extends ProdukElektronik {
    private double ukuranLayar;

    public Tablet(String merk, String model, double ukuranLayar) {
        super(merk, model);
        this.ukuranLayar = ukuranLayar;
    }

    public void info(boolean withScreenSize) {
        super.info();
        if (withScreenSize) {
            System.out.println("Ukuran Layar: " + ukuranLayar + " inci");
        }
    }

    @Override
    public void info() {
        super.info();
        System.out.println("Ukuran Layar: " + ukuranLayar + " inci");
    }

    public void hidupkan() {
        System.out.println("Tablet dinyalakan.");
    }
}
