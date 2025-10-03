package abstraction;

class Motor extends Kendaraan implements BBM {
    private String tipe;

    public Motor(String nama, int kecepatan, String tipe) {
        super(nama, kecepatan);
        this.tipe = tipe;
    }

    @Override
    public void bergerak() {
        System.out.println(nama + " melaju di jalan kecil.");
    }

    @Override
    public void isiBahanBakar(String jenis, int liter) {
        System.out.println(nama + " diisi " + liter + " liter " + jenis);
    }
}