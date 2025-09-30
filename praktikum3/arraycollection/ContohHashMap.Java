import java.util.HashMap;

public class ContohHashMap {
    public static void main(String[] args) {
        HashMap<String, String> mahasiswa = new HashMap<>();

        // Menambahkan data
        mahasiswa.put("123", "Andi");
        mahasiswa.put("124", "Budi");
        mahasiswa.put("125", "Cici");

        // Menampilkan semua data
        System.out.println("Data Mahasiswa: " + mahasiswa);

        // Mengakses data berdasarkan key
        System.out.println("NIM 124 adalah: " + mahasiswa.get("124"));

        // Menghapus data
        mahasiswa.remove("123");
        System.out.println("Setelah dihapus: " + mahasiswa);

        // Looping key-value
        for (String nim : mahasiswa.keySet()) {
            System.out.println("NIM: " + nim + ", Nama: " + mahasiswa.get(nim));
        }
    }
}
