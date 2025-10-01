package inheritance;

public class MultipleInheritance {
    public static void main(String[] args) {
        MahasiswaAkademik ma = new MahasiswaAkademik();
        ma.nama = "Budi";
        ma.nim = "54321";
        ma.aturJurusan("Informatika");

        ma.tampilMahasiswa();
        ma.tampilJurusan();
    }
}
