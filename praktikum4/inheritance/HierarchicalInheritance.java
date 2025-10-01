package inheritance;

public class HierarchicalInheritance {
    public static void main(String[] args) {
        Mahasiswa m = new Mahasiswa();
        m.nama = "Andi";
        m.nim = "112233";

        Dosen d = new Dosen();
        d.nama = "Pak Joko";
        d.mataKuliah = "Matematika";

        m.tampilMahasiswa();
        d.tampilDosen();
    }
}
