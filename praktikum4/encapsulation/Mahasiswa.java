package encapsulation;

// Class Mahasiswa dengan encapsulation
public class Mahasiswa {
    // Atribut dibuat private agar tidak bisa diakses langsung
    private String nama;
    private String nim;
    private int umur;

    // Non-access modifier: final (contoh)
    private final String universitas = "Universitas Teknologi"; 

    // Setter (untuk memberi/mengubah data)
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setUmur(int umur) {
        if (umur > 0) { // Validasi sederhana
            this.umur = umur;
        } else {
            System.out.println("Umur tidak valid!");
        }
    }

    // Getter (untuk mengambil data)
    public String getNama() {
        return nama;
    }

    public String getNim() {
        return nim;
    }

    public int getUmur() {
        return umur;
    }

    public String getUniversitas() {
        return universitas; // hanya getter karena final (tidak bisa diubah)
    }
}
