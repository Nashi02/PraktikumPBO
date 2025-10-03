package abstraction;

abstract class Kendaraan {
    protected String nama;
    protected int kecepatan;

    public Kendaraan(String nama, int kecepatan) {
        this.nama = nama;
        this.kecepatan = kecepatan;
    }

    // abstract method
    public abstract void bergerak();

    // concrete method
    public void info() {
        System.out.println("Kendaraan: " + nama + ", Kecepatan: " + kecepatan + " km/jam");
    }
}