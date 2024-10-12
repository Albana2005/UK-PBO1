

public class ProdukElektronik {
    private String merk;
    private String model;

    public ProdukElektronik(String merk, String model) {
        this.merk = merk;
        this.model = model;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getMerk() {
        return merk;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void info() {
        System.out.println("Merk: " + merk + ", Model: " + model);
    }
}
