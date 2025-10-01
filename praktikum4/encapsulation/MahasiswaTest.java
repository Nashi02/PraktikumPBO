package encapsulation;

public class MahasiswaTest {
    public static void main(String[] args) {
        // Membuat objek dari class Mahasiswa
        Mahasiswa mhs = new Mahasiswa();

        // Menggunakan setter untuk memberi nilai
        mhs.setNama("Ivan Febriansyah");
        mhs.setNim("2403077");
        mhs.setUmur(20);

        // Menggunakan getter untuk menampilkan nilai
        System.out.println("Nama Mahasiswa: " + mhs.getNama());
        System.out.println("NIM Mahasiswa : " + mhs.getNim());
        System.out.println("Umur Mahasiswa: " + mhs.getUmur());
    }
}
