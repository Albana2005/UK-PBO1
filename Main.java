

public class Main {
    public static void main(String[] args) {

        Laptop laptop = new Laptop("Dell", "XPS 13", 16);
        laptop.setMerk("HP");
        System.out.println("Informasi Laptop:");
        laptop.info(true);
        laptop.hidupkan();
        System.out.println();


        Smartphone smartphone = new Smartphone("Apple", "iPhone 12", 12);
        System.out.println("Informasi Smartphone:");
        smartphone.info(true);
        smartphone.hidupkan();
        System.out.println();


        Tablet tablet = new Tablet("Samsung", "Galaxy Tab S7", 11.0);
        tablet.setModel("Galaxy Tab S8");
        System.out.println("Informasi Tablet:");
        tablet.info(true);
        tablet.hidupkan();
    }
}
