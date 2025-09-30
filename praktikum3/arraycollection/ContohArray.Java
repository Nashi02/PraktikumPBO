public class ContohArray {
    public static void main(String[] args) {
        // Membuat array bertipe String dengan 3 elemen
        String[] nama = {"Andi", "Budi", "Cici"};
        
        // Menampilkan isi array
        for (int i = 0; i < nama.length; i++) {
            System.out.println("Nama ke-" + (i+1) + ": " + nama[i]);
        }
    }
}