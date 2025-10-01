package inheritance;

// Kumpulan class dasar

// Orang -> parent class
class Orang {
    String nama;

    void tampilNama() {
        System.out.println("Nama: " + nama);
    }
}

// Mahasiswa -> turunan dari Orang
class Mahasiswa extends Orang {
    String nim;

    void tampilMahasiswa() {
        tampilNama();
        System.out.println("NIM : " + nim);
    }
}

// Lulusan -> turunan dari Mahasiswa (Multilevel)
class Lulusan extends Mahasiswa {
    String gelar;

    void tampilLulusan() {
        tampilMahasiswa();
        System.out.println("Gelar: " + gelar);
    }
}

// Dosen -> turunan dari Orang (Hierarchical)
class Dosen extends Orang {
    String mataKuliah;

    void tampilDosen() {
        tampilNama();
        System.out.println("Mengajar: " + mataKuliah);
    }
}

// Interface untuk multiple/hybrid
interface Akademik {
    void aturJurusan(String jurusan);
    void tampilJurusan();
}

interface Penelitian {
    void aturTopik(String topik);
    void tampilTopik();
}

// Mahasiswa Akademik (implement interface)
class MahasiswaAkademik extends Mahasiswa implements Akademik {
    String jurusan;

    public void aturJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public void tampilJurusan() {
        System.out.println("Jurusan: " + jurusan);
    }
}

// Mahasiswa Riset (hybrid inheritance)
class MahasiswaRiset extends Mahasiswa implements Penelitian {
    String topik;

    public void aturTopik(String topik) {
        this.topik = topik;
    }

    public void tampilTopik() {
        System.out.println("Topik Riset: " + topik);
    }
}
