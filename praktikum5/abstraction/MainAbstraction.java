package abstraction;

public class MainAbstraction {
    public static void main(String[] args) {
        Kendaraan k1 = new Mobil("Toyota Avanza", 120, 4);
        Kendaraan k2 = new Motor("Yamaha NMAX", 90, "Skuter");

        k1.info();
        k1.bergerak();
        ((Mobil) k1).isiBahanBakar("Bensin", 40);

        System.out.println();

        k2.info();
        k2.bergerak();
        ((Motor) k2).isiBahanBakar("Pertalite", 5);
    }
}
