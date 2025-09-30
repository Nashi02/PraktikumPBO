import java.util.ArrayList;

public class ContohArrayList {
    public static void main(String[] args) {
        ArrayList<String> daftarNama = new ArrayList<>();
        
        // Menambahkan elemen
        daftarNama.add("Andi");
        daftarNama.add("Budi");
        daftarNama.add("Cici");

        // Menampilkan semua elemen
        System.out.println("Daftar Nama: " + daftarNama);

        // Mengakses elemen berdasarkan index
        System.out.println("Nama ke-2: " + daftarNama.get(1));

        // Menghapus elemen
        daftarNama.remove("Budi");
        System.out.println("Setelah dihapus: " + daftarNama);

        // Looping
        for (String nama : daftarNama) {
            System.out.println("Nama: " + nama);
        }
    }
}
