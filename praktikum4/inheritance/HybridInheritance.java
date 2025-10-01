package inheritance;

public class HybridInheritance {
    public static void main(String[] args) {
        MahasiswaRiset mr = new MahasiswaRiset();
        mr.nama = "Dewi";
        mr.nim = "556677";
        mr.aturTopik("Kecerdasan Buatan");

        Dosen d = new Dosen();
        d.nama = "Pak Budi";
        d.mataKuliah = "Fisika";

        mr.tampilMahasiswa();
        mr.tampilTopik();
        d.tampilDosen();
    }
}
