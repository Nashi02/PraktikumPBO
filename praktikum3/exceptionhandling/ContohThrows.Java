import java.io.*;

public class ContohThrows {
    // Method dengan deklarasi throws
    static void bacaFile(String namaFile) throws IOException {
        FileReader file = new FileReader(namaFile);
        BufferedReader br = new BufferedReader(file);
        System.out.println(br.readLine());
        br.close();
    }

    public static void main(String[] args) {
        try {
            bacaFile("data.txt"); // file harus ada
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan saat membaca file: " + e.getMessage());
        }
    }
}
