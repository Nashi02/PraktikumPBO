public class MainPolymorphism {
    public static void main(String[] args) {
        Hewan h1 = new Kucing("Mimi", 2, "Anggora");
        Hewan h2 = new Anjing("Buddy", 3, "Bulldog");

        // Polymorphism overriding
        h1.suara();
        h2.suara();

        h1.getInfo();
        h2.getInfo();

        // Polymorphism overloading
        h1.beriMakan("Ikan");
        h2.beriMakan("Daging", 2);
    }
}

class Hewan {
    protected String nama;
    protected int umur;

    public Hewan(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    public void suara() {
        System.out.println("Hewan mengeluarkan suara...");
    }

    // Method overloading: beri makan
    public void beriMakan(String makanan) {
        System.out.println(nama + " diberi makan " + makanan);
    }

    public void beriMakan(String makanan, int jumlah) {
        System.out.println(nama + " diberi " + jumlah + " porsi " + makanan);
    }

    public void getInfo() {
        System.out.println("Nama: " + nama + ", Umur: " + umur + " tahun");
    }
}

class Kucing extends Hewan {
    private String ras;

    public Kucing(String nama, int umur, String ras) {
        super(nama, umur);
        this.ras = ras;
    }

    @Override
    public void suara() {
        System.out.println(nama + " mengeong: Meong!");
    }

    @Override
    public void getInfo() {
        System.out.println("Kucing bernama " + nama + ", umur " + umur + " tahun, ras " + ras);
    }
}

class Anjing extends Hewan {
    private String jenis;

    public Anjing(String nama, int umur, String jenis) {
        super(nama, umur);
        this.jenis = jenis;
    }

    @Override
    public void suara() {
        System.out.println(nama + " menggonggong: Guk guk!");
    }

    @Override
    public void getInfo() {
        System.out.println("Anjing bernama " + nama + ", umur " + umur + " tahun, jenis " + jenis);
    }
}
