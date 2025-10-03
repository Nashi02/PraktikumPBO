package abstraction;

class Mobil extends Kendaraan implements BBM {
    private int jumlahPintu;

    public Mobil(String nama, int kecepatan, int jumlahPintu) {
        super(nama, kecepatan);
        this.jumlahPintu = jumlahPintu;
    }

    @Override
    public void bergerak() {
        System.out.println(nama + " melaju di jalan raya.");
    }

    @Override
    public void isiBahanBakar(String jenis, int liter) {
        System.out.println(nama + " diisi " + liter + " liter " + jenis);
    }
}